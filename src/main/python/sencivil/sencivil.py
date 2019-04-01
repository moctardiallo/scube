import graphene
from flask import Flask
from flask_graphql import GraphQLView

from pyspark.sql import SparkSession
from pyspark.conf import SparkConf

app = Flask(__name__)

spark = SparkSession.builder \
    .master("local") \
    .appName("Sencivil") \
    .config("spark.driver.allowMultipleContexts", "true") \
    .getOrCreate()
print(spark)
print("Hello Pyspark throught spark-submit")

r = spark.createDataFrame([{"greeting": "Whatsup"}])


class Query(graphene.ObjectType):
    greet = graphene.String(name=graphene.String(default_value="stranger"))

    def resolve_greet(self, info, name):
        greeter = r.first().asDict()['greeting']
        return greeter + ' ' + name


schema = graphene.Schema(query=Query)

app.add_url_rule(
    "/graphql", view_func=GraphQLView.as_view('graphql', schema=schema, graphiql=True))


if __name__ == "__main__":
    app.run(debug=True)

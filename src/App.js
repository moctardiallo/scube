import React, { Component } from "react";

import Plot from "react-plotly.js";

class App extends Component {
  render() {
    return (
      <div className="App">
        <Plot
          data={[
            {
              x: [1, 2, 3],
              y: [2, 6, 3],
              type: "scatter",
              mode: "lines+points",
              marker: { color: "red" },
              name: "Scatter"
            },
            { type: "bar", x: [1, 2, 3], y: [2, 5, 3], name: "Bars" }
          ]}
          layout={{ width: 320, height: 240, title: "A Fancy Plot" }}
        />
      </div>
    );
  }
}

export default App;

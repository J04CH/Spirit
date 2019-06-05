package com.JoJoProductions.Spirit.Graph.LineChart;

import com.JoJoProductions.Spirit.File.SubClass.StreamWeight;

import java.awt.Color;
import java.awt.BasicStroke;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class XYLineChartWeight extends ApplicationFrame
{
  public XYLineChartWeight()
  {
    super("Spirits (États d'âme)");
    JFreeChart xylineChart = ChartFactory.createXYLineChart(
    "Weight Record",
    "Time",
    "Weight (in kg)",
    createDataset(),
    PlotOrientation.VERTICAL,
    true, true, false);

    ChartPanel chartPanel = new ChartPanel(xylineChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(480, 290));
    final XYPlot plot = xylineChart.getXYPlot();

    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
    renderer.setSeriesPaint(0, Color.ORANGE);
    renderer.setSeriesStroke(0, new BasicStroke(3.0f));
    plot.setRenderer(renderer);
    setContentPane(chartPanel);
  }

  private XYDataset createDataset()
  {
    StreamWeight StreamWeight = new StreamWeight();
    StreamWeight.Read();

    final XYSeries Weight = new XYSeries("Weight");

    int count = 1;

    for (int i = 0; i < StreamWeight.getList().size(); i++)
    {
      Weight.add(count++, Float.parseFloat(StreamWeight.getList().get(i)));
    }

    final XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(Weight);

    return dataset;
  }
}

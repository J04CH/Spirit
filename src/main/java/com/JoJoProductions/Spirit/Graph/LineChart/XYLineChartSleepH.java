package com.JoJoProductions.Spirit.Graph.LineChart;

import com.JoJoProductions.Spirit.File.SubClass.StreamSleepH;

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

public class XYLineChartSleepH extends ApplicationFrame
{
  public XYLineChartSleepH()
  {
    super("Spirits (États d'âme)");
    JFreeChart xylineChart = ChartFactory.createXYLineChart(
    "Sleep Record",
    "Time",
    "Sleep (in hours)",
    createDataset(),
    PlotOrientation.VERTICAL,
    true, true, false);

    ChartPanel chartPanel = new ChartPanel(xylineChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(480, 300));
    final XYPlot plot = xylineChart.getXYPlot();

    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
    renderer.setSeriesPaint(0, Color.CYAN);
    renderer.setSeriesStroke(0, new BasicStroke(3.0f));
    plot.setRenderer(renderer);
    setContentPane(chartPanel);
  }

  private XYDataset createDataset()
  {
    StreamSleepH StreamSleepH = new StreamSleepH();
    StreamSleepH.Read();

    final XYSeries Sleep = new XYSeries("Sleep");

    double count = 1.0;
    double value = 0.0;

    for (int i = 0; i < StreamSleepH.getList().size(); i++)
    {
      Sleep.add(count++, Float.parseFloat(StreamSleepH.getList().get(i)));
    }

    final XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(Sleep);

    return dataset;
  }
}

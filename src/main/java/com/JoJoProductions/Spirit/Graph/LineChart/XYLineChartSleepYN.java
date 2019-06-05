package com.JoJoProductions.Spirit.Graph.LineChart;

import com.JoJoProductions.Spirit.File.SubClass.StreamSleepYN;

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

public class XYLineChartSleepYN extends ApplicationFrame
{
  public XYLineChartSleepYN()
  {
    super("Spirits (États d'âme)");
    JFreeChart xylineChart = ChartFactory.createXYLineChart(
    "Sleep Growth",
    "Time",
    "Progression",
    createDataset(),
    PlotOrientation.VERTICAL,
    true, true, false);

    ChartPanel chartPanel = new ChartPanel(xylineChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(480, 290));
    final XYPlot plot = xylineChart.getXYPlot();

    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
    renderer.setSeriesPaint(0, Color.BLUE);
    renderer.setSeriesStroke(0, new BasicStroke(3.0f));
    plot.setRenderer(renderer);
    setContentPane(chartPanel);
  }

  private XYDataset createDataset()
  {
  final XYSeries Sleep = new XYSeries("Sleep");

  StreamSleepYN StreamSleepYN = new StreamSleepYN();
  StreamSleepYN.Read();

  double count = 1.0;
  double value = 0.0;

  for (int i = 0; i < StreamSleepYN.getList().size() + 1; i++)
  {
    if (i == 0)
    {
      Sleep.add(0.0, 0.0);
    }

    if (i == StreamSleepYN.getList().size())
    {
      if (StreamSleepYN.getList().get(i-1).equals("yes=Sleep"))
      {
        Sleep.add(count++, value++);
      }

      if (StreamSleepYN.getList().get(i-1).equals("no=Sleep"))
      {
        Sleep.add(count++, value--);
      }
    }

    else if (StreamSleepYN.getList().get(i).equals("yes=Sleep"))
    {
      Sleep.add(count++, value++);
    }

    else if (StreamSleepYN.getList().get(i).equals("no=Sleep"))
    {
      Sleep.add(count++, value--);
    }
  }

  final XYSeriesCollection dataset = new XYSeriesCollection();
  dataset.addSeries(Sleep);

  return dataset;
  }
}

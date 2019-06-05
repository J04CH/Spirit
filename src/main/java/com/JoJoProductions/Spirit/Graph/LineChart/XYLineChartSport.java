package com.JoJoProductions.Spirit.Graph.LineChart;

import com.JoJoProductions.Spirit.File.SubClass.StreamSport;

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

public class XYLineChartSport extends ApplicationFrame
{
  public XYLineChartSport()
  {
    super("Spirits (États d'âme)");
    JFreeChart xylineChart = ChartFactory.createXYLineChart(
    "Sport Growth",
    "Time",
    "Sport Activity",
    createDataset(),
    PlotOrientation.VERTICAL,
    true, true, false);

    ChartPanel chartPanel = new ChartPanel(xylineChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(480, 300));
    final XYPlot plot = xylineChart.getXYPlot();

    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
    renderer.setSeriesPaint(0, Color.MAGENTA);
    renderer.setSeriesStroke(0, new BasicStroke(3.0f));
    plot.setRenderer(renderer);
    setContentPane(chartPanel);
  }

  private XYDataset createDataset()
  {
    StreamSport StreamSport = new StreamSport();
    StreamSport.Read();

    final XYSeries Sport = new XYSeries("Sport");

    double count = 1.0;
    double value = 0.0;

    for (int i = 0; i < StreamSport.getList().size() + 1; i++)
    {
      if (i == 0)
      {
        Sport.add(0.0, 0.0);
      }

      if (i == StreamSport.getList().size())
      {
        if (StreamSport.getList().get(i-1).equals("yes=Sport"))
        {
          Sport.add(count++, value++);
        }

        if (StreamSport.getList().get(i-1).equals("no=Sport"))
        {
          Sport.add(count++, value--);
        }
      }

      else if (StreamSport.getList().get(i).equals("yes=Sport"))
      {
        Sport.add(count++, value++);
      }

      else if (StreamSport.getList().get(i).equals("no=Sport"))
      {
        Sport.add(count++, value--);
      }
    }

    final XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(Sport);

    return dataset;
  }
}

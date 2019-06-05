package com.JoJoProductions.Spirit.Graph.LineChart;

import com.JoJoProductions.Spirit.File.SubClass.StreamEmotion;

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

public class XYLineChartEmotion extends ApplicationFrame
{
  public XYLineChartEmotion()
  {
    super("Spirits (États d'âme)");
    JFreeChart xylineChart = ChartFactory.createXYLineChart(
    "Spirits Growth",
    "Time",
    "Progression",
    createDataset(),
    PlotOrientation.VERTICAL,
    false, true, false);

    ChartPanel chartPanel = new ChartPanel(xylineChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(480, 300));
    final XYPlot plot = xylineChart.getXYPlot();

    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
    renderer.setSeriesPaint(0, Color.BLACK);
    renderer.setSeriesStroke(0, new BasicStroke(3.0f));
    plot.setRenderer(renderer);
    setContentPane(chartPanel);
  }

  private XYDataset createDataset()
  {
    StreamEmotion StreamEmotion = new StreamEmotion();
    StreamEmotion.Read();

    final XYSeries Spirits = new XYSeries("Spirits");

    double count = 1.0;
    double value = 0.0;

    for (int i = 0; i < StreamEmotion.getList().size() + 1; i++)
    {
      if (i == 0)
      {
        Spirits.add(0.0 , 0.0);
      }

      if (i == StreamEmotion.getList().size())
      {
        if (StreamEmotion.getList().get(i-1).equals("1"))
        {
          Spirits.add(count++, value--);
        }

        if (StreamEmotion.getList().get(i-1).equals("2"))
        {
          Spirits.add(count++, value);
        }

        if (StreamEmotion.getList().get(i-1).equals("3"))
        {
          Spirits.add(count++, value++);
        }
      }

      else if (StreamEmotion.getList().get(i).equals("1"))
      {
        Spirits.add(count++, value--);
      }

      else if (StreamEmotion.getList().get(i).equals("2"))
      {
        Spirits.add(count++, value);
      }

      else if (StreamEmotion.getList().get(i).equals("3"))
      {
        Spirits.add(count++, value++);
      }
    }

    final XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(Spirits);

    return dataset;
  }
}

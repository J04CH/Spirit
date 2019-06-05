package com.JoJoProductions.Spirit.Graph.LineChart;

import com.JoJoProductions.Spirit.File.SubClass.StreamOptional;

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

public class XYLineChartOptional extends ApplicationFrame
{
  public XYLineChartOptional()
  {
    super("Spirits (États d'âme)");
    JFreeChart xylineChart = ChartFactory.createXYLineChart(
    "Chemical Record",
    "Time",
    "Chemical Usage",
    createDataset(),
    PlotOrientation.VERTICAL,
    true, true, false);

    ChartPanel chartPanel = new ChartPanel(xylineChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(480, 300));
    final XYPlot plot = xylineChart.getXYPlot();

    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
    renderer.setSeriesPaint(0, Color.RED);
    renderer.setSeriesPaint(1, Color.YELLOW);
    renderer.setSeriesPaint(2, Color.GREEN);
    renderer.setSeriesStroke(0, new BasicStroke(3.0f));
    renderer.setSeriesStroke(1, new BasicStroke(3.0f));
    renderer.setSeriesStroke(2, new BasicStroke(3.0f));
    plot.setRenderer(renderer);
    setContentPane(chartPanel);
  }

  private XYDataset createDataset()
  {
    StreamOptional StreamOptional = new StreamOptional();
    StreamOptional.Read();

    double countTobacco = 1.0;
    double valueTobacco = 0.0;

    final XYSeries tobacco = new XYSeries("Tobacco");

    for (int i = 0; i < StreamOptional.getList(0).size() + 1; i++)
    {
      if (i == 0)
      {
        tobacco.add(0.0, 0.0);
      }

      if (i == StreamOptional.getList(0).size())
      {
        if (StreamOptional.getList(0).get(i-1).equals("Tobacco"))
        {
          tobacco.add(countTobacco++, valueTobacco++);
        }

        if (StreamOptional.getList(0).get(i-1).equals("None"))
        {
          tobacco.add(countTobacco++, valueTobacco);
        }
      }

      else if (StreamOptional.getList(0).get(i).equals("Tobacco"))
      {
        tobacco.add(countTobacco++, valueTobacco++);
      }

      else if (StreamOptional.getList(0).get(i).equals("None"))
      {
        tobacco.add(countTobacco++, valueTobacco);
      }
    }


    double countDrugs = 1.0;
    double valueDrugs = 0.0;

    final XYSeries drugs = new XYSeries("Drugs");

    for (int i = 0; i < StreamOptional.getList(1).size() + 1; i++)
    {
      if (i == 0)
      {
        drugs.add(0.0, 0.0);
      }

      if (i == StreamOptional.getList(1).size())
      {
        if (StreamOptional.getList(1).get(i-1).equals("Drugs"))
        {
          drugs.add(countDrugs++, valueDrugs++);
        }

        if (StreamOptional.getList(1).get(i-1).equals("None"))
        {
          drugs.add(countDrugs++, valueDrugs);
        }
      }

      else if (StreamOptional.getList(1).get(i).equals("Drugs"))
      {
        drugs.add(countDrugs++, valueDrugs++);
      }

      else if (StreamOptional.getList(1).get(i).equals("None"))
      {
        drugs.add(countDrugs++, valueDrugs);
      }
    }


    double countAlcohol = 1.0;
    double valueAlcohol = 0.0;

    final XYSeries alcohol = new XYSeries("Alcohol");

    for (int i = 0; i < StreamOptional.getList(2).size() + 1; i++)
    {
      if (i == 0)
      {
        alcohol.add(0.0, 0.0);
      }

      if (i == StreamOptional.getList(2).size())
      {
        if (StreamOptional.getList(2).get(i-1).equals("Alcohol"))
        {
          alcohol.add(countAlcohol++, valueAlcohol++);
        }

        if (StreamOptional.getList(2).get(i-1).equals("None"))
        {
          alcohol.add(countAlcohol++, valueAlcohol);
        }
      }

      else if (StreamOptional.getList(2).get(i).equals("Alcohol"))
      {
        alcohol.add(countAlcohol++, valueAlcohol++);
      }

      else if (StreamOptional.getList(2).get(i).equals("None"))
      {
        alcohol.add(countAlcohol++, valueAlcohol);
      }
    }

    final XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(tobacco);
    dataset.addSeries(drugs);
    dataset.addSeries(alcohol);

    return dataset;
  }
}

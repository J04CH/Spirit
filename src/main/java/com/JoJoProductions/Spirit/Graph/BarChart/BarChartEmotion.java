package com.JoJoProductions.Spirit.Graph.BarChart;

import com.JoJoProductions.Spirit.File.SubClass.StreamDate;
import com.JoJoProductions.Spirit.File.SubClass.StreamEmotion;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import java.util.ArrayList;

public class BarChartEmotion extends ApplicationFrame
{
  private String[][] listbind;
  private int samemonth = 0;

  public BarChartEmotion()
  {
    super("Spirits (États d'âme)");
    JFreeChart barChart = ChartFactory.createBarChart(
    "Spirits Record",
    "Day",
    "Rank",
    createDataset(),
    PlotOrientation.VERTICAL,
    false, true, false);

    ChartPanel chartPanel = new ChartPanel(barChart);
    chartPanel.setPreferredSize(new java.awt.Dimension(480, 300));
    setContentPane(chartPanel);
  }

  private CategoryDataset createDataset()
  {
    StreamDate StreamDate = new StreamDate();
    StreamDate.Read(0); StreamDate.Read(1);

    StreamEmotion StreamEmotion = new StreamEmotion();
    StreamEmotion.Read();

    Bind(StreamDate.getList(0), StreamDate.getList(1), StreamEmotion.getList(), StreamDate.getList(0).size());

    final String Emotion = "Emotion";

    final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    for (int i = 0; i < samemonth; i++)
    {
      dataset.addValue(Double.parseDouble(listbind[i][2]), Emotion, listbind[i][1]);
    }

    return dataset;
  }

  public void Bind(ArrayList<String> listmonth, ArrayList<String> listday, ArrayList<String> listemotion, int countdate)
  {
    int diffmonth1 = 1, diffmonth2 = 1;

    listbind = new String[countdate][3];

    for (int i = 0; i < countdate; i++)
    {
      listbind[i][0] = listmonth.get(i);

    if (listmonth.get(i).equals(listmonth.get(countdate-1)))
    {
      samemonth++;
    }

    else if (!listmonth.get(i).equals(listmonth.get(countdate-1)))
    {
      samemonth = 0;
      diffmonth1++;
      diffmonth2++;
    }
    }

    for (int i = 0; i < samemonth; i++, diffmonth1++, diffmonth2++)
    {
      listbind[i][1] = listday.get(diffmonth1-1);
      listbind[i][2] = listemotion.get(diffmonth2-1);
    }
  }
}

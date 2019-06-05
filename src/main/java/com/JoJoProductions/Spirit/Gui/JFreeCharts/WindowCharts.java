package com.JoJoProductions.Spirit.Gui.JFreeCharts;

import com.JoJoProductions.Spirit.FakeAI.SubClass.Agent;
import com.JoJoProductions.Spirit.File.SubClass.StreamOptional;
import com.JoJoProductions.Spirit.Graph.BarChart.BarChartEmotion;
import com.JoJoProductions.Spirit.Graph.LineChart.XYLineChartEmotion;
import com.JoJoProductions.Spirit.Graph.LineChart.XYLineChartSleepH;
import com.JoJoProductions.Spirit.Graph.LineChart.XYLineChartSleepYN;
import com.JoJoProductions.Spirit.Graph.LineChart.XYLineChartWeight;
import com.JoJoProductions.Spirit.Graph.LineChart.XYLineChartOptional;
import com.JoJoProductions.Spirit.Graph.LineChart.XYLineChartSport;

import org.jfree.ui.RefineryUtilities;

public class WindowCharts
{
  public WindowCharts()
  {
    final XYLineChartEmotion xylinechartemo = new XYLineChartEmotion();
    xylinechartemo.pack();
    RefineryUtilities.positionFrameOnScreen(xylinechartemo, 0.1, 0.0);
    xylinechartemo.setVisible(true);

    final XYLineChartSleepH xylinechartsleeph = new XYLineChartSleepH();
    xylinechartsleeph.pack();
    RefineryUtilities.positionFrameOnScreen(xylinechartsleeph, 0.9, 0.0);
    xylinechartsleeph.setVisible(true);

    final XYLineChartSleepYN xylinechartsleepyn = new XYLineChartSleepYN();
    xylinechartsleepyn.pack();
    RefineryUtilities.positionFrameOnScreen(xylinechartsleepyn, 0.1, 0.469);
    xylinechartsleepyn.setVisible(true);

    final XYLineChartWeight xylinechartweight = new XYLineChartWeight();
    xylinechartweight.pack();
    RefineryUtilities.positionFrameOnScreen(xylinechartweight, 0.9, 0.469);
    xylinechartweight.setVisible(true);

    final XYLineChartOptional xylinechartoptional = new XYLineChartOptional();
    xylinechartoptional.pack();
    RefineryUtilities.positionFrameOnScreen(xylinechartoptional, 0.7, 1.0);
    xylinechartoptional.setVisible(true);

    final XYLineChartSport xylinechartsport = new XYLineChartSport();
    xylinechartsport.pack();
    RefineryUtilities.positionFrameOnScreen(xylinechartsport, 0.3, 1.0);
    xylinechartsport.setVisible(true);

    final BarChartEmotion barchart = new BarChartEmotion();
    barchart.pack();
    RefineryUtilities.positionFrameOnScreen(barchart, 0.5, 0.0);
    barchart.setVisible(true);

    final Agent Agent = new Agent();
    Agent.MakeWindow();
  }
}

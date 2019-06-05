package graph;

import algorithm.Binder;
import algorithm.Computer;
import algorithm.Giver;
import file.StreamEmotion;
import file.StreamDate;
import algorithm.GiverStats;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JPanel;

public class BarGraphs extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;

    Binder Binder = new Binder();
    Binder.Bind();

    Giver Giver = new Giver();

    for (int i = 0; i < StreamDate.getCount(); i++)
    {
      if(Binder.getArrayBind()[i][0].equals(StreamDate.getText1()))
      {
        if (StreamDate.getText1().equals("12"))
        {
          Giver.getAct(StreamDate.getText2()).setToZero();
          Giver.getAct(StreamDate.getText3()).setToZero();
        }
        Giver.getAct(StreamDate.getText1()).readNumbers(i);
      }

      if(Binder.getArrayBind()[i][0].equals(StreamDate.getText2()))
      {
        if (StreamDate.getText2().equals("12"))
        {
          Giver.getAct(StreamDate.getText1()).setToZero();
          Giver.getAct(StreamDate.getText3()).setToZero();
        }
        Giver.getAct(StreamDate.getText2()).readNumbers(i);
      }

      if(Binder.getArrayBind()[i][0].equals(StreamDate.getText3()))
      {
        if (StreamDate.getText3().equals("12"))
        {
          Giver.getAct(StreamDate.getText1()).setToZero();
          Giver.getAct(StreamDate.getText2()).setToZero();
        }
        Giver.getAct(StreamDate.getText3()).readNumbers(i);
      }
    }

    Computer Computer = new Computer();
    GiverStats GiverStats = new GiverStats();

    Computer.calculate(Giver.getAct(StreamDate.getText1()).getTop(), Giver.getAct(StreamDate.getText1()).getMoyen(), Giver.getAct(StreamDate.getText1()).getPasSuper());
    g2d.setColor(new Color(0, 0, 0));
    g2d.fillRect(50, 100+Math.round(400*(1-Computer.getStatsTop())), 90, Math.round(400*Computer.getStatsTop()));

    g2d.setColor(new Color(100, 100, 100));
    g2d.fillRect(140, 100+Math.round(400*(1-Computer.getStatsMoyen())), 90, Math.round(400*Computer.getStatsMoyen()));

    g2d.setColor(new Color(200, 200, 200));
    g2d.fillRect(230, 100+Math.round(400*(1-Computer.getStatsPasSuper())), 90, Math.round(400*Computer.getStatsPasSuper()));

    GiverStats.setStatsTop1(String.valueOf(Computer.getStatsTop()));
    GiverStats.setStatsMoyen1(String.valueOf(Computer.getStatsMoyen()));
    GiverStats.setStatsPasSuper1(String.valueOf(Computer.getStatsPasSuper()));

    Computer.calculate(Giver.getAct(StreamDate.getText2()).getTop(), Giver.getAct(StreamDate.getText2()).getMoyen(), Giver.getAct(StreamDate.getText2()).getPasSuper());
    g2d.setColor(new Color(0, 0, 0));
    g2d.fillRect(360, 100+Math.round(400*(1-Computer.getStatsTop())), 90, Math.round(400*Computer.getStatsTop()));

    g2d.setColor(new Color(100, 100, 100));
    g2d.fillRect(450, 100+Math.round(400*(1-Computer.getStatsMoyen())), 90, Math.round(400*Computer.getStatsMoyen()));

    g2d.setColor(new Color(200, 200, 200));
    g2d.fillRect(540, 100+Math.round(400*(1-Computer.getStatsPasSuper())), 90, Math.round(400*Computer.getStatsPasSuper()));

    GiverStats.setStatsTop2(String.valueOf(Computer.getStatsTop()));
    GiverStats.setStatsMoyen2(String.valueOf(Computer.getStatsMoyen()));
    GiverStats.setStatsPasSuper2(String.valueOf(Computer.getStatsPasSuper()));

    Computer.calculate(Giver.getAct(StreamDate.getText3()).getTop(), Giver.getAct(StreamDate.getText3()).getMoyen(), Giver.getAct(StreamDate.getText3()).getPasSuper());
    g2d.setColor(new Color(0, 0, 0));
    g2d.fillRect(670, 100+Math.round(400*(1-Computer.getStatsTop())), 90, Math.round(400*Computer.getStatsTop()));

    g2d.setColor(new Color(100, 100, 100));
    g2d.fillRect(760, 100+Math.round(400*(1-Computer.getStatsMoyen())), 90, Math.round(400*Computer.getStatsMoyen()));

    g2d.setColor(new Color(200, 200, 200));
    g2d.fillRect(850, 100+Math.round(400*(1-Computer.getStatsPasSuper())), 90, Math.round(400*Computer.getStatsPasSuper()));

    GiverStats.setStatsTop3(String.valueOf(Computer.getStatsTop()));
    GiverStats.setStatsMoyen3(String.valueOf(Computer.getStatsMoyen()));
    GiverStats.setStatsPasSuper3(String.valueOf(Computer.getStatsPasSuper()));
  }
}

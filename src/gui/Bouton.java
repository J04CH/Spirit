package gui;

import file.StreamEmotion;
import file.StreamDate;
import graph.BarGraphs;
import algorithm.GiverStats;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.io.IOException;

public class Bouton
{
  private static int CountFenetre = 0;

  public Bouton(JButton emotion, String CharBouton)
  {
    emotion.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent arg0)
      {
        if (CountFenetre == 0)
        {
          StreamEmotion StreamEmotion = new StreamEmotion();
          StreamEmotion.setStringEmotion(CharBouton);
          StreamEmotion.RTM();

          if (StreamEmotion.getCount2() > StreamDate.getCount())
          {
            Fenetre Fenetre = new Fenetre(0, "Trop d\'émotions et pas assez de dates!");
          }

          else if (StreamEmotion.getCount2() == StreamDate.getCount()-1)
          {
            StreamEmotion.W(); //write
            StreamEmotion.R(); //read
            Fenetre Fenetre = new Fenetre();
          }

          else if (StreamEmotion.getCount2() < StreamDate.getCount())
          {
            Fenetre Fenetre = new Fenetre(0, "Trop de dates et pas assez de d\'émotions!");
          }

          else if (StreamEmotion.getCount2() == StreamDate.getCount())
          {
            try
            {
              StreamEmotion.RemoveLastLine();
            }
            catch(IOException e)
            {
              e.printStackTrace();
            }
            StreamEmotion.W();  //write to modify
            StreamEmotion.R(); //read
            Fenetre Fenetre = new Fenetre();
          }
        }
        CountFenetre++;
      }
    });
  }

  public Bouton(JButton month, JLabel label1, JLabel label2, JLabel label3, JLabel label4, JLabel label5, JLabel label6, JLabel label7, JLabel label8, JLabel label9, int choice)
  {
    month.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent arg0)
      {
        if (choice == 0)
        {
          if (GiverStats.GiveStatsTop1().length() == 4 || GiverStats.GiveStatsTop1().length() < 4)
          {
            label1.setText(GiverStats.GiveStatsTop1());
          }

          else if (GiverStats.GiveStatsTop1().length() > 4)
          {
            label1.setText(GiverStats.GiveStatsTop1().substring(1,4));
          }

          if (GiverStats.GiveStatsMoyen1().length() == 4 || GiverStats.GiveStatsMoyen1().length() < 4)
          {
            label2.setText(GiverStats.GiveStatsMoyen1());
          }

          else if (GiverStats.GiveStatsMoyen1().length() > 4)
          {
            label2.setText(GiverStats.GiveStatsMoyen1().substring(1,4));
          }

          if (GiverStats.GiveStatsPasSuper1().length() == 4 || GiverStats.GiveStatsPasSuper1().length() < 4)
          {
            label3.setText(GiverStats.GiveStatsPasSuper1());
          }

          else if (GiverStats.GiveStatsPasSuper1().length() > 4)
          {
            label3.setText(GiverStats.GiveStatsPasSuper1().substring(1,4));
          }

          label4.setText("");
          label5.setText("");
          label6.setText("");
          label7.setText("");
          label8.setText("");
          label9.setText("");
        }

        if (choice == 1)
        {
          if (GiverStats.GiveStatsTop2().length() == 4 || GiverStats.GiveStatsTop2().length() < 4)
          {
            label1.setText(GiverStats.GiveStatsTop2());
          }

          else if (GiverStats.GiveStatsTop2().length() > 4)
          {
            label1.setText(GiverStats.GiveStatsTop2().substring(1,4));
          }

          if (GiverStats.GiveStatsMoyen2().length() == 4 || GiverStats.GiveStatsMoyen2().length() < 4)
          {
            label2.setText(GiverStats.GiveStatsMoyen2());
          }

          else if (GiverStats.GiveStatsMoyen2().length() > 4)
          {
            label2.setText(GiverStats.GiveStatsMoyen2().substring(1,4));
          }

          if (GiverStats.GiveStatsPasSuper2().length() == 4 || GiverStats.GiveStatsPasSuper2().length() < 4)
          {
            label3.setText(GiverStats.GiveStatsPasSuper2());
          }

          else if (GiverStats.GiveStatsPasSuper2().length() > 4)
          {
            label3.setText(GiverStats.GiveStatsPasSuper2().substring(1,4));
          }

          label4.setText("");
          label5.setText("");
          label6.setText("");
          label7.setText("");
          label8.setText("");
          label9.setText("");
        }

        if (choice == 2)
        {
          if (GiverStats.GiveStatsTop3().length() == 4 || GiverStats.GiveStatsTop3().length() < 4)
          {
            label1.setText(GiverStats.GiveStatsTop3());
          }

          else if (GiverStats.GiveStatsTop3().length() > 4)
          {
            label1.setText(GiverStats.GiveStatsTop3().substring(1,4));
          }

          if (GiverStats.GiveStatsMoyen3().length() == 4 || GiverStats.GiveStatsMoyen3().length() < 4)
          {
            label2.setText(GiverStats.GiveStatsMoyen3());
          }

          else if (GiverStats.GiveStatsMoyen3().length() > 4)
          {
            label2.setText(GiverStats.GiveStatsMoyen3().substring(1,4));
          }

          if (GiverStats.GiveStatsPasSuper3().length() == 4 || GiverStats.GiveStatsPasSuper3().length() < 4)
          {
            label3.setText(GiverStats.GiveStatsPasSuper3());
          }

          else if (GiverStats.GiveStatsPasSuper3().length() > 4)
          {
            label3.setText(GiverStats.GiveStatsPasSuper3().substring(1,4));
          }

          label4.setText("");
          label5.setText("");
          label6.setText("");
          label7.setText("");
          label8.setText("");
          label9.setText("");
        }
      }
    });
  }
}

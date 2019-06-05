package com.JoJoProductions.Spirit.Gui.JFrame;

import com.JoJoProductions.Spirit.File.SubClass.StreamDate;
import com.JoJoProductions.Spirit.File.Class.Stream;
import com.JoJoProductions.Spirit.File.Class.MAG;
import com.JoJoProductions.Spirit.Gui.JFreeCharts.WindowCharts;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class Window extends JFrame
{
  //Counts are initialized to allow one action
  private int CountValid = 0;
  private int CountTobacco = 0, CountAlcohol = 0, CountDrugs = 0;

  private final MAG<String> Weight = new MAG<String>();
  private final MAG<String> SleepH = new MAG<String>();
  private final MAG<String> SleepYN = new MAG<String>();
  private final MAG<String> Emotion = new MAG<String>();
  private final MAG<String> Sport = new MAG<String>();

  //Initiazling instance of class
  private final Stream Stream = new Stream();

  public Window()
  {
    /*
    First Part
    */

    JLabel DateIntro = new JLabel("Date: ");
    DateIntro.setBounds(20, 0, 300, 50);
    this.add(DateIntro);

    JLabel Date = new JLabel(StreamDate.getDate());
    Date.setBounds(60, 0, 300, 50);
    this.add(Date);

    JTextField WeightField = new JTextField();
    WeightField.setBounds(40, 170, 100, 30);
    this.add(WeightField);

    JLabel WeightLabel = new JLabel("Weight (in kg)");
    WeightLabel.setBounds(47, 130, 300, 50);
    this.add(WeightLabel);

    JButton WeightButton = new JButton("Enter");
    WeightButton.setSize(new Dimension(70, 30));
    WeightButton.setLocation(135, 170);
    this.add(WeightButton);

    WeightButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        if (!WeightField.getText().equals(""))
        {
          Weight.setVar(WeightField.getText());
        }
      }
    });

    JTextField SleepField = new JTextField();
    SleepField.setBounds(40, 280, 100, 30);
    this.add(SleepField);

    JLabel SleepLabel = new JLabel("Sleep (in hours)");
    SleepLabel.setBounds(44, 240, 300, 50);
    this.add(SleepLabel);

    JButton SleepButton = new JButton("Enter");
    SleepButton.setSize(new Dimension(70, 30));
    SleepButton.setLocation(135, 280);
    this.add(SleepButton);

    SleepButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        if (!SleepField.getText().equals(""))
        {
          SleepH.setVar(SleepField.getText());
        }
      }
    });

    JLabel SleepLabel2 = new JLabel("Good Sleep?");
    SleepLabel2.setBounds(85, 350, 300, 50);
    this.add(SleepLabel2);

    JButton YesButtonSleep = new JButton("yes");
    YesButtonSleep.setSize(new Dimension(70, 30));
    YesButtonSleep.setLocation(55, 390);
    this.add(YesButtonSleep);

    YesButtonSleep.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        SleepYN.setVar("yes=Sleep");
      }
    });

    JButton NoButtonSleep = new JButton("no");
    NoButtonSleep.setSize(new Dimension(70, 30));
    NoButtonSleep.setLocation(115, 390);
    this.add(NoButtonSleep);

    NoButtonSleep.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        SleepYN.setVar("no=Sleep");
      }
    });

    /*
    Second Part
    */

    JButton TopButton = new JButton("Feeling Good");
    TopButton.setSize(new Dimension(140, 40));
    TopButton.setLocation(300, 100);
    this.add(TopButton);

    TopButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        Emotion.setVar("3");
      }
    });

    JButton SoSoButton = new JButton("Feeling So So");
    SoSoButton.setSize(new Dimension(140, 40));
    SoSoButton.setLocation(300, 220);
    this.add(SoSoButton);

    SoSoButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        Emotion.setVar("2");
      }
    });

    JButton BadButton = new JButton("Feeling Bad");
    BadButton.setSize(new Dimension(140, 40));
    BadButton.setLocation(300, 340);
    this.add(BadButton);

    BadButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        Emotion.setVar("1");
      }
    });

    JButton ValidateButton = new JButton("Validate");
    ValidateButton.setSize(new Dimension(100, 40));
    ValidateButton.setLocation(320, 440);
    this.add(ValidateButton);

    ValidateButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent arg0)
      {
        if (CountValid == 0)
        {
          Stream.setList(Weight);
          Stream.setList(SleepH);
          Stream.setList(SleepYN);
          Stream.setList(Emotion);
          Stream.setList(Sport);

          if (((Stream.getList().get(3).getVar().equals("1")) || (Stream.getList().get(3).getVar().equals("2")) || (Stream.getList().get(3).getVar().equals("3")))
          && ((Stream.getList().get(4).getVar().equals("yes=Sport")) || (Stream.getList().get(4).getVar().equals("no=Sport")))
          && (!Stream.getList().get(0).getVar().equals(""))
          && ((Stream.getList().get(2).getVar().equals("yes=Sleep")) || (Stream.getList().get(2).getVar().equals("no=Sleep")))
          && (!Stream.getList().get(1).getVar().equals("")))
          {
            Stream.writeInfo();
            WindowCharts WindowCharts = new WindowCharts();
            CountValid++;
          }
        }
      }
    });

    /*
    Third Part
    */

    JLabel OptionalLabel = new JLabel("Optional:");
    OptionalLabel.setBounds(580, 100, 300, 50);
    this.add(OptionalLabel);

    JButton TobaccoButton = new JButton("Tobacco");
    TobaccoButton.setSize(new Dimension(100, 40));
    TobaccoButton.setLocation(560, 150);
    this.add(TobaccoButton);

    TobaccoButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        if (CountTobacco == 0)
        {
          MAG.setOptional("Tobacco");
          CountTobacco++;
        }
      }
    });

    JButton DrugsButton = new JButton("Drugs");
    DrugsButton.setSize(new Dimension(100, 40));
    DrugsButton.setLocation(560, 220);
    this.add(DrugsButton);

    DrugsButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        if (CountDrugs == 0)
        {
          MAG.setOptional("Drugs");
          CountDrugs++;
        }
      }
    });

    JButton AlcoholButton = new JButton("Alcohol");
    AlcoholButton.setSize(new Dimension(100, 40));
    AlcoholButton.setLocation(560, 290);
    this.add(AlcoholButton);

    AlcoholButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        if (CountAlcohol == 0)
        {
          MAG.setOptional("Alcohol");
          CountAlcohol++;
        }
      }
    });

    JLabel SportLabel = new JLabel("Sport ?");
    SportLabel.setBounds(590, 350, 300, 50);
    this.add(SportLabel);

    JButton YesButtonSport = new JButton("yes");
    YesButtonSport.setSize(new Dimension(70, 30));
    YesButtonSport.setLocation(545, 390);
    this.add(YesButtonSport);

    YesButtonSport.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        Sport.setVar("yes=Sport");
      }
    });

    JButton NoButtonSport = new JButton("no");
    NoButtonSport.setSize(new Dimension(70, 30));
    NoButtonSport.setLocation(605, 390);
    this.add(NoButtonSport);

    NoButtonSport.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        Sport.setVar("no=Sport");
      }
    });

    JPanel panel = new JPanel();
    panel.setLayout(null);
    this.add(panel);

    this.setTitle("Spirits (États d'âme)");
    this.setSize(750, 500);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setVisible(true);
  }
}

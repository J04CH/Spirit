  package com.JoJoProductions.Spirit.FakeAI.SubClass;

  import com.JoJoProductions.Spirit.FakeAI.SuperClass.Functions;
  import com.JoJoProductions.Spirit.File.SubClass.StreamDate;

  import javax.swing.JTabbedPane;
  import javax.swing.JFrame;
  import javax.swing.JPanel;
  import javax.swing.JLabel;
  import java.util.Arrays;
  import java.util.Collections;
  import java.io.File;
  import java.io.FileReader;
  import java.io.BufferedReader;
  import java.io.IOException;
  import java.util.ArrayList;
  import java.util.Iterator;

  public class Agent extends Functions
  {
  public String[] AllFunctionsOfEmotion()
  {
    String[] str = {EmotionSport(), EmotionSleepYN(), EmotionTobacco(), EmotionDrugs(), EmotionAlcohol()};

    return str;
  }

  public String[] AllFunctionsOfSleep()
  {
    String[] str = {SleepYNSport(), SleepYNTobacco(), SleepYNDrugs(), SleepYNAlcohol()};

    return str;
  }

  public String[] AllFunctionsOfWeight()
  {
    String[] str = {WeightEmotion(), WeightSport(), WeightTobacco(), WeightDrugs(), WeightAlcohol()};

    return str;
  }

  public void MakeWindow()
  {
    String[] Array = null;

    String String = "";

    JFrame frame = new JFrame();

    JPanel panel1 = new JPanel();
    panel1.setLayout(null);
    frame.add(panel1);

    JPanel panel2 = new JPanel();
    panel2.setLayout(null);
    frame.add(panel2);

    JLabel[] label = new JLabel[AllFunctionsOfEmotion().length + AllFunctionsOfSleep().length + AllFunctionsOfWeight().length];

    if (EmotionSport().equals("") && EmotionSleepYN().equals("") && EmotionTobacco().equals("") && EmotionDrugs().equals("") && EmotionAlcohol().equals("") && SleepYNSport().equals("") && SleepYNTobacco().equals("") && SleepYNDrugs().equals("") && SleepYNAlcohol().equals("") && WeightEmotion().equals("") && WeightSport().equals("") && WeightTobacco().equals("") && WeightDrugs().equals("") && WeightAlcohol().equals(""))
    {
      String = "No Messages";
      String[] Array1 = {"", ""};
      Array = Array1;
    }

    else
    {
      String[] Array2 = {EmotionSport(), EmotionSleepYN(), EmotionTobacco(), EmotionDrugs(), EmotionAlcohol(), SleepYNSport(), SleepYNTobacco(), SleepYNDrugs(), SleepYNAlcohol(), WeightEmotion(), WeightSport(), WeightTobacco(), WeightDrugs(), WeightAlcohol()};
      Array = Array2;
    }

    ArrayList<String> AL = new ArrayList<String>(Arrays.asList(Array));

    Iterator<String> i = AL.iterator();
    while (i.hasNext())
    {
      String s = i.next();

      if (s.equals(""))
      {
        i.remove();
      }
    }

    Array = AL.toArray(Array);

    Collections.shuffle(Arrays.asList(Array));

    int b = 0;

    for(int a = 0, c = 0; b < Array.length; b++)
    {
      if (Array[b] == null || Array[b].equals(""))
      {
        if (String.equals("No Messages"))
        {
          label[0] = new JLabel("NO MESSAGES IN THE MESAGE BOX");
          label[0].setBounds(10, 80, 450, 20);
          label[1] = new JLabel(String.format("%d DAY(S) UNTIL MESSAGES APPEAR", 4 - getCount()));
          label[1].setBounds(10, 100, 450, 20);
          panel1.add(label[0]);
          panel1.add(label[1]);
        }

        continue;
      }

      if (b <= 9)
      {
        label[b] = new JLabel(Array[b]);
        label[b].setBounds(10, 28*c, 450, 20);
        panel1.add(label[b]);
        c++;
      }

      else
      {
        label[b] = new JLabel(Array[b]);
        label[b].setBounds(10, 28*a, 450, 20);
        panel2.add(label[b]);
        a++;
      }
    }

    JTabbedPane tabs = new JTabbedPane();
    tabs.setBounds(0, 0, 400, 400);

    tabs.add("Number: 1", panel1);

    if (b > 9)
    {
      tabs.add("Number: 2", panel2);
    }

    frame.add(tabs);

    frame.setTitle("Message Box");
    frame.setSize(480, 315);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setVisible(true);
  }

  public int getCount()
  {
    int count = 0;

    ReadInitialize();

    try
    {
      while((LineAlgorithms = BRAlgorithms.readLine()) != null)
      {
        count++;
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

    return count;
  }
  }

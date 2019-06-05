package com.JoJoProductions.Spirit.FakeAI.SuperClass;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Algorithms
{
  protected File FAlgorithms = null;
  protected FileReader FRAlgorithms = null;
  protected BufferedReader BRAlgorithms = null;
  protected String LineAlgorithms;

  public void ReadInitialize()
  {
    try
    {
      FAlgorithms = new File("src/main/resources/Info.txt");
      FRAlgorithms = new FileReader(FAlgorithms);
      BRAlgorithms = new BufferedReader(FRAlgorithms);
    }
    catch(IOException  e)
    {
      e.printStackTrace();
    }
  }

  public int[] Emotion()
  {
    String[] array;
    int Top = 0, SoSo = 0, Bad = 0;

    //Initialize File, FileReader, BufferReader
    ReadInitialize();

    try
    {
      //Reading Line by Line
      while((LineAlgorithms = BRAlgorithms.readLine()) != null)
      {
        array = LineAlgorithms.split(" ");

        //Increments Top variable
        if (array[1].equals("3"))
        {
          Top++;
        }

        /*At (2 = SoSo), it is not above 2
        *So it goes up one more
        *Then it goes up one more while Top is set to zero
        */
        else if ((SoSo > 2 && Top > 3 ) || (SoSo > 2 && Top < 3))
        {
          Top = 0;
        }

        /*At (2 = Bad), it is not above 2
        *So it goes up one more
        *Then it goes up one more while Top is set to zero
        */
        else if ((Bad > 2 && Top > 3 ) || (Bad > 2 && Top < 3))
        {
          Top = 0;
        }

        //Increments SoSo variable
        if(array[1].equals("2"))
        {
          SoSo++;
        }

        /*At (3 = Top), it is not above 3
        *So it goes up one more
        *Then it goes up one more while SoSo is set to zero
        */
        else if ((Top > 3 && SoSo > 3) || (Top > 3 && SoSo < 3))
        {
          SoSo = 0;
        }

        /*At (3 = Bad), it is not above 3
        *So it goes up one more
        *Then it goes up one more while SoSo is set to zero
        */
        else if ((Bad > 3 && SoSo > 3) || (Bad > 3 && SoSo < 3))
        {
          SoSo = 0;
        }

        //Increments Bad variable
        if(array[1].equals("1"))
        {
          Bad++;
        }

        /*At (3 = Top), it is not above 3
        *So it goes up one more
        *Then it goes up one more while Bad is set to zero
        */
        else if ((Top > 3 && Bad > 3) || (Top > 3 && Bad < 3))
        {
          Bad = 0;
        }

        /*At (3 = SoSo), it is not above 3
        *So it goes up one more
        *Then it goes up one more while Bad is set to zero
        */
        else if ((SoSo > 3 && Bad > 3) || (SoSo > 3 && Bad < 3))
        {
          Bad = 0;
        }
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }

    int[] C = {Top, SoSo, Bad};

    return C;
  }

  public int[] Sport()
  {
    int countYSport = 0;
    int countNSport = 0;

    //Initialize File, FileReader, BufferReader
    ReadInitialize();

    try
    {
      while((LineAlgorithms = BRAlgorithms.readLine()) != null)
      {
        //Increments countYSport variable
        if (LineAlgorithms.contains("yes=Sport"))
        {
          countYSport++;
        }

        /*At (-2 = countNSport), it is not below -2
        *So it goes down one more
        *Then it goes down one more while countYSport is set to zero
        */
        else if ((countNSport < -2 && countYSport > 3) || (countNSport < -2 && countYSport < 3))
        {
          countYSport = 0;
        }

        //Decrements countNSport variable
        if (LineAlgorithms.contains("no=Sport"))
        {
          countNSport--;
        }

        /*At (3 = countYSport), it is not above 3
        *So it goes up one more
        *Then it goes up one more while countNSport is set to zero
        */
        else if ((countYSport > 3 && countNSport < -3) || (countYSport > 3 && countNSport > -3))
        {
          countNSport = 0;
        }
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }

    int[] A = {countYSport, countNSport};

    return A;
  }

  public int[] SleepYN()
  {
    int countYSleep = 0;
    int countNSleep = 0;

    //Initialize File, FileReader, BufferReader
    ReadInitialize();

    try
    {
      while((LineAlgorithms = BRAlgorithms.readLine()) != null)
      {
        //Increments countYSleep variable
        if (LineAlgorithms.contains("yes=Sleep"))
        {
          countYSleep++;
        }

        /*At (-2 = countNSleep), it is not below -2
        *So it goes down one more
        *Then it goes down one more while countNSleep is set to zero
        */
        else if ((countNSleep < -2 && countYSleep > 3) || (countNSleep < -2 && countYSleep < 3))
        {
          countYSleep = 0;
        }

        //Decrements countNSleep variable
        if (LineAlgorithms.contains("no=Sleep"))
        {
          countNSleep--;
        }

        /*At (3 = countYSleep), it is not above 3
        *So it goes up one more
        *Then it goes up one more while countYSleep is set to zero
        */
        else if ((countYSleep > 3 && countNSleep < -3) || (countYSleep > 3 && countNSleep > -3))
        {
          countNSleep = 0;
        }
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }

    int[] B  = {countYSleep, countNSleep};

    return B;
  }

  public int[] Optional()
  {
    int TobaccoPos = 0, TobaccoNeg = 0;
    int DrugsPos = 0, DrugsNeg = 0;
    int AlcoholPos = 0, AlcoholNeg = 0;

    ReadInitialize();

    try
    {
      while((LineAlgorithms = BRAlgorithms.readLine()) != null)
      {
        if (LineAlgorithms.contains("Tobacco"))
        {
          TobaccoPos++;
        }

        else if ((TobaccoNeg < -2 && TobaccoPos > 3) || (TobaccoNeg < -2 && TobaccoPos < 3))
        {
          TobaccoPos = 0;
        }

        if (!LineAlgorithms.contains("Tobacco"))
        {
          TobaccoNeg--;
        }

        else if ((TobaccoPos > 3 && TobaccoNeg > -3) || (TobaccoPos > 3 && TobaccoNeg < -3))
        {
          TobaccoNeg = 0;
        }

        if (LineAlgorithms.contains("Drugs"))
        {
          DrugsPos++;
        }

        else if ((DrugsNeg < -2 && DrugsPos > 3) || (DrugsNeg < -2 && DrugsPos < 3))
        {
          DrugsPos = 0;
        }

        if (!LineAlgorithms.contains("Drugs"))
        {
          DrugsNeg--;
        }

        else if ((DrugsPos > 3 && DrugsNeg > -3) || (DrugsPos > 3 && DrugsNeg < -3))
        {
          DrugsNeg = 0;
        }

        if (LineAlgorithms.contains("Alcohol"))
        {
          AlcoholPos++;
        }

        else if ((AlcoholNeg < -2 && AlcoholPos > 3) || (AlcoholNeg < -2 && AlcoholPos < 3))
        {
          AlcoholPos = 0;
        }

        if (!LineAlgorithms.contains("Alcohol"))
        {
          AlcoholNeg--;
        }

        else if ((AlcoholPos > 3 && AlcoholNeg > -3) || (AlcoholPos > 3 && AlcoholNeg < -3))
        {
          AlcoholNeg = 0;
        }
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }

    int[] D = {TobaccoPos, TobaccoNeg, DrugsPos, DrugsNeg, AlcoholPos, AlcoholNeg};

    return D;
  }

  public int Weight()
  {
    List<Double> ArrayList = new ArrayList<Double>();
    double diff = 0.0;
    double More = 0.0, Less = 0.0;
    int value = 0;
    int i = 0;

    ReadInitialize();

    try
    {
      while((LineAlgorithms = BRAlgorithms.readLine()) != null)
      {
        String[] Array = LineAlgorithms.split(" ");
        ArrayList.add(Double.parseDouble(Array[2]));
        i++;
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

    if (ArrayList.get(0) > ArrayList.get(i-1))
    {
      value = -1;
    }

    if (ArrayList.get(0) == ArrayList.get(i-1))
    {
      value = 0;
    }

    if (ArrayList.get(0) < ArrayList.get(i-1))
    {
      value = 1;
    }

    return value;
  }
}

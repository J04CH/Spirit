package com.JoJoProductions.Spirit.File.SubClass;

import com.JoJoProductions.Spirit.FakeAI.SuperClass.Algorithms;

import java.io.IOException;
import java.util.ArrayList;

public class StreamOptional extends Algorithms
{
  private ArrayList<String> ArrayListTobacco;
  private ArrayList<String> ArrayListDrugs;
  private ArrayList<String> ArrayListAlcohol;
  private ArrayList<String> ArrayList;

  public void Read()
  {
    ArrayListTobacco = new ArrayList<String>();
    ArrayListDrugs = new ArrayList<String>();
    ArrayListAlcohol = new ArrayList<String>();

    ReadInitialize();

    try
    {
      while((LineAlgorithms = BRAlgorithms.readLine()) != null)
      {
        if (LineAlgorithms.contains("Tobacco"))
        {
          ArrayListTobacco.add("Tobacco");
        }

        else if (!LineAlgorithms.contains("Tobacco"))
        {
          ArrayListTobacco.add("None");
        }

        if (LineAlgorithms.contains("Drugs"))
        {
          ArrayListDrugs.add("Drugs");
        }

        else if (!LineAlgorithms.contains("Drugs"))
        {
          ArrayListDrugs.add("None");
        }

        if (LineAlgorithms.contains("Alcohol"))
        {
          ArrayListAlcohol.add("Alcohol");
        }

        else if (!LineAlgorithms.contains("Alcohol"))
        {
          ArrayListAlcohol.add("None");
        }
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }

  public ArrayList<String> getList(int select)
  {
    ArrayList = new ArrayList<String>();

    switch(select)
    {
      case 0:
        ArrayList = ArrayListTobacco;
        break;

      case 1:
        ArrayList = ArrayListDrugs;
        break;

      case 2:
        ArrayList = ArrayListAlcohol;
        break;
    }

    return ArrayList;
  }
}

package com.JoJoProductions.Spirit.File.SubClass;

import com.JoJoProductions.Spirit.File.SuperClass.SuperStream;
import com.JoJoProductions.Spirit.File.Class.Stream;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Collection;

public class StreamDate extends SuperStream
{
  private ArrayList<String> ArrayList;
  private ArrayList<String> ArrayListMonth;
  private ArrayList<String> ArrayListDay;

  public void ReadDiffDate()
  {
    File Mfolder = new File("src/main/resources");
    File Tfolder = new File("src/test/resources");

    if (!Mfolder.exists())
    {
      if (Mfolder.mkdir())
      {
        System.out.println("Directory in main is created!");
      }
      else
      {
        System.out.println("Failed to create directory in main!");
      }
    }

    if (!Tfolder.exists())
    {
      if (Tfolder.mkdir())
      {
        System.out.println("Directory in test is created!");
      }
      else
      {
        System.out.println("Failed to create directory in test!");
      }
    }

    File Mfile = new File("src/main/resources/Info.txt");
    File Tfile = new File("src/test/resources/Info.txt");


    if (!Mfile.exists())
    {
      try
      {
        if (Mfile.createNewFile())
        {
          System.out.println("File in main is created");
        }
        else
        {
          System.out.println("Failed to create directory in test!");
        }
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
    }

    if (!Tfile.exists())
    {
      try
      {
        if (Tfile.createNewFile())
        {
          System.out.println("File in test is created");
        }
        else
        {
          System.out.println("Failed to create directory in test!");
        }
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
    }

    Stream Stream = new Stream();

    ReadArray();

    if (ArrayAbstract != null)
    {
      if (getDate().equals(ArrayAbstract[0]))
      {
        try
        {
          Stream.removeInfo();
        }
        catch(IOException e)
        {
          e.printStackTrace();
        }
      }
    }
  }

  public void Read(int select)
  {
    switch (select)
    {
      case 0:
        ArrayListMonth = new ArrayList<String>();
        ReadListDate(1);
        ArrayListMonth = ArrayListAbstract;
        break;

      case 1:
        ArrayListDay = new ArrayList<String>();
        ReadListDate(0);
        ArrayListDay = ArrayListAbstract;
        break;
    }
  }

  public ArrayList<String> getList(int select)
  {
    ArrayList = new ArrayList<String>();

    switch (select)
    {
      case 0:
        ArrayList = ArrayListMonth;
        break;

      case 1:
        ArrayList = ArrayListDay;
        break;
    }

    return ArrayList;
  }

  @Override
  public int getCount()
  {
    return super.getCount();
  }

  public static String getDate()
  {
    Date myDate = new Date();
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    String date = DATE_FORMAT.format(myDate);

    return date;
  }
}

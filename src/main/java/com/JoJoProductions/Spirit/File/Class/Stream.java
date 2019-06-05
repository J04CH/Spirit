package com.JoJoProductions.Spirit.File.Class;

import com.JoJoProductions.Spirit.File.SubClass.StreamDate;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Stream
{
  private final StreamDate StreamDate = new StreamDate();

  private String str1 = "";
  private String str2 = "";
  private String LineStream = "";

  private BufferedReader BRStream = null;
  private BufferedWriter BWStream = null;
  private BufferedWriter BWStream2 = null;

  private int count;

  private ArrayList<String> FileContents;
  private static ArrayList<MAG> List;

  static {
    List = new ArrayList<MAG>();
  }

  public void writeInfo()
  {
    if (MAG.getOptional().size() > 0)
    {
      for (int i = 0; i < MAG.getOptional().size(); i++)
      {
        str1 = String.format("%s %s %s %s %s %s %s", StreamDate.getDate(), getList().get(3).getVar(), getList().get(0).getVar(),
        getList().get(4).getVar(), getList().get(2).getVar(), getList().get(1).getVar(), MAG.getOptional());
      }
    }

    else
    {
      str1 = String.format("%s %s %s %s %s %s", StreamDate.getDate(), getList().get(3).getVar(), getList().get(0).getVar(),
      getList().get(4).getVar(), getList().get(2).getVar(), getList().get(1).getVar());
    }


    str2 = str1.replace("[", "").replace("]", "").replace(",","");

    if ((getList().get(3).getVar().equals("1") || getList().get(3).getVar().equals("2") || getList().get(3).getVar().equals("3"))
    && (getList().get(4).getVar().equals("yes=Sport") || getList().get(4).getVar().equals("no=Sport"))
    && (!getList().get(0).getVar().equals(""))
    && (getList().get(2).getVar().equals("yes=Sleep") || getList().get(2).getVar().equals("no=Sleep"))
    && (!getList().get(1).getVar().equals("")))
    {
      StreamDate.ReadDiffDate();

      try
      {
        BWStream = new BufferedWriter(new FileWriter("src/main/resources/Info.txt", true));

        BWStream.write(str2);
        BWStream.newLine();

        BWStream.close();
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
    }
  }

  public void removeInfo() throws IOException
  {
    FileContents = new ArrayList<String>();

    BRStream = new BufferedReader(new FileReader("src/main/resources/Info.txt"));

    while ((LineStream = BRStream.readLine()) != null)
    {
      if (count == StreamDate.getCount())
      {
        continue;
      }

      FileContents.add(LineStream);
      count++;
    }

    BRStream.close();

    BWStream2 = new BufferedWriter(new FileWriter("src/main/resources/Info.txt"));

    for (String String : FileContents)
    {
      BWStream2.write(String);
      BWStream2.newLine();
    }

    BWStream2.close();
  }

  public void setList(MAG obj)
  {
    List.add(obj);
  }

  public ArrayList<MAG> getList()
  {
    return List;
  }
}

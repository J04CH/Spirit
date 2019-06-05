package com.JoJoProductions.Spirit.File.SuperClass;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class SuperStream
{
  private File FAbstract = null;
  private FileReader FRAbstract = null;
  private BufferedReader BRAbstract = null;
  private String LineAbstract;
  public String[] ArrayAbstract;

  private File FAbstract2 = null;
  private FileReader FRAbstract2 = null;
  private BufferedReader BRAbstract2 = null;
  private String LineAbstract2;
  private String[] ArrayAbstract2;

  private File FAbstract3 = null;
  private FileReader FRAbstract3 = null;
  private BufferedReader BRAbstract3 = null;
  private String LineAbstract3;
  private String[] ArrayAbstract3;

  public ArrayList<String> ArrayListAbstract;
  public ArrayList<String> ArrayListAbstract2;

  private static int count;

  static {
    count = 0;
  }

  public void ReadArray()
  {
    try
    {
      FAbstract = new File("src/main/resources/Info.txt");
      FRAbstract = new FileReader(FAbstract);
      BRAbstract = new BufferedReader(FRAbstract);

      while((LineAbstract = BRAbstract.readLine()) != null)
      {
        ArrayAbstract = LineAbstract.split(" ");
        count++;
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }

  public void ReadListDate(int i)
  {
    ArrayListAbstract  = new ArrayList<String>();

    try
    {
      FAbstract2 = new File("src/main/resources/Info.txt");
      FRAbstract2 = new FileReader(FAbstract2);
      BRAbstract2 = new BufferedReader(FRAbstract2);

      while((LineAbstract2 = BRAbstract2.readLine()) != null)
      {
        ArrayAbstract2 = LineAbstract2.split("/");
        ArrayListAbstract.add(ArrayAbstract2[i]);
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }

  public void ReadList(int i)
  {
    ArrayListAbstract2  = new ArrayList<String>();

    try
    {
      FAbstract3 = new File("src/main/resources/Info.txt");
      FRAbstract3 = new FileReader(FAbstract3);
      BRAbstract3 = new BufferedReader(FRAbstract3);

      while((LineAbstract3 = BRAbstract3.readLine()) != null)
      {
        ArrayAbstract3 = LineAbstract3.split(" ");
        ArrayListAbstract2.add(ArrayAbstract3[i]);
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }

  public int getCount()
  {
    return count;
  }
}

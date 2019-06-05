package com.JoJoProductions.Spirit.File.Class;

import java.util.ArrayList;

public class MAG<T>
{
  private T var;
  private static ArrayList<String> ArrayListOptional;

  static {
    ArrayListOptional = new ArrayList<String>();
  }

  public void setVar(T var)
  {
    this.var = var;
  }

  public T getVar()
  {
    return var;
  }

  public static void setOptional(String Optional)
  {
    ArrayListOptional.add(Optional);
  }

  public static ArrayList<String> getOptional()
  {
    return ArrayListOptional;
  }
}

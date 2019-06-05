package com.JoJoProductions.Spirit.File;

import org.junit.Test;

public class Split
{
  @Test
  public void splitString()
  {
    String str = "04/03/2019 1 85,5 yes";
    String [] arrofstr = str.split(" ");

    for (String a: arrofstr)
    {
      System.out.println(a);
    }
  }
}

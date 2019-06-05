package com.JoJoProductions.Spirit.File.SubClass;

import com.JoJoProductions.Spirit.File.SuperClass.SuperStream;

import java.util.ArrayList;

public class StreamSleepH extends SuperStream
{
  public void Read()
  {
    ReadList(5);
  }

  public ArrayList<String> getList()
  {
    return ArrayListAbstract2;
  }
}

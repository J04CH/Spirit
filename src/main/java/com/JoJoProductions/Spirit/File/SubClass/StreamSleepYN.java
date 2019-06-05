package com.JoJoProductions.Spirit.File.SubClass;

import com.JoJoProductions.Spirit.File.SuperClass.SuperStream;

import java.util.ArrayList;

public class StreamSleepYN extends SuperStream
{
  public void Read()
  {
    ReadList(4);
  }

  public ArrayList<String> getList()
  {
    return ArrayListAbstract2;
  }
}

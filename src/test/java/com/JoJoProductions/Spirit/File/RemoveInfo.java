package com.JoJoProductions.Spirit.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;

public class RemoveInfo
{
  @Test
  public void removeinfo() throws IOException
  {
    BufferedReader br = new BufferedReader(new FileReader("src/test/resources/Info.txt"));
    String line = "";
    ArrayList<String> fileContents = new ArrayList<String>();
    int count = 1;

    while ((line = br.readLine()) != null)
    {
      if (count == 2)
      {
        if (line.contains(br.readLine()))
        {
          continue;
        }
      }
      fileContents.add(line);
      count++;
    }

    br.close();

    BufferedWriter bw = new BufferedWriter(new FileWriter("src/test/resources/Info.txt"));

    for (String s : fileContents)
    {
      bw.write(s);
      bw.newLine();
    }

    bw.close();
  }
}

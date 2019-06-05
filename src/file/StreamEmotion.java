package file;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StreamEmotion extends AbstractStream
{
  private Scanner InputStreamEmotion3 = null;
  private String StringEmotion3;
  private static int CountEmotion2 = 0;

  //Read to modify
  public void RTM()
  {
    try
    {
      InputStreamEmotion3 = new Scanner(new FileInputStream("file/Emotion.txt"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File.txt not found");
      System.out.println("or could not be opened");
      System.exit(0);
    }

    while (InputStreamEmotion3.hasNextLine())
    {
      StringEmotion3 = InputStreamEmotion3.nextLine();
      if (StringEmotion3 != null)
      {
        CountEmotion2++;
      }
    }
    InputStreamEmotion3.close();
  }

  public void RemoveLastLine() throws IOException
  {
    BufferedReader br = new BufferedReader(new FileReader("file/Emotion.txt"));
    String line = "";
    List<String> fileContents = new ArrayList<String>();
    int count = 1;

    while ((line = br.readLine()) != null)
    {
      if (count == StreamEmotion.getCount2())
      {
        if (line.contains("0") || line.contains("1") || line.contains ("2"))
        {
          continue;
        }
      }
      fileContents.add(line);
      count++;
    }

    br.close();

    BufferedWriter bw = new BufferedWriter(new FileWriter("file/Emotion.txt"));

    for (String s : fileContents) {
        bw.write(s);
        bw.newLine();
    }

    bw.close();
  }

  public void R()
  {
    read(1);
  }

  public void W()
  {
    write(1);
  }

  public void setStringEmotion(String texte)
  {
    StringEmotion = texte;
  }

  public void readNumbers(int i)
  {
    switch (ArrayEmotion[i]){
      case '0':
      this.top += 1;
      break;

      case '1':
      this.moyen += 1;
      break;

      case '2':
      this.passuper += 1;
      break;
    }
  }

  public void setToZero()
  {
    this.top = 0;
    this.moyen = 0;
    this.passuper = 0;
  }

  public static String getEmotion(int i)
  {
    return String.valueOf(ArrayEmotion[i]);
  }

  public int getTop()
  {
    return this.top;
  }

  public int getMoyen()
  {
    return this.moyen;
  }

  public int getPasSuper()
  {
    return this.passuper;
  }

  public static int getCount2()
  {
    return CountEmotion2;
  }

  public static int getCount()
  {
    return CountEmotion;
  }
}

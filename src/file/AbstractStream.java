package file;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class AbstractStream
{
  private Scanner InputStreamDate1 = null;
  private Scanner InputStreamDate2 = null;
  private Scanner InputStreamEmotion1 = null;
  private Scanner InputStreamEmotion2 = null;
  private PrintWriter OutputStreamDate = null;
  private PrintWriter OutputStreamEmotion = null;
  private String StringDate1;
  private String StringDate2;
  private String StringEmotion1;
  private String StringEmotion2;
  private int j = -1;
  private int i = -1;

  protected static int CountDifferentDate = 1;
  protected static int CountEmotion = 0;
  protected static int CountDate = 0;
  protected static char[] ArrayEmotion;
  protected static String[] ArrayDate;

  protected String StringEmotion;
  protected int top = 0;
  protected int moyen = 0;
  protected int passuper = 0;

  public void read(int ChoiceRead)
  {
    try
    {
      InputStreamDate1 = new Scanner(new FileInputStream("file/Date.txt"));
      InputStreamDate2 = new Scanner(new FileInputStream("file/Date.txt"));
      InputStreamEmotion1 = new Scanner(new FileInputStream("file/Emotion.txt"));
      InputStreamEmotion2 = new Scanner(new FileInputStream("file/Emotion.txt"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File.txt not found");
      System.out.println("or could not be opened");
      System.exit(0);
    }

    if (ChoiceRead == 0)
    {
      while (InputStreamDate1.hasNextLine())
      {
        StringDate1 = InputStreamDate1.nextLine();
        if (StringDate1 != null)
        {
          CountDate++;
        }
      }
      InputStreamDate1.close();

      ArrayDate = new String[CountDate];

      while(InputStreamDate2.hasNextLine())
      {
        StringDate2 = InputStreamDate2.nextLine();
        if (StringDate2 != null)
        {
          i++;
          ArrayDate[i] = StringDate2.substring(3, 5);
          if (i > 0)
          {
            if (!ArrayDate[i].equals(ArrayDate[i-1]))
            {
              CountDifferentDate++;
            }
          }
        }
      }
    }

    if (ChoiceRead == 1)
    {
      while (InputStreamEmotion1.hasNextLine())
      {
        StringEmotion1 = InputStreamEmotion1.nextLine();
        if (StringEmotion1 != null)
        {
          CountEmotion++;
        }
      }

      ArrayEmotion = new char[CountEmotion];

      while (InputStreamEmotion2.hasNextLine())
      {
        StringEmotion2 = InputStreamEmotion2.nextLine();

        if (StringEmotion2 != null)
        {
          j++;
          ArrayEmotion[j] = StringEmotion2.charAt(0);
        }
      }
    }
  }

  public void write(int ChoiceWrite)
  {
    try
    {
      OutputStreamDate = new PrintWriter(new FileOutputStream("file/Date.txt", true));
      OutputStreamEmotion = new PrintWriter(new FileOutputStream("file/Emotion.txt", true));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File.txt not found");
      System.out.println("or could not be opened");
      System.exit(0);
    }

    if (ChoiceWrite == 0)
    {
      //If the String is equal to null
      if(StringDate1 == null)
      {
        OutputStreamDate.println(getDate());
      }

      //If the string is different from the current date update it
      else if (!StringDate1.equals(getDate()))
      {
        OutputStreamDate.println(getDate());
      }
      OutputStreamDate.close();
    }

    //Function is in StreamEmotion.java
    if (ChoiceWrite == 1)
    {
      OutputStreamEmotion.println(StringEmotion);

      OutputStreamEmotion.close();
    }
  }

  public String getDate()
  {
    Date myDate = new Date();
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    String date = DATE_FORMAT.format(myDate);

    return date;
  }
}

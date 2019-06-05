package file;

public class StreamDate extends AbstractStream
{
  private static String Text1;
  private static String Text2;
  private static String Text3;

  public void RAW()
  {
    read(0);
    write(0);

    if (CountDifferentDate == 1)
    {
      if (ArrayDate[getCount()-1].equals("01"))
      {
        setText("01", "02", "03");
      }

      if (ArrayDate[getCount()-1].equals("02"))
      {
        setText("02", "03", "04");
      }

      if (ArrayDate[getCount()-1].equals("03"))
      {
        setText("03", "04", "05");
      }

      if (ArrayDate[getCount()-1].equals("04"))
      {
        setText("04", "05", "06");
      }

      if (ArrayDate[getCount()-1].equals("05"))
      {
        setText("05", "06", "07");
      }

      if (ArrayDate[getCount()-1].equals("06"))
      {
        setText("06", "07", "08");
      }

      if (ArrayDate[getCount()-1].equals("07"))
      {
        setText("07", "08", "09");
      }

      if (ArrayDate[getCount()-1].equals("08"))
      {
        setText("08", "09", "10");
      }

      if (ArrayDate[getCount()-1].equals("09"))
      {
        setText("09", "10", "11");
      }

      if (ArrayDate[getCount()-1].equals("10"))
      {
        setText("10", "11", "12");
      }

      if (ArrayDate[getCount()-1].equals("11"))
      {
        setText("11", "12", "01");
      }

      if (ArrayDate[getCount()-1].equals("12"))
      {
        setText("12", "01", "02");
      }
    }

    if (CountDifferentDate == 2)
    {
      if (ArrayDate[getCount()-1].equals("01"))
      {
        setText("12", "01" , "02");
      }

      if (ArrayDate[getCount()-1].equals("02"))
      {
        setText("01", "02" , "03");
      }

      if (ArrayDate[getCount()-1].equals("03"))
      {
        setText("02", "03" , "04");
      }

      if (ArrayDate[getCount()-1].equals("04"))
      {
        setText("03", "04" , "05");
      }

      if (ArrayDate[getCount()-1].equals("05"))
      {
        setText("04", "05" , "06");
      }

      if (ArrayDate[getCount()-1].equals("06"))
      {
        setText("05", "06" , "07");
      }

      if (ArrayDate[getCount()-1].equals("07"))
      {
        setText("06", "07" , "08");
      }

      if (ArrayDate[getCount()-1].equals("08"))
      {
        setText("07", "08" , "09");
      }

      if (ArrayDate[getCount()-1].equals("09"))
      {
        setText("08", "09" , "10");
      }

      if (ArrayDate[getCount()-1].equals("10"))
      {
        setText("09", "10" , "11");
      }

      if (ArrayDate[getCount()-1].equals("11"))
      {
        setText("09", "11" , "12");
      }

      if (ArrayDate[getCount()-1].equals("12"))
      {
        setText("11", "12" , "01");
      }
    }

    if (CountDifferentDate == 3)
    {
      if (ArrayDate[getCount()-1].equals("01"))
      {
        setText("11", "12" ,"01");
      }

      if (ArrayDate[getCount()-1].equals("02"))
      {
        setText("12", "01" ,"02");
      }

      if (ArrayDate[getCount()-1].equals("03"))
      {
        setText("01", "02" ,"03");
      }

      if (ArrayDate[getCount()-1].equals("04"))
      {
        setText("02", "03" ,"04");
      }

      if (ArrayDate[getCount()-1].equals("05"))
      {
        setText("03", "04" ,"05");
      }

      if (ArrayDate[getCount()-1].equals("06"))
      {
        setText("04", "05" ,"06");
      }

      if (ArrayDate[getCount()-1].equals("07"))
      {
        setText("05", "06" ,"07");
      }

      if (ArrayDate[getCount()-1].equals("08"))
      {
        setText("06", "07" ,"08");
      }

      if (ArrayDate[getCount()-1].equals("09"))
      {
        setText("07", "08" ,"09");
      }

      if (ArrayDate[getCount()-1].equals("10"))
      {
        setText("08", "09" ,"10");
      }

      if (ArrayDate[getCount()-1].equals("11"))
      {
        setText("09", "10" ,"11");
      }

      if (ArrayDate[getCount()-1].equals("12"))
      {
        setText("10", "11" ,"12");
      }
    }
  }

  public static int getCount()
  {
    return CountDate;
  }

  public static String getMonth(int i)
  {
    return ArrayDate[i];
  }

  public void setText(String date1, String date2, String date3)
  {
    Text1 = date1;
    Text2 = date2;
    Text3 = date3;
  }

  public static String getText1()
  {
    return Text1;
  }

  public static String getText2()
  {
    return Text2;
  }

  public static String getText3()
  {
    return Text3;
  }
}

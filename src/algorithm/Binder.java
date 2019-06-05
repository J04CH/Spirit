package algorithm;

import file.StreamDate;
import file.StreamEmotion;

public class Binder
{
  private String[][] ArrayBind;

  public void Bind()
  {
    ArrayBind = new String[StreamDate.getCount()][2];

    for (int i = 0; i < StreamDate.getCount(); i++)
    {
      ArrayBind[i][0] = StreamDate.getMonth(i);
    }

    for (int i = 0; i < StreamEmotion.getCount(); i++)
    {
      ArrayBind[i][1] = StreamEmotion.getEmotion(i);
    }
  }

  public String[][] getArrayBind()
  {
    return ArrayBind;
  }
}

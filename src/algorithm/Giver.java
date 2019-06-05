package algorithm;

import file.StreamEmotion;

public class Giver
{
  private StreamEmotion[] act;
  private StreamEmotion BonAct;

  public Giver()
  {
    act = new StreamEmotion[12];
    for (int i = 0; i < 12; i++)
    {
      act[i] = new StreamEmotion();
    }
  }

  public StreamEmotion getAct(String texte)
  {
    if(texte.equals("01"))
    {
      BonAct = act[0];
    }

    if(texte.equals("02"))
    {
      BonAct = act[1];
    }

    if(texte.equals("03"))
    {
      BonAct = act[2];
    }

    if(texte.equals("04"))
    {
      BonAct = act[3];
    }

    if(texte.equals("05"))
    {
      BonAct = act[4];
    }

    if(texte.equals("06"))
    {
      BonAct = act[5];
    }

    if(texte.equals("07"))
    {
      BonAct = act[6];
    }

    if(texte.equals("08"))
    {
      BonAct = act[7];
    }

    if(texte.equals("09"))
    {
      BonAct = act[8];
    }

    if(texte.equals("10"))
    {
      BonAct = act[9];
    }

    if(texte.equals("11"))
    {
      BonAct = act[10];
    }

    if(texte.equals("12"))
    {
      BonAct = act[11];
    }
    return BonAct;
  }
}

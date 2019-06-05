package com.JoJoProductions.Spirit.FakeAI.SuperClass;

public class Functions extends Algorithms
{
  public String EmotionSport()
  {
    String EmotionSport = "";
    int[] Emotion = Emotion();
    int[] Sport = Sport();

    if ((Emotion[0] >= 4) && (Sport[0] >= 4))
    {
      EmotionSport = "Your emotion improved with more sport activity";
    }

    if ((Emotion[1] >= 4) && (Sport[0] >= 4))
    {
      EmotionSport = "Your emotion stagnated with more sport activity";
    }

    if ((Emotion[2] >= 4) && (Sport[0] >= 4))
    {
      EmotionSport = "Your emotion deteriorated with more sport activivty";
    }

    if ((Emotion[0] >= 4) && (Sport[1] <= -4))
    {
      EmotionSport = "Your emotion improved with less sport activity";
    }

    if ((Emotion[1] >= 4) && (Sport[1] <= -4))
    {
      EmotionSport = "Your emotion stagnated with less sport activity";
    }

    if ((Emotion[2] >= 4) && (Sport[1] <= -4))
    {
      EmotionSport = "Your emotion deteriorated with less sport activity";
    }

    return EmotionSport;
  }

  public String EmotionSleepYN()
  {
    String EmotionSleepYN = "";
    int[] Emotion = Emotion();
    int[] SleepYN = SleepYN();

    if ((Emotion[0] >= 4) && (SleepYN[0] >= 4))
    {
      EmotionSleepYN = "Your emotion improved with better sleep quality";
    }

    if ((Emotion[1] >= 4) && (SleepYN[0] >= 4))
    {
      EmotionSleepYN = "Your emotion stagnated with better sleep quality";
    }

    if ((Emotion[2] >= 4) && (SleepYN[0] >= 4))
    {
      EmotionSleepYN = "Your emotion deteriorated with better sleep quality";
    }

    if ((Emotion[0] >= 4) && (SleepYN[1] <= -4))
    {
      EmotionSleepYN = "Your emotion improved with worse sleep quality";
    }

    if ((Emotion[1] >= 4) && (SleepYN[1] <= -4))
    {
      EmotionSleepYN = "Your emotion stagnated with worse sleep quality";
    }

    if ((Emotion[2] >= 4) && (SleepYN[1] <= -4))
    {
      EmotionSleepYN = "Your emotion deteriorated with worse sleep quality";
    }

    return EmotionSleepYN;
  }

  public String EmotionTobacco()
  {
    String EmotionTobacco = "";
    int[] Emotion = Emotion();
    int[] Tobacco = Optional();

    if ((Emotion[0] >= 4) && (Tobacco[0] >= 4))
    {
      EmotionTobacco = "Your emotion improved with more usage of tobacco";
    }

    if ((Emotion[0] >= 4) && (Tobacco[1] <= -4))
    {
      EmotionTobacco = "Your emotion improved with less usage or no usage of tobacco";
    }

    if ((Emotion[1] >= 4) && (Tobacco[0] >= 4))
    {
      EmotionTobacco = "Your emotion stagnated with more usage of tobacco";
    }

    if ((Emotion[1] >= 4) && (Tobacco[1] <= -4))
    {
      EmotionTobacco = "Your emotion stagnated with less usage or no usage of tobacco";
    }

    if ((Emotion[2] >= 4) && (Tobacco[0] >= 4))
    {
      EmotionTobacco = "Your emotion deteriorated with more usage of tobacco";
    }

    if ((Emotion[2] >= 4) && (Tobacco[1] <= -4))
    {
      EmotionTobacco = "Your emotion deteriorated with less or no usage of tobacco";
    }

    return EmotionTobacco;
  }

  public String EmotionDrugs()
  {
    String EmotionDrugs = "";
    int[] Emotion = Emotion();
    int[] Drugs = Optional();

    if ((Emotion[0] >= 4) && (Drugs[2] >= 4))
    {
      EmotionDrugs = "Your emotion improved with more usage of drugs";
    }

    if ((Emotion[0] >= 4) && (Drugs[3] <= -4))
    {
      EmotionDrugs = "Your emotion improved with less usage or no usage of drugs";
    }

    if ((Emotion[1] >= 4) && (Drugs[2] >= 4))
    {
      EmotionDrugs = "Your emotion stagnated with more usage of drugs";
    }

    if ((Emotion[1] >= 4) && (Drugs[3] <= -4))
    {
      EmotionDrugs = "Your emotion stagnated with less usage or no usage of drugs";
    }

    if ((Emotion[2] >= 4) && (Drugs[2] >= 4))
    {
      EmotionDrugs = "Your emotion deteriorated with more usage of drugs";
    }

    if ((Emotion[2] >= 4) && (Drugs[3] <= -4))
    {
      EmotionDrugs = "Your emotion deteriorated with less or no usage of drugs";
    }

    return EmotionDrugs;
  }

  public String EmotionAlcohol()
  {
    String EmotionAlcohol = "";
    int[] Emotion = Emotion();
    int[] Alcohol = Optional();

    if ((Emotion[0] >= 4) && (Alcohol[4] >= 4))
    {
      EmotionAlcohol = "Your emotion improved with more usage of alcohol";
    }

    if ((Emotion[0] >= 4) && (Alcohol[5] <= -4))
    {
      EmotionAlcohol = "Your emotion improved with less usage or no usage of alcohol";
    }

    if ((Emotion[1] >= 4) && (Alcohol[4] >= 4))
    {
      EmotionAlcohol = "Your emotion stagnated with more usage of alcohol";
    }

    if ((Emotion[1] >= 4) && (Alcohol[5] <= -4))
    {
      EmotionAlcohol = "Your emotion stagnated with less usage or no usage of alcohol";
    }

    if ((Emotion[2] >= 4) && (Alcohol[4] >= 4))
    {
      EmotionAlcohol = "Your emotion deteriorated with more usage of alcohol";
    }

    if ((Emotion[2] >= 4) && (Alcohol[5] <= -4))
    {
      EmotionAlcohol = "Your emotion deteriorated with less or no usage of alcohol";
    }

    return EmotionAlcohol;
  }

  public String SleepYNSport()
  {
    String SleepYNSport = "";
    int[] SleepYN = SleepYN();
    int[] Sport = Sport();

    if ((SleepYN[0] >= 4) && (Sport[0] >= 4))
    {
      SleepYNSport = "Your sleep quality improved with more sport activity";
    }

    if ((SleepYN[1] <= -4) && (Sport[0] >= 4))
    {
      SleepYNSport = "Your sleep quality deteriorated with more sport activity";
    }

    if ((SleepYN[0] >= 4) && (Sport[1] <= -4))
    {
      SleepYNSport = "Your sleep quality improved with less sport activity";
    }

    if ((SleepYN[1] <= -4) && (Sport[1] <= -4))
    {
      SleepYNSport = "Your sleep quality deteriorated less sport activity";
    }

    return SleepYNSport;
  }

  public String SleepYNTobacco()
  {
    String SleepYNTobacco = "";
    int[] SleepYN = SleepYN();
    int[] Tobacco = Optional();

    if ((SleepYN[0] >= 4) && (Tobacco[0] >= 4))
    {
      SleepYNTobacco = "Your sleep quality improved with more usage of tobacco";
    }

    if ((SleepYN[0] >= 4) && (Tobacco[1] <= -4))
    {
      SleepYNTobacco = "Your sleep quality improved with less or no usage of tobacco";
    }

    if ((SleepYN[1] <= -4) && (Tobacco[0] >= 4))
    {
      SleepYNTobacco = "Your sleep quality deteriorated with more usage of tobacco";
    }

    if ((SleepYN[1] <= -4) && (Tobacco[1] <= -4))
    {
      SleepYNTobacco = "Your sleep quality deteriorated with less or no usage of tobacco";
    }

    return SleepYNTobacco;
  }

  public String SleepYNDrugs()
  {
    String SleepYNDrugs = "";
    int[] SleepYN = SleepYN();
    int[] Drugs = Optional();

    if ((SleepYN[0] >= 4) && (Drugs[2] >= 4))
    {
      SleepYNDrugs = "Your sleep quality improved with more usage of drugs";
    }

    if ((SleepYN[0] >= 4) && (Drugs[3] <= -4))
    {
      SleepYNDrugs = "Your sleep quality improved with less or no usage of drugs";
    }

    if ((SleepYN[1] <= -4) && (Drugs[2] >= 4))
    {
      SleepYNDrugs = "Your sleep quality deteriorated with more usage of drugs";
    }

    if ((SleepYN[1] <= -4) && (Drugs[3] <= -4))
    {
      SleepYNDrugs = "Your sleep quality deteriorated with less or no usage of drugs";
    }

    return SleepYNDrugs;
  }

  public String SleepYNAlcohol()
  {
    String SleepYNAlcohol = "";
    int[] SleepYN = SleepYN();
    int[] Alcohol = Optional();

    if ((SleepYN[0] >= 4) && (Alcohol[4] >= 4))
    {
      SleepYNAlcohol = "Your sleep quality improved with more usage of tobacco";
    }

    if ((SleepYN[0] >= 4) && (Alcohol[5] <= -4))
    {
      SleepYNAlcohol = "Your sleep quality improved with less or no usage of tobacco";
    }

    if ((SleepYN[1] <= -4) && (Alcohol[4] >= 4))
    {
      SleepYNAlcohol = "Your sleep quality deteriorated with more usage of tobacco";
    }

    if ((SleepYN[1] <= -4) && (Alcohol[5] <= -4))
    {
      SleepYNAlcohol = "Your sleep quality deteriorated with less or no usage of tobacco";
    }

    return SleepYNAlcohol;
  }

  public String WeightEmotion()
  {
    String WeightEmotion = "";
    int[] Emotion = Emotion();
    int Weight = Weight();

    if ((Emotion[0] >= 4) && (Weight == 1))
    {
      WeightEmotion = "Your emotion improved with an overall gain in weight";
    }

    if ((Emotion[1] >= 4) && (Weight == 1))
    {
      WeightEmotion = "Your emotion stagnated with an overall gain in weight";
    }

    if ((Emotion[2] >= 4) && (Weight == 1))
    {
      WeightEmotion = "Your emotion deteriorated with an overall gain in weight";
    }

    if ((Emotion[0] >= 4) && (Weight == 0))
    {
      WeightEmotion = "Your emotion improved with no changes in weight";
    }

    if ((Emotion[1] >= 4) && (Weight == 0))
    {
      WeightEmotion = "Your emotion stagnated with no changes in weight";
    }

    if ((Emotion[2] >= 4) && (Weight == 0))
    {
      WeightEmotion = "Your emotion deteriorated with no changes in weight";
    }

    if ((Emotion[0] >= 4) && (Weight == -1))
    {
      WeightEmotion = "Your emotion improved with an overall loss in weight";
    }

    if ((Emotion[1] >= 4) && (Weight == -1))
    {
      WeightEmotion = "Your emotion stagnated with an overall loss in weight";
    }

    if ((Emotion[2] >= 4) && (Weight == -1))
    {
      WeightEmotion = "Your emotion deteriorated with an overall loss in weight";
    }

    return WeightEmotion;
  }

  public String WeightSport()
  {
    String WeightSport = "";
    int[] Sport = Sport();
    int Weight = Weight();

    if ((Weight == 1) && (Sport[0] >= 4))
    {
      WeightSport = "Your overall weight went up with more sport activity";
    }

    if ((Weight == 1) && (Sport[1] <= -4))
    {
      WeightSport = "Your overall weight went up with less sport activity";
    }

    if ((Weight == 0) && (Sport[0] >= 4))
    {
      WeightSport = "Your overall weight did not change with more sport activity";
    }

    if ((Weight == 0) && (Sport[1] <= -4))
    {
      WeightSport = "Your overall weight did not change with less sport activity";
    }

    if ((Weight == -1) && (Sport[0] >= 4))
    {
      WeightSport = "Your overall weight went down with more sport activity";
    }

    if ((Weight == -1) && (Sport[1] <= -4))
    {
      WeightSport = "Your overall weight went down with less activity";
    }

    return WeightSport;
  }

  public String WeightTobacco()
  {
    String WeightTobacco = "";
    int[] Tobacco = Optional();
    int Weight = Weight();

    if ((Weight == 1) && (Tobacco[0] >= 4))
    {
      WeightTobacco = "Your overall weight went up with more usage of tobacco";
    }

    if ((Weight == 1) && (Tobacco[1] <= -4))
    {
      WeightTobacco = "Your overall weight went up with less or no usage of tobacco";
    }

    if ((Weight == 0) && (Tobacco[0] >= 4))
    {
      WeightTobacco = "Your overall weight did not change with more usage of tobacco";
    }

    if ((Weight == 0) && (Tobacco[1] <= -4))
    {
      WeightTobacco = "Your overall weight did not change with less or no usage of tobacco";
    }

    if ((Weight == -1) && (Tobacco[0] >= 4))
    {
      WeightTobacco = "Your overall weight went down with more usage of tobacco";
    }

    if ((Weight == -1) && (Tobacco[1] <= -4))
    {
      WeightTobacco = "Your overall weight went down with less or no usage of tobacco";
    }

    return WeightTobacco;
  }

  public String WeightDrugs()
  {
    String WeightDrugs = "";
    int[] Drugs = Optional();
    int Weight = Weight();

    if ((Weight == 1) && (Drugs[2] >= 4))
    {
      WeightDrugs = "Your overall weight went up with more usage of drugs";
    }

    if ((Weight == 1) && (Drugs[3] <= -4))
    {
      WeightDrugs = "Your overall weight went up with less or no usage of drugs";
    }

    if ((Weight == 0) && (Drugs[2] >= 4))
    {
      WeightDrugs = "Your overall weight did not change with more usage of drugs";
    }

    if ((Weight == 0) && (Drugs[3] <= -4))
    {
      WeightDrugs = "Your overall weight did not change with less or no usage of drugs";
    }

    if ((Weight == -1) && (Drugs[2] >= 4))
    {
      WeightDrugs = "Your overall weight went down with more usage of drugs";
    }

    if ((Weight == -1) && (Drugs[3] <= -4))
    {
      WeightDrugs = "Your overall weight went down with less or no usage of drugs";
    }

    return WeightDrugs;
  }

  public String WeightAlcohol()
  {
    String WeightAlcohol = "";
    int[] Alcohol = Optional();
    int Weight = Weight();

    if ((Weight == 1) && (Alcohol[4] >= 4))
    {
      WeightAlcohol = "Your overall weight went up with more usage of alcohol";
    }

    if ((Weight == 1) && (Alcohol[5] <= -4))
    {
      WeightAlcohol = "Your overall weight went up with less or no usage of alcohol";
    }

    if ((Weight == 0) && (Alcohol[4] >= 4))
    {
      WeightAlcohol = "Your overall weight did not change with more usage of alcohol";
    }

    if ((Weight == 0) && (Alcohol[5] <= -4))
    {
      WeightAlcohol = "Your overall weight did not change with less or no usage of alcohol";
    }

    if ((Weight == -1) && (Alcohol[4] >= 4))
    {
      WeightAlcohol = "Your overall weight went down with more usage of alcohol";
    }

    if ((Weight == -1) && (Alcohol[5] <= -4))
    {
      WeightAlcohol = "Your overall weight went down with less or no usage of alcohol";
    }

    return WeightAlcohol;
  }
}

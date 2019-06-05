package algorithm;

import java.text.DecimalFormat;

public class Computer
{
  private int sum;
  private float statistics_top;
  private float statistics_moyen;
  private float statistics_passuper;

  public void calculate(int top, int moyen, int passuper)
  {
    sum = top + moyen + passuper;
    statistics_top = (float) top/sum;
    statistics_moyen = (float) moyen/sum;
    statistics_passuper = (float) passuper/sum;
  }

  public float getStatsTop()
  {
    return statistics_top;
  }

  public float getStatsMoyen()
  {
    return statistics_moyen;
  }

  public float getStatsPasSuper()
  {
    return statistics_passuper;
  }
}

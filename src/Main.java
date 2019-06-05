import gui.Fenetre;
import file.StreamDate;

public class Main
{
  public static void main(String[] args)
  {
    StreamDate StreamDate = new StreamDate();
    StreamDate.RAW();
    Fenetre Fenetre = new Fenetre(StreamDate.getDate());
  }
}

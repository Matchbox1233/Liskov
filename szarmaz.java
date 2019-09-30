class szarmaz
{
  public class szulo
  {
    public void uzenet ()
    {
      System.out.println ("Az ős üzenete");
    }
  };
  public void fgv (szulo szul)
  {
    szul.uzenet ();
  }
  public class gyerek extends szulo
  {
    public void uzenet ()
    {
      System.out.println ("A gyerek üzenete");
    }
  };
  public static void main (String args[])
  {
    szarmaz szarm = new szarmaz ();
    szulo szul = szarm.new gyerek ();
    szul.uzenet ();
    gyerek gyer = szarm.new gyerek ();
    szarm.fgv (gyer);
  }
}

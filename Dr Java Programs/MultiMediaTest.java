public class MultiMediaTest
{
  public static void main(String[]args)
  {
    World w = new World(300,300);
     World w2 = new World();
      World w3 = new World(true);
    
    Turtle t = new Turtle(w);
     Turtle t2 = new Turtle(100,200,w2);
      Turtle t3 = new Turtle(w3);
  }
}
   
//Jacob Allen 5/2/2019

import java.util.Scanner;
import java.awt.*;

public class DrawingTurtle extends Turtle
  {

  ////////////////// constructors ///////////////////////

  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public DrawingTurtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public DrawingTurtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public DrawingTurtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public DrawingTurtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
   /////////////////// methods ///////////////////////
  public void drawSquare(int sideLength)

  {

      setPenColor(Color.BLUE);

      forward(sideLength);

      turnRight();

      setPenColor(Color.MAGENTA);

      forward(sideLength);

      turnRight();

      setPenColor(Color.GREEN);

      forward(sideLength);

      turnRight();

      setPenColor(Color.RED);

      forward(sideLength);
  }
public void drawRectangle(int width, int height, int degree);

public void drawPentagon(int sideLength, int degree);

public void drawHexagon(int sideLength, int degree);

public void drawOctagon(int sideLength, int degree);

public void drawDecagon(int sideLength, int degree);
}
public void drawSquare()
  {
    forward(100);
    turnRight();
    forward(100);
    turnRight();
    forward(100);
    turnRight();
    forward(100);
  }

//add your new methods here
  
public void drawRectangle(int width, int height, int degree);

public void drawPentagon(int sideLength, int degree);

public void drawHexagon(int sideLength, int degree);

public void drawOctagon(int sideLength, int degree);

public void drawDecagon(int sideLength, int degree);

public static void main(String[]args);

{

World w = new World();

DrawingTurtle draw = new   DrawingTurtle(300,400, w);


  draw.drawSquare(100);    


}  



 

  
  
  

  
  
  
  
  
  
}
  
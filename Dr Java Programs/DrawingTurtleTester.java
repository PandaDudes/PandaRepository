public class DrawingTurtleTester  

{

public static void main(String[]args)  

{

World w = new World();

DrawingTurtle draw = new   DrawingTurtle(300,200, w);

  draw.drawSquare(100);    

}  
draw.drawRectangle(100, 200, 90);

draw.drawPentagon(100, 72);

draw.drawHexagon(100, 60);

draw.drawOctagon(75, 45);

draw.drawDecagon(50, 36);
}
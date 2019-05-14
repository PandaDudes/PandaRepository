import java.util.Scanner; 

public class TireCheck
{  
  
  public  void tirePressure(int rFront, int lFront, int rBack, int lBack)
 {
    
      if (rFront == lFront && rBack == lBack)
       System.out.println("Inflation is ok");
      if (rFront != lFront || rBack != lBack)
      System.out.println("Inflation is not ok");
      
   //check if the front pressures are the same and the back pressures are the same
   //if they are output a message "Tire pressure OK"
   //otherwise output a message "Tire pressure is NOT OK"
}
  
  
  
  public static void main(String[]args)
  {
    TireCheck tires = new TireCheck();  
    tires.tirePressure(32, 32, 29, 30);

    tires.tirePressure(32, 32, 31, 31);
 
  }
  
}
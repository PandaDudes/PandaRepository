import java.util.Scanner; 

public class GradeCheck
{  
  
  public void gradeAverage(int grade1, int grade2, int grade3, int grade4)
 {
    double sum = grade1 + grade2 + grade3 + grade4;
    double average = sum/4;
  if (average< 0 || average >100)    
   System.out.println ("error");
  else if (average >90 && average <=100)
      System.out.println ("You have an A");  
 else if (average >80 && average <=90)
       System.out.println ("You have a B");  
 else if (average >70 && average <=80)
       System.out.println ("You have a C");  
  else if (average >60 && average <=70)
       System.out.println ("You have a D");
  else
    System.out.println ("You have an F");
}
  
  
  
  public static void main(String[]args)
  {
     GradeCheck myClass = new GradeCheck(); 
     myClass.gradeAverage(100, 90, 80, 70);  //average 85 --> You have a B
     myClass.gradeAverage(-10, -10, -10, -10); //error
     myClass.gradeAverage(50, 50, 50, 50); //average 50 --> You have an F
     myClass.gradeAverage(90, 90, 100, 100); //average 95 --> You have an A
    
  }
  
}
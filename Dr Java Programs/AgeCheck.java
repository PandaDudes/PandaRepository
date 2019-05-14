import java.util.Scanner; 

public class AgeCheck
{  
public void checkAge()
  {
    Scanner keyboard = new Scanner (System.in);// Set up the Scanner object for input.
    int age;    //make a variable for age
    System.out.print("Age:  ");  //ask the user's age
    age = keyboard.nextInt();    //get the user's age
    if (age<0)
      System.out.println("Error");
    if (age>=0 && age <5)  //age is greater than 0 and less than 5
      System.out.println("You are a toddler");
    else if (age>=5 && age<13)  //age is greater than or equal to 5 and less than 13
      System.out.println("You are a child");
   else if (age>=13 && age<19) //age is greater than or equal to  13 and less than 5
      System.out.println("You are a teenager");
   else //age 19 and above
      System.out.println("You are an adult");
}
//run the program with different ages and see if the values make sense.
//age = -1  error
//age = 0  toddler
//age = 4  toddler
//age = 5  child
//age = 12  child
//age = 13  teenager
//age = 19  teenager
//age = 2  adult

public static void main(String[]args)
  {
    AgeCheck  yourAge = new AgeCheck();
    yourAge.checkAge();
  }
  
}
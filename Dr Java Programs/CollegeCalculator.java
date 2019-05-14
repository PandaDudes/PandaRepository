//Jacob Allen

  //---------------------------------------------------------

  //Input the tuition, housing, books and food cost to determine the cost of college

import java.util.Scanner;

 

public class CollegeCalculator

{

   public static void main (String[] args)

  {
double housing = 0;
          // create double variable housing and assign it 0
double tuition = 0;
          //create double variable tuition and assign it 0
double food = 0;
          //create double variable food and assign it 0
double books = 0;
          //create double variable books and assign it 0
double totalExpenses = 0;
          //create double variable totalExpenses and assign it 0
Scanner scan = new Scanner(System.in);
         

          //create a Scanner object called scan

          System.out.println("Enter the estimated price of tuition.");
tuition = scan.nextDouble();
          //capture user input with scan.nextDouble() and store in tuition varaible

          System.out.println("Enter the estimated price of housing.");
housing = scan.nextDouble();
          //capture user input with scan.nextDouble() and store in housing varaible

          System.out.println("Enter the estimated price of books.");
books = scan.nextDouble();
          //capture user input with scan.nextDouble() and store in books varaible

          System.out.println("Enter the estimated price of food.");
food = scan.nextDouble();
          //capture user input with scan.nextDouble() and store in food varaible

         

        totalExpenses = (tuition+housing+books+food);

       

        System.out.println("The total estimated expenses for the semester are $" + totalExpenses + ".");

      }
}
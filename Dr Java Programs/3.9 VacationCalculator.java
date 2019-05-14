import java.util.Scanner;

 

public class VacationCalculator

{

   public static void main (String[] args)

  {
double hotel = 0;

double airplaneTicket = 0;

double spendingMoney= 0;

double days= 0;

double vacationCost= 0;

Scanner scan = new Scanner(System.in);

          System.out.println("Enter the estimated price of your hotel for a day.");
hotel = scan.nextDouble();

          System.out.println("Enter the amount of days you will be staying at the hotel.");
days = scan.nextDouble();

          System.out.println("Enter the estimated price of your airplane ticket.");
airplaneTicket = scan.nextDouble();

          System.out.println("Enter the estimated price of your spending money.");
spendingMoney = scan.nextDouble();

        vacationCost = (days*hotel+airplaneTicket+spendingMoney);

       

        System.out.println("The total approximate expenses for the vacation are $" + vacationCost + ".");

      }
}
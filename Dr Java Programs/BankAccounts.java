import java.util.Scanner; 

public class BankAccounts {
  public void checkCharge() {
    Scanner keyboard = new Scanner (System.in);
    int checking;
  
    System.out.print("Checkings: ");
  
    checking = keyboard.nextInt();
  
    int saving;
  
    System.out.print("Savings: ");
  
    saving = keyboard.nextInt();
  
    if(checking > 1000 || saving > 1500) {
  
      System.out.println("no service charge");
  
    } else {
      System.out.println(" $0.15 charge per check");
      
      //get information from the user on the savings and checking balance
      // if a customer has more than $1000 dollars in their checking account or more than $1500 dollars in their savings account, 
      //then output "No service charge for writing checks"
      //otherwise output "You have a .15 per check service fee" 
    }
  }

  public static void main(String[]args) {
    BankAccounts accounts  = new BankAccounts();
    accounts.checkCharge();
  }
}
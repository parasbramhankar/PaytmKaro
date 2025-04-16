import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer>customerArrayList=new ArrayList<>();
        ArrayList<Account>accountArrayList=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        char ch;
  do {

      System.out.println("Enter: ");
      System.out.println("1:Create new Customer");
      System.out.println("2:Create the bank account");
      System.out.println("3:Deposit Amount");
      System.out.println("4:Withdraw Amount");
      System.out.println("5:Check Balance");
      System.out.println("6:Check Customer details");
      System.out.println("7:Change user Name");
      System.out.println("8:Change Pin");
      System.out.println("9:Delete Account");
      System.out.println("10:Delete Customer");

      int choice = scanner.nextInt();

      switch (choice) {

          case 1: //Register new Customer
              CreateCustomer createCustomer=new CreateCustomer();
              customerArrayList=createCustomer.createUser();
              break;

          case 2: //Create Account
               AccountOperation accountOperation=new AccountOperation();
               accountOperation.createBankAccount(customerArrayList);
               accountArrayList=accountOperation.getAccounts();
               break;

          case 3://Deposit amount
                 Transactions transactions=new Transactions();
                 transactions.depositAmount(customerArrayList,accountArrayList);
                 break;

          case 4:
              Transactions transaction=new Transactions();
              transaction.withdrawAmount(customerArrayList,accountArrayList);
              break;

          case 5://Check Balance
                CheckDetails checkDetails=new CheckDetails(accountArrayList,customerArrayList);
                checkDetails.checkBalance();
                break;

          case 6: //check customer details
              CheckDetails check=new CheckDetails(accountArrayList,customerArrayList);
              check.displayCustomerDetails();
              break;

          case 7: //Change userName


              break;

          default:
              System.out.println("Invalid Input...!");
              break;
      }


      System.out.print("Do you to continue ?:(Y/N)");
      while (true){
          ch=scanner.next().charAt(0);

          if(ch=='Y'||ch=='y'||ch=='n'||ch=='N') {
          break;
          }
          else{
              System.out.println("Invalid Input:(For yes Enter Y/y or For no Enter N/n)");
          }
      }

  } while(ch=='y'||ch=='Y');





    }
}
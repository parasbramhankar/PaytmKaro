import java.util.ArrayList;
import java.util.Scanner;

public class MakeChanges {
   Scanner scanner=new Scanner(System.in);
    ArrayList<Account>accounts;
    ArrayList<Customer>customers;

    MakeChanges(ArrayList<Account>accounts,ArrayList<Customer>customers){
       this.customers=customers;
       this.accounts=accounts;
   }
    void changeUserName(){
        System.out.println("Enter the UserName");
        String userName= scanner.next();

        for(Customer customer:customers){
            if(customer.getUserName().equals(userName)){
                System.out.println("Enter the Account number: ");
                String accNumber= scanner.next();

                for(Account account:accounts){
                    if(account.getAccountNumber().equals(accNumber)){
                        System.out.println("Enter pin: ");
                        String pass= scanner.next();
                        if(account.getPassword().equals(pass)){
                            System.out.println("Enter the new user Name: ");
                            String newUserName= scanner.next();

                        }
                    }
                }
            }
        }
    }

}

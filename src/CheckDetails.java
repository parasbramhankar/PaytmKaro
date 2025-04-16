import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckDetails {
    Scanner scanner=new Scanner(System.in);
    ArrayList<Account>accountArrayList;
    ArrayList<Customer>customerArrayList;

    CheckDetails(ArrayList<Account>accountArrayList,ArrayList<Customer>customerArrayList){
        this.accountArrayList=accountArrayList;
        this.customerArrayList=customerArrayList;
    }

    void checkBalance(){
        System.out.println("Enter the Account Number");
        String accNum=scanner.next();

        for(Account account:accountArrayList){
            if(account.getAccountNumber().equals(accNum)){
                System.out.println("Enter the password: ");
                String password= scanner.next();
                if(account.getPassword().equals(password)){
                    System.out.println("Credentials are match successfully");
                    System.out.println("Available balance: "+account.getBalance());
                }


            }
        }
    }

    void displayCustomerDetails() {
        System.out.println("Enter the Customer ID: ");
        String id = scanner.next();

        boolean found = false;

        for (Customer customer : customerArrayList) {

            if (customer.getCustomerId().equals(id)) {
                System.out.println("\n--- Customer Details ---");
                System.out.println(customer);

                // Now look for the matching account
                for (Account account : accountArrayList) {
                    if (account.getCustomerDetails().getCustomerId().equals(id)) {
                        System.out.println("\n--- Account Details ---");
                        System.out.println(account);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No account found for this customer.");
                }

                return;
            }
        }

        System.out.println("❌ Customer with ID " + id + " not found.");
    }


}

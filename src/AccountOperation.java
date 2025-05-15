import java.util.ArrayList;
import java.util.Scanner;

public class AccountOperation {
    
    public ArrayList<Account>accounts=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    public void createBankAccount(ArrayList<Customer>customerArrayList){
        AccountOperation accountOperation=new AccountOperation();

        System.out.println("Enter the Customer Id");
        String customerId= scanner.next();

        boolean found=false;

        for(Customer customer:customerArrayList){
            if(customer.getCustomerId().equals(customerId)){
                System.out.println("Customer Exist");
                accountOperation.enterAccountDetails(customer);
                found=true;
                break;
            }
        }

        if(!found){
            System.out.println("Customer does not exist, Please enter correct customer Id");
        }
    }


    void enterAccountDetails(Customer customer){
        Account account=new Account();

        account.setCustomerDetails(customer);

        System.out.println("Enter Account Number for the user: ");
        String accountNumber= scanner.next();
        account.setAccountNumber(accountNumber);

        System.out.println("Enter Password: ");
        String password=scanner.next();
        account.setPassword(password);

        System.out.println("Enter Initial Amount: ");
        double amount= scanner.nextDouble();
        account.setBalance(amount);
        accounts.add(account);
    }

    ArrayList<Account> getAccounts(){
        return accounts;
    }
    
    
    


}

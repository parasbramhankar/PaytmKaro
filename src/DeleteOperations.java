import java.util.ArrayList;
import java.util.Scanner;

public class DeleteOperations {

    Scanner scanner=new Scanner(System.in);
    ArrayList<Account>accountArrayList=new ArrayList<>();
    ArrayList<Customer>customerArrayList=new ArrayList<>();

    DeleteOperations(ArrayList<Account> accountArrayList,ArrayList<Customer> customerArrayList){
        this.accountArrayList=accountArrayList;
        this.customerArrayList=customerArrayList;
    }

    void deleteAccount(){
        boolean status=false;
        System.out.println("Enter the Customer Id: ");
        String id= scanner.next();

        for(Customer customer:customerArrayList){
            if(customer.getCustomerId().equals(id)){
                for(Account account:accountArrayList){
                    if(account.getCustomerId().equals(id)){
                        System.out.println("Enter the password: ");
                        String password=scanner.next();

                        if(account.getPassword().equals(password)){
                            accountArrayList.remove(account);
                            status=true;
                            break;
                        }

                    }
                }
            }
        }

        if(status){
            System.out.println("Your Account deleted successfully");
        }else{
            System.out.println("Invalid entry please try again");
        }

    }


    void deleteCustomer(){
        boolean status=false;
        System.out.println("Enter the Customer Id: ");
        String id= scanner.next();

        for(Customer customer:customerArrayList){
            if(customer.getCustomerId().equals(id)){
                for(Account account:accountArrayList){
                    if(account.getCustomerId().equals(id)){
                        System.out.println("Enter the password: ");
                        String password=scanner.next();

                        if(account.getPassword().equals(password)){
                            accountArrayList.remove(account);
                            customerArrayList.remove(customer);
                            status=true;
                            break;
                        }

                    }
                }
            }
        }

        if(status){
            System.out.println("Customer Details deleted successfully");
        }else{
            System.out.println("Invalid...!, please try again");
        }
    }
}

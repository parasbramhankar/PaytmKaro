import java.util.ArrayList;
import java.util.Scanner;


public class CreateCustomer {

    ArrayList<Customer>customers=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

     ArrayList<Customer> createUser(){

        Customer customer=new Customer();

        System.out.println("Enter customerId");
        String id= scanner.next();

        System.out.println("Enter Customer Name");
        String customerName= scanner.nextLine();

        System.out.println("Enter User Name: ");
        String userName= scanner.next();

        System.out.println("Enter Phone Number");
        String phoneNumber= scanner.next();

        customer.setCustomerId(id);
        customer.setCustomerName(customerName);
        customer.setUserName(userName);
        customer.setPhoneNumber(phoneNumber);
        customers.add(customer);

        return customers;
    }




}

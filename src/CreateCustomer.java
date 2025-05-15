import java.util.ArrayList;
import java.util.Scanner;

/*
The issue you're facing is a common one when using `Scanner.next()` followed by `Scanner.nextLine()`.

🔍 Why is it happening ?

`scanner.next()` reads **only the next token** (i.e., a word) and does not consume the newline character (`\n`) at the end of the input.
Then, when `scanner.nextLine()` is called, it reads the **rest of the current line, which may just be the leftover newline (`\n`) — causing it to appear as if it's skipping input.

Fix:
Add a `scanner.nextLine();` after reading with `next()`  to consume the leftover newline.

🧠 Extra Tip:
Prefer `scanner.nextLine()` for all string inputs (especially names with spaces).
Use `nextInt()`/`next()` when reading simple numbers or words only, and be careful to handle newlines properly.
 */

public class CreateCustomer {

    ArrayList<Customer>customers=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

     ArrayList<Customer> createUser(){

        Customer customer=new Customer();

        System.out.println("Enter customerId");
        String id= scanner.next();
        scanner.nextLine();

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

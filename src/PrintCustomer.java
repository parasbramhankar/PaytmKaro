import java.util.ArrayList;

public class PrintCustomer {

void printCustomer(ArrayList<Customer>customerArrayList){
    System.out.print("All Customer details: ");
    for(Customer customer:customerArrayList){
        System.out.println(customer);
    }
}

}

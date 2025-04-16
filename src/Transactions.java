import java.util.List;
import java.util.Scanner;

public class Transactions {
    Scanner scanner=new Scanner(System.in);

    void depositAmount(List<Customer>customerList,List<Account>accountList){

        System.out.println("Enter UserName: ");
        String userName=scanner.next();

        for(Customer customer:customerList){
            if(customer.getUserName().equals(userName)){

                System.out.println("Enter Account Number: ");
                String accountNumber=scanner.next();

                for (Account account:accountList){
                    if(account.getAccountNumber().equals(accountNumber)){

                        System.out.println("Enter Password for (UserName: "+userName+" "+" Account Number: "+accountNumber);
                        String password= scanner.next();

                        if(account.getPassword().equals(password)){
                            System.out.println("Enter Amount you want to deposit: ");
                            double amount= scanner.nextDouble();
                            amount=amount+account.getBalance();

                            account.setBalance(amount);

                            System.out.println("Balance deposited successfully");

                            System.out.println("Do you want to display account details:(Y/N) ");
                            char ch=scanner.next().charAt(0);

                            if(ch=='Y'||ch=='y'){
                                System.out.println("\n--- Customer Details ---");
                                System.out.println(customer);

                                System.out.println("\n--- Account Details ---");
                                System.out.println(account);
                            }else{
                                System.out.println("Thank You...!!");
                            }
                        }

                    }
                }
            }
        }
    }


    void withdrawAmount(List<Customer>customerList,List<Account>accountList){

        System.out.println("Enter UserName: ");
            String userName=scanner.next();

            for(Customer customer:customerList){
                if(customer.getUserName().equals(userName)){

                    System.out.println("Enter Account Number: ");
                    String accountNumber=scanner.next();

                    for (Account account:accountList){
                        if(account.getAccountNumber().equals(accountNumber)){

                            System.out.println("Enter Password for (UserName: "+userName+" "+" Account Number: "+accountNumber);
                            String password= scanner.next();

                            if(account.getPassword().equals(password)){
                                System.out.println("Enter Amount you want to deposit: ");
                                double amount= scanner.nextDouble();
                                double availableBalance=account.getBalance();

                                if(amount<availableBalance){
                                    System.out.println("❌ Insufficient Balance!");
                                    System.out.println("Available Balance: ₹" + account.getBalance());
                                    System.out.println("Please enter a valid amount.");
                                    amount= scanner.nextDouble();
                                }

                                amount=amount-availableBalance;

                                account.setBalance(amount);

                                System.out.println("Balance withdraw successfully");

                                System.out.println("Do you want to display account details:(Y/N) ");
                                char ch=scanner.next().charAt(0);

                                if(ch=='Y'||ch=='y'){
                                    System.out.println("\n--- Customer Details ---");
                                    System.out.println(customer);

                                    System.out.println("\n--- Account Details ---");
                                    System.out.println(account);
                                }else{
                                    System.out.println("Thank You...!!");
                                }
                            }

                        }
                    }
                }
            }
        }



}

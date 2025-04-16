
public class Account {

    private String customerId;
    private Customer customerDetails;
    private String accountNumber;
    private  String password;
    private double balance;


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Customer getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(Customer customerDetails) {
        this.customerDetails = customerDetails;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerId='" + customerId + '\'' +
                ", customerDetails=" + customerDetails +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class BankAccount 
{
    
    private static int nextAccountNumber = 1;
    private String depositorName;
    private int accNo;
    private String accType;
    private double balance;

    public BankAccount(String depositorName, String accType) {
        this.depositorName = depositorName;
        this.accNo = nextAccountNumber++;
        this.accType = accType;
        this.balance = 0;
    }

    public void createAcc() {
        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + accNo);
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + "successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " successfully.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void balanceInquiry() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("Ayush Makwana", "Savings");
        acc1.createAcc();

        acc1.deposit(10000);
        acc1.balanceInquiry();

        acc1.withdraw(5000);
        acc1.balanceInquiry();
    }
}

class BankAccount 
{
    private double balance;

    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient funds for this withdrawal.");
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

// Class representing the ATM machine
class ATM 
{
    private BankAccount account;

    public ATM(BankAccount account) 
    {
        this.account = account;
    }

    public void checkBalance() 
    {
        System.out.println("Current balance: " + account.getBalance());
    }

    public void deposit(double amount) 
    {
        account.deposit(amount);
    }

    public void withdraw(double amount) 
    {
        account.withdraw(amount);
    }

    public void showMenu() 
    {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
}

// Main class to test the ATM functionality
public class ATMSystem 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(1000); // Initial balance
        ATM atm = new ATM(account);
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        boolean running = true;
        while (running) 
        {
            atm.showMenu();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();
        }
        scanner.close();
    }
}

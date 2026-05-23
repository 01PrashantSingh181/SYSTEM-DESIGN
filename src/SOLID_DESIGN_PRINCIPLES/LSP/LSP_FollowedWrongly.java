//package SOLID_DESIGN_PRINCIPLES.LSP;
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface Account {
//    void deposit(double amount);
//
//    void withdraw(double amount);
//}
//
//class SavingAccount implements Account {
//    double balance;
//
//    public SavingAccount() {
//        balance = 0;
//    }
//
//    @Override
//    public void deposit(double amount) {
//        balance += amount;
//        System.out.println("Deposited " + amount + " in saving account and current balance is " + balance);
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        if (balance >= amount) {
//            balance -= amount;
//            System.out.println("withdrawn " + amount + " from saving account and current balance is " + balance);
//        } else {
//            System.out.println("Insufficient balance");
//        }
//    }
//}
//
//class CurrentAccount implements Account {
//    double balance;
//
//    public CurrentAccount() {
//        balance = 0;
//    }
//
//    @Override
//    public void deposit(double amount) {
//        balance += amount;
//        System.out.println("Deposited " + amount + " in current account and current balance is " + balance);
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        if (balance >= amount) {
//            balance -= amount;
//            System.out.println("withdrawn " + amount + " from current account and current balance is " + balance);
//        } else {
//            System.out.println("Insufficient balance");
//        }
//    }
//}
//
//class FixedTermAccount implements Account {
//    private double balance;
//
//    public FixedTermAccount() {
//        balance = 0;
//    }
//
//    @Override
//    public void deposit(double amount) {
//        balance += amount;
//        System.out.println("Deposited: " + amount + " in Fixed Term Account. New Balance: " + balance);
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        throw new UnsupportedOperationException("Withdrawal not allowed in Fixed Term Account!");
//    }
//}
//
//class BankClient {
//    private List<Account> accounts;
//
//    public BankClient(List<Account> accounts) {
//        this.accounts = accounts;
//    }
//
//    public void processTransaction() {
//        for (Account acc : accounts) {
//            acc.deposit(1000);
//            if (acc instanceof FixedTermAccount) {
//                System.out.println("Skipping withdrawal for Fixed Term Account.");
//            } else {
//                try {
//                    acc.withdraw(500);
//                } catch (UnsupportedOperationException e) {
//                    System.out.println("Exception: " + e.getMessage());
//                }
//            }
//        }
//
//    }
//
//
//}
//
//public class LSP_FollowedWrongly {
//    static void main(String[] args) {
//        List<Account> accounts = new ArrayList<>();
//        accounts.add(new SavingAccount());
//        accounts.add(new CurrentAccount());
//        accounts.add(new FixedTermAccount());
//
//        BankClient client = new BankClient(accounts);
//        client.processTransaction();
//    }
//}

package example.com;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    public void removeAccount(Account account) {
        if (accounts.remove(account)) {
            System.out.println("Account removed: " + account.getAccountNumber());
        } else {
            System.out.println("Account not found: " + account.getAccountNumber());
        }
    }

    public void depositMoney(Account account, double amount) {
        if (accounts.contains(account)) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawMoney(Account account, double amount) {
        if (accounts.contains(account)) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}


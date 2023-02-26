package account;

import transaction.Deposit;
import transaction.Transaction;
import transaction.Withdrawal;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private final List<Transaction> transactions;
    private final AccountPrinter printer;

    public Account() {
        this.transactions = new ArrayList<>();
        this.printer = new AccountPrinter(this);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void deposit(int amount) {
        Transaction transaction = new Deposit(amount);
        transactions.add(transaction);
    }

    public void withdraw(int amount) {
        Transaction transaction = new Withdrawal(amount);
        transactions.add(transaction);
    }

    public String print() {
        return printer.print();
    }
}

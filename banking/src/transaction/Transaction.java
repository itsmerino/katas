package transaction;

import transaction.vo.TransactionAmount;
import transaction.vo.TransactionDate;
import transaction.vo.TransactionType;

public abstract class Transaction {

    private final TransactionDate date;
    private final TransactionAmount amount;
    private final TransactionType type;
    private final TransactionPrinter printer;

    public Transaction(TransactionType type, Integer amount) {
        this.type = type;
        this.date = new TransactionDate();
        this.amount = new TransactionAmount(amount);
        this.printer = new TransactionPrinter(this);
    }

    public TransactionDate getDate() {
        return date;
    }

    public TransactionAmount getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public String print() {
        return printer.print();
    }
}

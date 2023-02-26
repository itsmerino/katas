package transaction;

import transaction.vo.TransactionType;

public class TransactionPrinter {

    private final Transaction transaction;

    public TransactionPrinter(Transaction transaction) {
        this.transaction = transaction;
    }

    public String print() {
        return String.format("%s\t%s%d",
                transaction.getDate().value(),
                getTransactionTypeSymbol(),
                transaction.getAmount().value());
    }

    private String getTransactionTypeSymbol() {
        return TransactionType.DEPOSIT.equals(transaction.getType()) ? "+" : "-";
    }
}

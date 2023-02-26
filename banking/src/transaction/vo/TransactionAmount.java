package transaction.vo;

import transaction.InvalidTransactionAmountException;

public class TransactionAmount {

    private final Integer amount;

    public TransactionAmount(Integer amount) {
        this.amount = amount;

        validateAmountIsPositive();
    }

    private void validateAmountIsPositive() {
        if (amount <= 0) {
            throw new InvalidTransactionAmountException();
        }
    }

    public Integer value() {
        return amount;
    }
}

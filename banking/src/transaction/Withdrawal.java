package transaction;

import transaction.vo.TransactionType;

public class Withdrawal extends Transaction {

    public Withdrawal(Integer amount) {
        super(TransactionType.WITHDRAWAL, amount);
    }
}

package transaction;

import transaction.vo.TransactionType;

public class Deposit extends Transaction {

    public Deposit(Integer amount) {
        super(TransactionType.DEPOSIT, amount);
    }
}

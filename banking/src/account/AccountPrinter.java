package account;

import transaction.Transaction;

public class AccountPrinter {

    private final Account account;

    public AccountPrinter(Account account) {
        this.account = account;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s\n", getHeaders()));

        for (Transaction transaction : account.getTransactions()) {
            sb.append(String.format("%s\n", transaction.print()));
        }

        return sb.toString().trim();
    }

    private String getHeaders() {
        return String.format("%s\t\t%s", "Date", "Amount");
    }
}

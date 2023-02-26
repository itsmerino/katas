package transaction.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionDate {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    private final Date date;

    public TransactionDate() {
        date = new Date();
    }

    public String value() {
        return DATE_FORMAT.format(date);
    }
}

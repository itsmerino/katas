import account.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import transaction.InvalidTransactionAmountException;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account sut;

    @BeforeEach
    void setup() {
        sut = new Account();
    }

    @Test
    void depositIsDoneWhenAmountIsPositive() {
        assertDoesNotThrow(() -> sut.deposit(1));
    }

    @Test
    void depositFailsWhenAmountIsZeroOrNegative() {
        assertAll(
                () -> assertThrows(InvalidTransactionAmountException.class, () -> sut.deposit(0)),
                () -> assertThrows(InvalidTransactionAmountException.class, () -> sut.deposit(-1))
        );
    }

    @Test
    void withdrawIsDoneWhenAmountIsPositive() {
        assertDoesNotThrow(() -> sut.withdraw(1));
    }

    @Test
    void withdrawFailsWhenAmountIsZeroOrNegative() {
        assertAll(
                () -> assertThrows(InvalidTransactionAmountException.class, () -> sut.withdraw(0)),
                () -> assertThrows(InvalidTransactionAmountException.class, () -> sut.withdraw(-1))
        );
    }

    @Test
    void printIsCorrectlyFormatted() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String today = sdf.format(new Date());

        String sb =
                String.format("%s\t\t%s\n", "Date", "Amount") +
                String.format("%s\t%s\n", today, "+500") +
                String.format("%s\t%s", today, "-100");

        sut.deposit(500);
        sut.withdraw(100);

        assertEquals(sb, sut.print());
    }
}

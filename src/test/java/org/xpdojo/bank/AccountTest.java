package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @Test
    public void createNewAccountWithZeroBalance() {
        Account account = new Account();

        assertThat(account).isNotNull();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAmountOnAccount() {
        Account account = new Account();
        account.deposit(100);

        assertThat(account.balance()).isEqualTo(100);
    }

    @Test
    public void depositAmountOnAccountMultipleTimes() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(100);

        assertThat(account.balance()).isEqualTo(200);
    }

    @Test
    public void depositAmountOnAccountMultipleTimesWithIntOverflow() {
        Account account = new Account();
        account.deposit(Integer.MAX_VALUE);

        assertThrows(RuntimeException.class, () -> account.deposit(Integer.MAX_VALUE));

        assertThat(account.balance()).isEqualTo(Integer.MAX_VALUE);
    }

    @Test
    public void depositNegativeAmountOnAccount() {
        Account account = new Account();

        assertThrows(RuntimeException.class, () -> account.deposit(-1));
    }
}

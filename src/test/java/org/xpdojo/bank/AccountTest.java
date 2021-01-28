package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}

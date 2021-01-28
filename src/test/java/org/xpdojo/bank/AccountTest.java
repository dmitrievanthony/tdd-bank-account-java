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
}

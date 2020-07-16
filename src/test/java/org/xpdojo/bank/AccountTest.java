package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance(){
        Account account = new Account();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void withdrawAnAmountHasBeenDeposited(){
        Account account = new Account();
        account.deposit(20);
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void withdrawAnAmountFromEmptyAccountShouldNotWork(){
        Account account = new Account();
        assertThat(account.withdraw(10)).isFalse();
    }

    @Test
    public void withdrawAnAmountHigherThanAvailable(){
        Account account = new Account();
        account.deposit(20);
        assertThat(account.withdraw(30)).isFalse();
    }


}

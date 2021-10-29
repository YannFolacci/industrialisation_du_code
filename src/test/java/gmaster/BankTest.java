package gmaster;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BankTest {
    private BankClient client;
    private BankClient majorClient;
    private BankAccount account;
    private BankAccount account2;

    @BeforeEach
    public void init() {
        this.client = new BankClient("Toto", 7);
        this.majorClient = new BankClient("Thomas", 27);
        this.account = new BankAccount(0, this.client);
        this.account = new BankAccount(123, this.majorClient);

    }

    @Test
    void should_add_correctly() {
        client.getAccount(0).deposit(10);
        assertEquals(10, client.getAccount(0).getValue());
    }

    @Test
    void should_not_be_major() {
        assertEquals(false, this.client.isMajor());
    }

    @Test
    void birthday_gift() {
        client.birthday(0);
        assertEquals(8, client.age);
        assertEquals(100, client.getAccount(0).getValue());
    }

    @Test
    void should_not_overdraft() {
        client.birthday(0);
        client.getAccount(0).withdraw(500);
        assertEquals(100, client.getAccount(0).getValue());
    }

    @Test
    void should_overdraft() {
        majorClient.getAccount(0).withdraw(500);
        assertEquals(true, majorClient.isMajor());
        assertEquals(-377, majorClient.getAccount(0).getValue());
    }
}
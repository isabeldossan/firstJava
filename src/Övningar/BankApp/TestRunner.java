package Övningar.BankApp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {

    @Test
    public void testGetName() {
        //Arrange - kopia från vårt objekt.
        BankAccount isabelTest = new BankAccount(1000, "Isabel");
        String expected = "Isabel";
        //Act
        String actual = isabelTest.getName();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNewName() {
        BankAccount popp = new BankAccount(10, "Popp");
        int expected = 10000;
        popp.setBalance(10000);
        int actual = 10000;
        assertEquals(expected, actual);
    }



}

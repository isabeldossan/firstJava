package Övningar.BankApp;

public class Main {
    public static void main(String[] args) {

    //Objekt från klassen BankAccount där vi ger ett saldo.
        BankAccount isabel = new BankAccount(7000, "Isabel");
        BankAccount adam = new BankAccount(-100, "Adam");

        isabel.printBalance();

        isabel.setBalance(4000);

        isabel.printBalance();

        isabel.deposit(500);

        isabel.printBalance();

        isabel.withdraw(100);

        isabel.printBalance();

        adam.printBalance();

    }
}

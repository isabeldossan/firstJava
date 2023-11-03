package Övningar.BankApp;

//Skapa ett program BankAccount som kan hålla koll på hur stort saldo man har (pengar på sitt     konto)
//Utöka programmet så att man kan skriva ut saldot.
// Utöka programmet så att man kan bestämma ett nytt värde för saldo
// Utöka programmet så att man kan lägga till och ta bort en viss summa ifrån saldot
//Utöka programmet så att man aldrig kan få ett saldo som är mindre än 0 kronor
public class BankAccount {

//Variabel för vårt saldo, mängden pengar på konto.
//Inget värde ännu, det finns i objekten i Main där de olika
// objekten är olika bankkonton!
    private int saldo;
    private String name;


//Konstruktor
public BankAccount(int mySaldo, String myName) {
    name = myName;
    if (mySaldo < 0) {
        saldo = 0;
    } else {
        saldo = mySaldo;
    }
}


//Metod som inte returnerar som skriver ut saldo.
//Vi kallar på denna metod i Main.
public void printBalance() {
    System.out.println("Your balance is: " + saldo);
}

//Metod för att sätta ny balans på saldot, vi kallar på metoden i Main!
public void setBalance(int newSaldo) {
    saldo = newSaldo;
}

//metod för att lägga ihop deposit & saldo.
public void deposit(int deposit) {
    saldo = saldo + deposit;
}

//Metod för att säkerställa att vi inte kan få minus på kontot.
public void withdraw(int withdraw) {
    if ((saldo-withdraw) < 0) {
        System.out.println("You do not have enough money.");
    } else {
        saldo = saldo - withdraw;
    }
}

//Metod som returnerar.
public int getSaldo() {
    return saldo;
}
public String getName() {
    return name;
}

public void setName(String myName) {
    name = myName;
}



}

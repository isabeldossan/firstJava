package Övningar.calculator.Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Först skapar vi en scanner som tar in två nummer.
        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv in ett nummer: ");
        int firstNumber = Integer.parseInt(scan.nextLine());
        System.out.print("Skriv in ett till nummer: ");
        int secondNumber = Integer.parseInt(scan.nextLine());

//Vi skapar ett Calculator-objekt från klassen Calculator.
        Calculator calc = new Calculator(firstNumber, secondNumber);

//Anropar metoden addition från klassen Calculator där vi har definierat en total sum.
        calc.addition();



    }
}
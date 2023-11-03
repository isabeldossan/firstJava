package Övningar.calculator.Calc;

public class Calculator {

//Här har vi våra två nummer.
    private int numOne;
    private int numTwo;

//Konstruktor med båda numren i sig.
    public Calculator(int firstNumber, int secondNumber) {
        numOne = firstNumber;
        numTwo = secondNumber;
    }

    public void addition() {
    int sum = numOne + numTwo;
        System.out.println("Summan av numren är: " + sum);
    }
}

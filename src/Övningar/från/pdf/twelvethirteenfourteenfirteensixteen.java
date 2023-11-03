package Övningar.från.pdf;

import java.util.Scanner;

public class twelvethirteenfourteenfirteensixteen {
    public static void main(String[] args) {

//compareTwoNumbers();
//modulo();
whatToPay();

    }

    //12.Läs in två tal. Testa om det första talet är mer än dubbelt så stort som det andra talet.
    // I så fall ska meddelandet “För stort“ skrivas ut.

    public static void compareTwoNumbers() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in ditt första tal: ");
        int numOne = Integer.parseInt(scan.nextLine());
        System.out.println("Skriv in ditt andra tal: ");
        int numTwo = Integer.parseInt(scan.nextLine());

        if (numOne * numOne > numTwo) {
            System.out.println("För stort");
        } else {
            System.out.println("Rätt!");
        }
    }


//13 & 14 & 15. Skapa ett program som läser in ett tal och skriver om det är jämnt. Använd modulooperator.

public static void modulo() {

    Scanner scan = new Scanner(System.in);

    System.out.print("Skriv in ett tal för att se om det är jämnt:");
    int num = Integer.parseInt(scan.nextLine());

    if ((num % 2) == 0) {
        System.out.print("Talet är jämnt!");
    } else {
        System.out.println("Talet är inte jämnt");
    }
}
    //16.En firma erbjuder sina kunder 10 procents rabatt om man vid ett inköpstillfälle handlar för
    //minst 1000 kr. Antag för enkelhetens skull att man bara handlar varor av ett visst slag. Skapa ett program som beräknar vad en kund ska betala.
    // Indata till algoritmen ska vara antalet köpta enheter och priset per enhet.

    public static void whatToPay() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Hur många varor har du köpt? ");
        int antalVaror = Integer.parseInt(scan.nextLine());
        int pris = antalVaror * 100;
        System.out.println("Du har köpt: " + antalVaror + " och de kostar 100kr styck, vilket innebär att du ska betala: " + pris);
        double rabatt = pris - (pris * 0.1);

        if (pris >= 1000) {
            System.out.println("Eftersom du handlar för minst 1000kr kommer du få 10% rabatt, ditt nya pris är: " + rabatt);
        }
    }















}

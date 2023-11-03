package Övningar.från.pdf;

import java.util.Scanner;

public class twentytwentyonetwentytwo {
    public static void main(String[] args) {

//twenty();
//twentyone();
twentytwo();

    }

//20.Skapa ett program som läser in ett tal. Om talet är mellan 0 och 9 ska kvadraten på talet skrivas ut.
// Annars ska lämpligt felmeddelande ges.

    public static void twenty() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett tal: ");
        int numOne = Integer.parseInt(scan.nextLine());
        int kvadrat = numOne * numOne;

        if (numOne < 9) {
            System.out.println("Kvadraten av ditt tal är: " + kvadrat);
        } else {
            System.out.println("Fel. Ditt tal måste vara mellan 0-9");
        }
    }
//21.Skapa ett program som testar om ett tal är mindre än -10 eller större än +10. I så fall ska ett lämpligt meddelande ges.

    public static void twentyone() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett nummer: ");
        int numOne = Integer.parseInt(scan.nextLine());

        if (numOne <= -10) {
            System.out.println("Ditt tal är mindre än -10");
        } else if (numOne>= -10 && numOne<= 10) {
            System.out.println("Ditt tal är mellan -10 och +10!");
        } else {
            System.out.println("Ditt tal är större än 10!");
        }
    }


//22.Skapa ett program som testar om ett tal är 0-9 men inte 5. Skriv ut lämplig text.

    public static void twentytwo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett tal: ");
        int input = Integer.parseInt(scan.nextLine());

        if (input == 5) {
            System.out.println("Du får inte skriva 5");
        } else if (input>= 0 && input<=9) {
            System.out.println("Ditt tal är mellan 0-9");
        } else {
            System.out.println("Ditt tal är för högt");
        }



    }










}

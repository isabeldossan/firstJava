package Övningar.från.pdf;

import java.util.Scanner;

public class seventeeneighteennineteen {
    public static void main(String[] args) {
        //seventeen();
        //eighteen();
        nineteen();


    }

    //17.Skapa ett program som läser in två tal och dividerar det första talet med det andra talet.
    // Om det andra talet (nämnaren) är 0 ska ett felmeddelande ges, annars ska kvoten skrivas ut.
    public static void seventeen() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in ditt första tal: ");
        int numOne = Integer.parseInt(scan.nextLine());
        System.out.print("Skriv in ditt andra tal: ");
        int numTwo = Integer.parseInt(scan.nextLine());
        int kvot = numTwo * numOne;

        if (numTwo <= 0) {
            System.out.println("Fel. Ditt andra tal måste vara större än 0");
        } else {
            System.out.println(kvot);
        }
    }
    //18.Skapa ett program där värden på variablerna X och Y läses in. Tilldela variabel A
    //värdet 2 om X är större än 5 + Y, annars tilldela A värdet 5. Skriv ut variabeln A.

    public static void eighteen() {
    Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in värde för variabel X: ");
        int X = Integer.parseInt(scan.nextLine());
        System.out.print("Skriv in värde för variabel Y: ");
        int Y = Integer.parseInt(scan.nextLine());

        if (X < (5 + Y)) {
            System.out.println("A: 2");
        } else {
        System.out.println("A: 5");
        }
    }

//19.En anställd som har timlön får, när arbetstiden överstiger 40 tim en vecka,
//övertidsbetalning för tiden utöver 40 tim med 1 & 1⁄2 tim. Skapa ett program som läser in
//en anställds timlön och en veckas arbetstid. Den totala veckolönen ska beräknas och
//skrivas ut.

    public static void nineteen() {
        Scanner scan = new Scanner(System.in);



    }














    }







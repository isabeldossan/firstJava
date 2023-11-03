package Övningar.från.pdf;

import java.util.Scanner;

public class twentythreefourfivesixseveneight {
    public static void main(String[] args) {
        //twentythree();
        //twentyfour();
        //twentyfive();
        //twentysix();
        //twentyseven();
        twentyeight();
    }
//23.Skapa ett program som testar om ett inläst tal är jämnt delbart med 3 men inte med 30. I
//så fall ska talet divideras med 3.
public static void twentythree() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Skriv in ett tal: ");
    int input = Integer.parseInt(scan.nextLine());

    if (input % 2 == 0) {
        System.out.println(input/3);
    } else {
        System.out.println("Felaktigt tal");
    }
}

//24.Skapa ett program som läser in kroppstemperaturen och skriver ut ett lämpligt meddelande om temperaturen
//är mindre än 35 grader eller större än 42 grader.

public static void twentyfour() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Skriv in din kroppstemperatur för att se om den är normal: ");
    int input = Integer.parseInt(scan.nextLine());

    if (input<= 35) {
        System.out.println("Din temperatur är under 35 grader och du är död");
    } else if (input>= 36 && input<= 41) {
        System.out.println("Din temperatur är normal!");
    } else if (input>= 42) {
        System.out.println("Din temperatur är över 42 och du är sjuk.");
    }
}
//25.Skapa ett program där ett tal läses in och det skrivs ut om talet är positivt eller
//negativt.

public static void twentyfive() {
Scanner scan = new Scanner(System.in);
    System.out.println("Skriv in ett tal för att se om talet är positivt eller negativt");
    int input = Integer.parseInt(scan.nextLine());

    if (input<= 0) {
        System.out.println("Ditt tal är negativt");
    } else if (input>= 1) {
        System.out.println("Ditt tal är positivt");
    }
}

//26.Skapa ett program som läser in två tal och skriver ut det största talet följt av orden “är störst “.
// Om talen är lika ska “Talen är lika“ skrivas ut.

public static void twentysix() {
Scanner scan = new Scanner(System.in);
    System.out.print("Skriv in ditt första tal: ");
    int first = Integer.parseInt(scan.nextLine());
    System.out.print("Skriv in ditt andra tal: ");
    int second = Integer.parseInt(scan.nextLine());

    if (first > second) {
        System.out.println(first + " är störst");
    } else if (first < second) {
        System.out.println(second + " är störst");
    } else if (first == second) {
        System.out.println("Talen är lika");
        }
    }

//27.Skapa ett program som läser in tre tal och avgör vilket tal som är minst. Resultatet ska skrivas ut.

public static void twentyseven() {
Scanner scan = new Scanner(System.in);
    System.out.print("Skriv in ditt första tal: ");
    int first = Integer.parseInt(scan.nextLine());
    System.out.print("Skriv in ditt andra tal: ");
    int second = Integer.parseInt(scan.nextLine());
    System.out.print("Skriv in ett tredje tal: ");
    int third = Integer.parseInt(scan.nextLine());

    if (first<second && first<third) {
        System.out.println(first);
        } else if (second<first && second<third) {
            System.out.println(second);
        } else if (third<first && third<second) {
            System.out.println(third);
        }
    }

//28. Skapa ett program som läser in en temperatur. Om temperaturen är mellan 18 och 25 grader ska meddelandet
// “Lagom temp“ skrivas ut. Om det är varmare än 25grader ska “För varmt“ skrivas ut och om det är kallare än 18grader
// ska “För kallt“ skrivas ut.

public static void twentyeight() {
        Scanner scan = new Scanner(System.in);
    System.out.println("Skriv in en temperatur: ");
    int temp = Integer.parseInt(scan.nextLine());

    if (temp>=18 && temp<=25) {
        System.out.println("Lagom temp");
    } else if (temp<18) {
        System.out.println("För kallt");
    } else if (temp>=26) {
        System.out.println("För varmt");
    }

}









}

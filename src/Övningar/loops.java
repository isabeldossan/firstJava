package Övningar;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

//while loop! skriv ut alla jämna tal mellan 1-100.
int siffra = 2;
while (siffra<= 100) {
    System.out.print(siffra + " ");
    siffra = siffra + 2;
}

        System.out.println();

// samma exempel dvs jämna tal fast med for loop
for (siffra = 2; siffra<= 100; siffra = siffra + 2) {
    System.out.print(siffra + " ");
}

        System.out.println();
//exempel på snyggare for loop där vi skapar "inten" direkt i parantesen.
for (int i = 0; i<100; i+=2) {
    System.out.print((i+2) + " ");
}
        System.out.println();

//Exempel från Staffan- for loop med olika typer av String-metoder. Vi tar in ett ord från användaren och skriver ut alla
        //tecken ett efter ett. Vi sätter sen in loopen i en if-sats eftersom att ordet Ägg är ett undantag och då vill
        //vi skriva ut "ägg är knasigt".

        System.out.print("Skriv in ett valfritt ord: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("ägg")) {
            System.out.println("Ägg är knasigt.");
            } else {
                for (int i=0; i<input.length(); i++) {
                    System.out.println(input.charAt(i));
                        }
                    }







    }
}

package Inlämningsuppgift.Programmering1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kraffs {
    public static void main(String[] args) {


//Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.
//När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive raden med ordet stop


//ArrayList eftersom det är lista med förändlig data & jag vill inte ha med stop-raden sedan när vi räknar ihop raderna.

ArrayList<String> userInput = new ArrayList<String>();
        System.out.println("Skriv in en kort historia på några rader, när du är klar skriv ordet stop på ny rad: ");
        Scanner scan = new Scanner(System.in);

        String input = " ";

        while (true) {
            input = scan.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Du har skrivit in såhär många rader(exklusive stop-raden): " + userInput.size());
                break;
            }
            userInput.add(input);
        }
        System.out.println("Och du har skrivit in såhär många tecken: " + input.length());


//Scanner scan = new Scanner(System.in);

//System.out.println("Please write a short story, when you are done write the word stop: ");
//String input = scan.nextLine();

//Här tar vi inputen från användaren(de 5 namnen) och lägger dem i en lista och splitar stringen till separata strings
//String [] stringArray = input.split(" ");

//for(int i=0; i<stringArray.length; i++) {
        //System.out.print(stringArray[i] + " ");
//}

//while (input.equalsIgnoreCase("stop")) {
        //System.out.println("Tack för din text.");
        //}



    }


}

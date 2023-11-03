package Inlämningsuppgift.Programmering1.TestIsabel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Logic {

//Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.
//När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive raden med ordet stop
//Programmet skall bestå av två klasser: En klass som läser in text och skriver ut resultatet till användaren
//En annan klass som räknar raderna och har koll på antalet tecken
//Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill

//CountingRowsChars (in Methods)

private String rows;
private String chars;

public Logic(String input) {
rows = input;
chars = input;
}

public void printHowManyRows() {
    //ArrayList eftersom det är lista med förändlig data & jag vill inte ha med stop-raden sedan när vi räknar ihop raderna, alltså använda size.
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
    //Gör om min tidigare ArrayList till en Array för att kunna räkna tecken.
    Object[] regularArray = userInput.toArray();
    for (Object obj : regularArray) {
        System.out.print("Och du har skrivit in såhär många tecken: " + regularArray.length);
    }
                                                                        /*+ regularArray.length*/

//Gör om min ArrayList till en vanlig Array!!
    //Använd toCharArray på min vanliga Array för att kunna ta ut alla tecken och räkna dem....
    //använd matches för att hitta mellansteg!


}


//To convert an ArrayList to an Array in Java, use the toArray() method in the List interface,
//which returns an Object array. The method will convert the list elements into the array without disrupting their order.

//To count characters in a string array in Java, you can use a loop to iterate over each string in the array,
//and then use the length() method to determine the number of characters in each string.
//You can add up the lengths of all the strings to obtain the total number of characters in the array.

//Testa att göra om ArrayList till vanlig Array för att kunna splita! Kolla också på variabel out of scope.
    //Testa att göra arrayn såsom Adams exempel i olika klasser!!!!








}

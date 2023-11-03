package Övningar;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

String[] frukter = {"banan", "äpple", "päron"};
        System.out.println(frukter [0] + frukter [2]);

//Också array, fast vi bara vet hur många värden vi vill ha innan vi vet värdena.
//Bra när vi efterhand behöver lägga in data!
int[] nummer = new int[3];
nummer[0] = 10;
nummer[1] = 20;
nummer[2] = 30;
//För att skriva ut alla dessa värden kan vi använda oss av en for loop!
for(int j=0; j<3; j++) {
    System.out.println(nummer[j]);
}

//String Split är en metod för att ta en string & dela upp orden i en array, de blir då egna strings.
String myString = "Jag heter Isabel";
String [] StringArray = myString.split(" ");
//För att sedan skriva ut värden i denna array använder man lättast en for loop!
//Eftersom man inte alltid vet hur lång arrayn är behöver man inte definiera antalet värden i loopen, vi kan använda
//metoden .lenght som auto vet.
for(int i=0; i<StringArray.length; i++) {
    System.out.print(StringArray[i] + " ");
}

System.out.println();

//Skapa ett program som tar in 5 namn och lägger dem i en array för att sedan skriva ut första & sista namnet.
Scanner scan = new Scanner(System.in);
System.out.print("Vänligen skriv in 5 namn: ");
String inputFiveNames = scan.nextLine();
//Här tar vi inputen från användaren(de 5 namnen) och lägger dem i en lista och splitar stringen till separata strings.
String [] stringArray = inputFiveNames.split(" ");
        System.out.print(stringArray[0] + " " + stringArray[4]); //skriver ut första och sista namnet-
        System.out.println(stringArray.length); //skriver ut att det är 5 namn.







    }
}

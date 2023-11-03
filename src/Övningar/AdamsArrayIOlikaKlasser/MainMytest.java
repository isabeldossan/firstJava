package Övningar.AdamsArrayIOlikaKlasser;

import java.util.Scanner;

public class MainMytest {
    public static void main(String[] args) {

//TakeInputAndWriteResult (in main)


        LogicMytest logic = new LogicMytest();
        Scanner scan = new Scanner(System.in);
        System.out.println("Vänligen skriv in en kort historia på några rader(avsluta med stop på egen rad): ");
        String input = scan.nextLine();

        logic.countRowsAndChars(input);

    }
}

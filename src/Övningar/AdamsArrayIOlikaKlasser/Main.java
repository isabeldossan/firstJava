package Övningar.AdamsArrayIOlikaKlasser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        logic.printArray(input);

    }
}

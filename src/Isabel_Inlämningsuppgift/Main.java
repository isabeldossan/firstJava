package Isabel_Inlämningsuppgift;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic myLogicProgramme = new Logic();
        System.out.println("Please write a short story on multiple lines, when done write the word stop on a separate line: ");

        String savedInput = "";
        int savedLines = 0;

        //Min "meny".
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            savedLines++;
            if (!input.equalsIgnoreCase("stop")) {
                savedInput = savedInput + input + " ";
            } else {
                myLogicProgramme.setMyWordArray(savedInput);
                myLogicProgramme.setHowManyLines(savedLines);
                myLogicProgramme.setHowManyChars();
                myLogicProgramme.setTheLongestWord();
                myLogicProgramme.setTotalAmountOfWords();
                break;
            }
        }
        System.out.println("You have written this many chars in total (exclusive the word stop): " + myLogicProgramme.getHowManyChars());
        System.out.println("And you have written this many lines (exclusive the stop-line): " + myLogicProgramme.getHowManyLines());
        System.out.println("___________ Wow a bit extra maybe? Here it comes:___________");
        System.out.println("Your longest word is: " + myLogicProgramme.getTheLongestWord());
        System.out.println("And the amount of words you have written is: " + myLogicProgramme.getTotalAmountOfWords());
    }
}
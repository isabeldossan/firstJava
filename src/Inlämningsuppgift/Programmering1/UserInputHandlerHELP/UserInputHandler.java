package Inlämningsuppgift.Programmering1.UserInputHandlerHELP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputHandler {
    public static List<String> takeUserInput() {
        List<String> userInput = new ArrayList<>();
        System.out.println("Skriv in en kort historia på några rader, när du är klar skriv ordet stop: ");
        Scanner input = new Scanner(System.in);
        while (true) {
            String oneLine = input.nextLine();
            if ("stop".equalsIgnoreCase(oneLine)) {
                break;
            }
            userInput.add(oneLine);
        }
        return userInput;
    } //undersök möjlighet för out of scope!





}

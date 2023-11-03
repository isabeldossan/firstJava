package Inlämningsuppgift.Programmering1.UserInputHandlerHELP;

import java.util.List;

import static Inlämningsuppgift.Programmering1.UserInputHandlerHELP.UserInputHandler.takeUserInput;

public class main {
    public static void main(String[] args) {
        List<String> userInput = takeUserInput();
        System.out.println("Du skrev stopp och du skrev in: ");
        System.out.println(String.join("\n", userInput));


    }
}

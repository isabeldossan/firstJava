package Isabel_Inlämningsuppgift;


public class Logic {

private String[] words;
public int countChars;
public int countLines;
public int countWords;
private String longestWord;

//private boolean exit;

//Skapar en array från input och definierar det som den lokala variabeln words, splitar vid varje mellanslag.
public void setMyWordArray(String input) {
    words = input.split(" ");
}

/*
public void setTheArrayOfWordsWithExit(String input) {
        for (int j = 0; j < words.length; j++) {
            while (true) {
                if (!words[j].equals("stop")) {
                    words = input.split(" ");
                } else {
                    break;
                }
            }
        }
}
public boolean getTheExit() {
    return exit;
}
 */

//Skriver ut alla ord som user skrivit om man vill se.
public void printMyArrayWords() {
    for (String word : words) {
        System.out.print(word + ", ");
        }
    }

//Här räknar vi antal rader utan stop-raden, metoden kallas på efter varje inskriven rad till skillnad från char-metoden som inte kallas på förrän i slutet.
public void setHowManyLines(int savedLines) {
    for (int j = 0; j < savedLines; j++) {
            countLines = savedLines - 1;
        }
    }

//Här räknar vi antal tecken i hela texten utan stop-ordet & utan mellanslag.
public void setHowManyChars() {
    for (int i = 0; i < words.length; i++) {
        char[] eachLetterinArray = words[i].toCharArray();
        for (int j = 0; j < eachLetterinArray.length; j++) {
            countChars++;
            }
        }
    }

//Tar fram det längsta ordet. Använder words som redan är en array av ord utan mellanslag här.
public void setTheLongestWord() {
    int maxlenght = 0; //Denna variabel sätts till maxlängden på varje ord, när loopen går igenom varje ord och hittar ett nytt ord som är längre byts variabeln till nya maxlängden.

    for (int i = 0; i < words.length; i++) {
        if (words[i].length() > maxlenght) {
            maxlenght = words[i].length();
            longestWord = words[i]; //Tillslut sätts longestWord till den maxlängden som hittades.
            }
        }
    }

//Räknar antal ord, eftersom inputen är sparad med " " så kommer inte sista ordet på en rad läggas ihop med första ordet på en ny rad.
public void setTotalAmountOfWords() {
    for (int j = 0; j < words.length; j++) {
        countWords++;
        }
    }

public int getTotalAmountOfWords() {
    return countWords;
    }

public int getHowManyChars() {
    return countChars;
    }
public int getHowManyLines() {
    return countLines;
    }

public String getTheLongestWord() {
    return longestWord;
    }
}
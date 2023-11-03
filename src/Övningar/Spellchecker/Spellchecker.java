package Övningar.Spellchecker;

public class Spellchecker {

//Övning från Staffan. Skapa en metod som heter isLetter(char), som kontrollerar om ett tecken är ett engelsk tecken,
//a-z, metoden returnerar true om tecknet är engelskt och false om inte. Vi har metoden här i Spellchecker och sen anropar
//vi metoden från Main.

public boolean isLetter(char myChar) {
    boolean isLetter = false;

    if(myChar>='a' && myChar>='z') {
        isLetter = true;
    }
    return isLetter;
}

}

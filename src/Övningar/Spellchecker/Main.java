package Övningar.Spellchecker;

public class Main {
    public static void main(String[] args) {

//Vi skapar först ett nytt objekt från klassen Spellchecker här i Main för att anropa metoden.
Spellchecker spell = new Spellchecker();

//Sen skriver vi ut True eller False om myChar är mellan a-z.

if(spell.isLetter('ö')) {
    System.out.println("False");
} else {
    System.out.println("True");
}


    }
}

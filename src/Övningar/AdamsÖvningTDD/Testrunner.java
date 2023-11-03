package Övningar.AdamsÖvningTDD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testrunner {

    //Skapa en testklass och utveckla efter TDD
    @Test
    public void testGetUserName(){
        //Arrange
        //Skapa ett test för en tänkt klass User autogenerera klassen ifrån testklassen
        //Uppdatera testet så att konstruktorn i User får två parametrar av typen String
        User user = new User("Isabel","Password");
        String expected = "Isabel";
        //Act
        String actual = user.getName();
        //Skriv koden som gör att testet i uppgift 3 blir godkänt och spara parametrarna
        // i två attribut: userName, password. För alla kommande uppgifter gör likadant
        // Red – Green – Refactor

        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void testGetPassword(){
        //Arrange
        //Vi skapar en ny klass igenom att referera till en klass som ännu inte
        //Existerar och vi skapar den sedan igenom att hovra över den röda texten
        //och vi klickar för att generera en klass med vårt valda namn!
        //Vi kan sedan också generera en konstruktor ifrån samma linje om vi
        //Skriver in någon information i signaturen!
        User user = new User("Isabel","Password");
        //Vi skriver in vårt förväntade lösenord i expected!
        String expected = "Password";
        //Act
        //Vi hämtar vårt förväntade lösenord ifrån en metod som ännu inte
        //Existerar, vi implementerar sedan metoden och refaktorerar så att
        //Den kan returnera rätt lösenord!
        String actual = user.getPassword();
        //Assert
        //Vi jämför resultaten och ser att de är korrekta!
        assertEquals(expected,actual);
    }

    //Skriv ett test som ändrar userName!
    @Test
    public void testSetUserName(){
        User user = new User("Isabel","Password");
        String expected = "Arthur Dent";

        //Vi implementerar en metod som ändrar vårt namn
        user.setName("Arthur Dent");
        //Vi hämtar sedan namnet till vår actual
        String actual = user.getName();

        //Vi jämför innehållet i expected och actual!
        assertEquals(expected,actual);
    }

    //Skriv ett test som ändrar Password!

    @Test
    public void testSetUserPassword() {
        User user = new User("Isabel", "Password");
        String expected = "NewPassword&";
        user.setPassword("NewPassword&");
        String actual = user.getPassword();
        assertEquals(expected, actual);
    }

//Skriv ett test som ser till att userName inte får vara kortare än 4 tecken.
    @Test
    public void testUserNameAtLeastFourChars() {
        User user = new User("Isabel", "Password");
        String expected = "Isabel";
        user.setName("Je");
        String actual = user.getName();
        assertEquals(expected, actual);
    }

    //Skriv ett test som ser till att lösenordet är minst 7 tecken och högst 20 tecken långt.

    @Test
    public void testPasswordLenghtAtleastSevenDigit() {
        User user = new User("Isabel", "Password");
        String expected = "Password";
        user.setPassword("Golv");
        String actual = user.getPassword();
        assertEquals(expected,actual);
    }

    @Test
    public void testPasswordLenghtLongest() {
        User user = new User("Isabel", "Password");
        String expected = "Password";
        user.setPassword("Loooooooooooooooongpaaaaaswooooord");
        String actual = user.getPassword();
        assertEquals(expected,actual);
    }

//Lösenordet måste innehålla minst en av dessa tecken: !$#&
// (Tips: det finns fler metoder i String)

    @Test
    public void testIfPasswordContainsSpecialCharacter() {
        User user = new User("Isabel", "Password");
        String expected = "Password&&";
        user.setPassword("Password&&");
        String actual = user.getPassword();
        assertEquals(expected, actual);
    }


//En användare börjar alltid typeOfUser som en ”normal” user. Skriv test som hämtar detta attribut
//Det går att ändra typeOfUser genom en metod
//De enda korrekta värden för typeOfUser är ”normal”, ”admin” och ”super”

    @Test
    public void testTypeOfUser() {
        User user = new User("Isabel", "Password&&");
        String expected = "Normal";
        user.setUserType("Normal");
        String actual = user.getUserType();
        assertEquals(expected, actual);
    }

    @Test
    public void testChangeUserType() {
        User user = new User("Isabel", "Password&&");
        String expected = "Super";
        String actual = user.getUserType();
        assertEquals(expected, actual);

    }



}
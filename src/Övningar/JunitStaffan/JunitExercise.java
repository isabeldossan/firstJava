package Övningar.JunitStaffan;

//Detta är testramverk. Detta är importer, liksom Scanner är en import. De behöver alltså ligga ovan public class.
//assertEquals är det vanligaste ramverket.
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class JunitExercise {

//detta är två stycken testfall.
    /*
    @Test
    public void firstTestCase() {

        String text = "Mitt hus";
        int expected = 8;
        int actual = text.length();
        assertEquals(expected, actual);
    }

    @Test
    public void secondTestCase() {
        //Arrange - testdata
        String textTwo = "Jag heter Isabel!";
        int expected = 17;

        //Act- beräkningen
        int actual = textTwo.length();

        //Assert- jämför om vi fick rätt resultat
        assertEquals(expected,actual);
    }
*/
    @Test
    public void Password() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in ett lösenord");
        String password = scan.nextLine();
        System.out.println("Du har valt lösenordet: " + password);

    }










}

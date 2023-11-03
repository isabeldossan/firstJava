package Övningar.FirstTDD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testrunner {

//Skapa ett test eller flera utifrån TDD, alltså skapa testet först
//och autogenerera sedan koden för att skapa en klass som heter Person, få testen
//att gå från red-green-refactor.

    @Test
    public void testGetName() {
        //arrange
        Human isabel = new Human("Isabel", 26, 169, "blonde");
        String expected = "Isabel";
        //act
        String actual = isabel.getName();
        //assert
        assertEquals(expected, actual);
    }
    @Test
    public void testGetAge() {
        Human isabel = new Human("Isabel", 26, 169, "blonde");
        int expected = 26;
        int actual = isabel.getAge();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetHeight() {
        Human isabel = new Human("Isabel", 26, 169, "blonde");
        int expected = 169;
        int actual = isabel.getHeight();
        assertEquals(expected, actual);
    }
    @Test
    public void testHairColor() {
        Human isabel = new Human("Isabel", 26, 169, "blonde");
        String expected = "blonde";
        String actual = isabel.getHairColor();
        assertEquals(expected, actual);
    }

}

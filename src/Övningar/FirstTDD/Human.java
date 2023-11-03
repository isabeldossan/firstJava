package Övningar.FirstTDD;

public class Human {

private String name;
private int age;
private int height;
private String hairColor;

//Konstruktor
public Human(String myName, int myAge, int myHeight, String myHairColor) {
    name = myName;
    age = myAge;
    height = myHeight;
    hairColor = myHairColor;
    }

//Metoder som returnerar namnet på mina objekt
    public String getName() {
    return name;
    }

    public int getAge() {
    return age;
    }

    public int getHeight() {
    return height;
    }

    public String getHairColor() {
    return hairColor;
    }
}

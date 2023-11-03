package Övningar.AdamsExempelTDD;

public class Person {
    private int height;
    private String name;

    public Person(int myHeight, String myName) {
        height = myHeight;
        name = myName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int newName) {
        height = newName;
    }

    public String getName() {
        return name;
    }
}

package Övningar;

public class ints {
    public static void main(String[] args) {

/*Skapa ett program som använder tre tal. Programmet beräknar och skriver ut summan samt medelvärdet
av de tre talen. */

int a = 6 + 4;
int b = 8 + 1;
int c = 3 * 5;
int summa = a + b + c;
int median = summa / 3;
    System.out.println("Summan är: " + summa);
    System.out.println("Medianen är: " + median);

        System.out.println();
/*
Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
Rektangeln sidor ska läsas in. */

int kort = 3;
int lång = 5;

int area = kort * lång;
int omkrets = kort * 2 + lång * 2;
    System.out.println("Arean på rektangeln är: " + area);
        System.out.println("Omkretsen på rektangeln är: " + omkrets);

        System.out.println();

/* Jämför två tal. Om det första är större än det andra skriv ut "Första talet är störst".
Samt "Andra talet är störst om det är tvärtom.
 */

int first = 99;
int second = 101;

if (first > second){
    System.out.println("Första talet är störst");
}
if (first < second) {
    System.out.println("Andra talet är störst");
}


        System.out.println();

/* Jämför två tal. Om det första är jämt delbart med det andra skriv ut "Jämt delbart".
Annars skriv ut "Inte jämt delbart".
 */
int nummer1 = 5;
int nummer2 = 3;
if (nummer1 % nummer2 == 0) {
    System.out.println("Jämt delbart");
} else {
    System.out.println("Inte jämt delbart");
}


//Exempel på att skippa if/else när vi bara har två olika alternativ att välja på!
        int num = 255;
        System.out.println(num < 200 ? "Smaller!" : "Bigger!");




    }
}

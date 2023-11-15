package Inlämningsuppgift.MappTestInlämning;

import java.util.ArrayList;
import java.util.Scanner;

public class Kraffs {
    public static void main(String[] args) {



//Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.
//När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive raden med ordet stop

        System.out.println("Skriv in en kort historia, avsluta med att skriva stop på en egen rad: ");
//ArrayList eftersom att vi då inte behöver bestämma storlek innan, mer dynamisk.
        ArrayList<String> myArrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String lines = null;
        int count = 0;

//Här lägger vi till nya rader till listan.
        while (scan.hasNextLine()) {
            lines = scan.nextLine();
            myArrayList.add(lines);

//Nu ska vi räkna antal tecken i hela inputen(line) istället för rader.
//Jag tar bort space+radbrytning och räknar enbart tecken genom att ta bort "space" som är en char.
            for (int i = 0; i < lines.length(); i++) {
                if (lines.charAt(i) != ' ')
                    count++;
            }
//Här håller vi koll på när stop skrivs in och efter det avslutar vi programmet och skriver ut resultatet.
                if (lines.equalsIgnoreCase("stop")) {
                    myArrayList.remove("stop");
                    System.out.println("Du har skrivit in såhär många rader(exklusive stop-raden): " + myArrayList.size());
                    System.out.println("Och du har skrivit in såhär många tecken(exklusive stop: " + (count - 4)); //räknar tecken minus stop
                    break;
                }
        }

    }

}


package Övningar.från.pdf;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {

//66.I ett array finns ett personnummer.
//Skapa ett program som kontrollerar att födelsedatum och
//de fyra sista siffrorna åtskiljs av ett bindestreck.
//Skriv ut ett felmeddelande om så ej är fallet.

        /*String[] myArray = new String[]{"19840213-2658"}; //<--- Vi har nu skapat ett array, med enbart en position som innehåller
        //hela våran string!

        /*

        if (myArray[0].charAt(myArray[0].length()-5) != '-'){
            System.out.println("No quote found! Please try again!");
        }



        if (!myArray[0].matches("-")){ //<-- kan ge false positives! Var vaken på att matches och contains fungerar lite olika!
            System.out.println("No quote found!");
        }

        if (!myArray[0].contains("-")){
            System.out.println("No quote found! Please try again!");
        }


        if (myArray[0].charAt(8) != '-'){
            System.out.println("No quote found! Please try again!");
        }

        for (int i = 0; i < myArray.length;i++){
            //System.out.println(myArray[i].charAt(8)); //<--Vi kan kontrollera vilken char som finns på indexpositionen där
            //bindestrecket bör existera!
            //System.out.println(myArray[i].charAt(myArray[i].length()-5)); // <-- Vi kollar vad som existerar på punkten där
            //vi backat fem steg ifrån den totala längden av vår string som ligger inuti vårt array!
            if (myArray[i].charAt(myArray[i].length()-5) != '-'){ //<-- Vi kontrollerar om char på position length-5 inte är
                //lika med -
                System.out.println("No quote found! Please try again!");
            }
        }*/


//67.Om den näst sista siffran är jämn i personnumret
//är det en kvinna, om den är ojämn är det
//en man. Avgör om personen i föregående uppgift är man eller kvinna.
        /*
        if (myArray[0].charAt(11) % 2 == 0){ //<-- Vi kollar näst sista siffran och ser om den är ojämn eller inte!
            System.out.println("Kvinna!");
        }   else {
            System.out.println("Man!");
        }

        if (myArray[0].charAt(myArray[0].length()-2) % 2 == 0){ //<-- Vi kollar näst sista siffran och ser om den är ojämn fast mer dynamiskt!
            System.out.println("Kvinna!");
        }   else {
            System.out.println("Man!");
        }
    //System.out.println(myArray[0].charAt(myArray[0].length()-2)); //<-- Vi kan kontrollera att vi fångar rätt siffra bara för att vara säkra!

//68.En array med 50 inlästa tal finns. Fördubbla värdet på talen på varje plats i arrayn.

        int[] longArray = new int[50]; //<-- Vi skapar ett tomt array med 50 platser.
        for (int i = 0;i < longArray.length;i++){
            longArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(longArray));



        for (int i= 0; i < longArray.length; i++){ //<-- vi går igenom arrayet
            longArray[i] = longArray[i] * 2; //<-- vi multiplicerar alla tal med två på alla positioner inom arrayet!
        }
        System.out.println(Arrays.toString(longArray));
*/

//69. En array med 50 inlästa tal finns. Addera talet 2 till talen på indexplats 0, 2, 4,… i arrayn.
/*
  int[] myLongArray = new int[50];
        for (int i = 0; i < myLongArray.length;i+=2){ //<-- Vi ökar i med 2 varje gång. Vilket gör att vi kan öka varannan position.
            myLongArray[i] += 2;
        }
System.out.println(Arrays.toString(myLongArray));


/*
        String tempString = "Hej på dig!";
//char[] tempCharArray = tempString.toCharArray(); //<--- Vi tar en String ifrån vårt stringarray och "hackar" upp det i chars som vi sedan sparar
//Fungerar även rakt av på en string!
        char[] tempCharArray = myLongArray[0].toCharArray(); //<--- Vi tar en String ifrån vårt stringarray och "hackar" upp det i chars som vi sedan sparar
//i ett array av chars!
//System.out.println(tempCharArray[1]);

        for (int i = 0; i<tempCharArray.length;i++){
            System.out.print(tempCharArray[i] + ","); //<-- varje position i vårt nya array är en bokstav (char)
        }
*/



//70.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är positiva.
        //här räknar vi alltså antal tal!!
/*
        int counter = 0; //<-- vi skapar en variabel utanför vår loop så att vi kan komma åt den även efter loopen har utfört sitt jobb!
        for (int i= 0; i <longArray.length; i++){
            if (longArray[i] > 0){ // <-- vi går enbart in i vår ifsats om det nummer som finns på position "i" är mer än 0.
                counter++; //<-- vi ökar vår counter med ett för varje nummer som är över 0.
            }
        }
        System.out.println("Amount of positive numbers:" + counter); // <-- vi skriver ut resultatet efter att vår for loop är klar.

*/


//75.En array med 50 inlästa tal finns. Beräkna och skriv ut summan av alla positiva tal och summan av alla negativa tal i arrayn.

int[] myBigArray = new int[] {4,7,23,6,12,43,89,65,5,9,7,5,3,76,-5,-8,-2,-12,-13,-2};

int counterPositives = 0;
int counterNegatives = 0;

for (int i = 0; i<myBigArray.length; i++) {
    if (myBigArray[i] >0) {
        counterPositives += myBigArray[i];
    } else if (myBigArray[i] <0) {
        counterNegatives += myBigArray[i];
    }
}
        System.out.println(counterPositives + " and " + counterNegatives);



    }
}

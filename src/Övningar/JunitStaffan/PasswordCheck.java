
//DETTA ÄR KODEN VI SKA SKAPA UTIFRÅN TESTFALLET I "PasswordControl"

package Övningar.JunitStaffan;

public class PasswordCheck {


    public boolean check(String password) {

        boolean atLeast8Characters = false;
        boolean atLeastOneDigit = false;
        boolean hasSpecialChar = false;

        if (password.length()>=8) {
            atLeast8Characters = true;
        }
       for (int i=0; i<password.length(); i++) {
           char c = password.charAt(1);
           if (Character.isDigit(c)) {
               atLeastOneDigit = true;
           }
           if (!Character.isLetterOrDigit(c)) {
               hasSpecialChar = true;
           }
       }

       return atLeast8Characters && atLeastOneDigit  && hasSpecialChar;

    }
    }


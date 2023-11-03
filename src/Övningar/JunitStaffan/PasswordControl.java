
//DETTA ÄR TESTFALLS DOKUMENTET.
//Varje public void här med ordet @Test före sig är ett objekt från
//klassen PasswordCheck.

package Övningar.JunitStaffan;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class PasswordControl {

//1. Skapa ett lösenord

    /*
    @Test
    public void testCorrectPassword() {

    //Arrange
    PasswordCheck pass = new PasswordCheck();
    boolean expected = true;

    //Act
    boolean actual = pass.check("password3!");
    //Assert
    assertEquals(expected, actual);
    }
*/

//2. Lösenordet måste ha minst 8 tecken.

    @Test
    public void testLessThan8Characters() {
    //Arrange
    PasswordCheck pass = new PasswordCheck();
    boolean expected = false;

    //Act
    boolean actual = pass.check("pa!ss3");
    //Assert
    assertEquals(expected, actual);
    }

//3. Lösenordet måste ha minst 1 siffra.

    @Test
    public void testNoDigits() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass!wd");
        //Assert
        assertEquals(expected, actual);
    }

//4. Lösenordet måste ha minst 1 specialtecken.
@Test
public void testNoSpecialChar() {
    //Arrange
    PasswordCheck pass = new PasswordCheck();
    boolean expected = false;

    //Act
    boolean actual = pass.check("password4");
    //Assert
    assertEquals(expected, actual);
}




}




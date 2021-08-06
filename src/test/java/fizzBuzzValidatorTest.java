import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class fizzBuzzValidatorTest {

    @Test
    public void enter1ThenReturnTrue() throws Exception {
        //given I am a user
        //When I enter 1
        iFizzBuzzValidator fizz = new fizzBuzzValidator();
        int input = 1;
        //then return true
        assertTrue(fizz.isValidInput(input));
    }
    @Test
    public void enter0ThenReturnTrue() throws Exception {
        //given I am a user
        //When I enter 0
        iFizzBuzzValidator fizz = new fizzBuzzValidator();
        int input = 0;
        //then return true
        assertTrue(!fizz.isValidInput(input));
    }
    @Test
    public void enter300ThenReturnTrue() throws Exception {
        //given I am a user
        //When I enter 300
        iFizzBuzzValidator fizz = new fizzBuzzValidator();
        int input = 300;
        //then return true
        assertTrue(fizz.isValidInput(input));
    }
    @Test
    public void enter301ThenReturnFalse() throws Exception {
        //given I am a user
        //When I enter 301
        iFizzBuzzValidator fizz = new fizzBuzzValidator();
        int input = 301;
        //then return false
        assertTrue(!fizz.isValidInput(input));
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class fizzBuzzTests {
    @Test
    public void given1ThenReturn1() throws Exception{
        //given I am a user
        //when I enter 1
        iFizzBuzz fizz = new FizzBuzz();
        int input = 1;
        String testResult = fizz.giveUsFizzBuzz(input);
        //then return 1
        assertEquals("1", testResult);
    }

    @Test
    public void given2ThenReturn1Comma2() throws Exception{
        //given I am a user
        //when I enter 1
        iFizzBuzz fizz = new FizzBuzz();
        int input = 2;
        String testResult = fizz.giveUsFizzBuzz(input);
        //then return 1,2
        assertEquals("1,2", testResult);
    }

    @Test
    public void given3ThenReturnFizz() throws Exception{
        //given I am a user
        //when I enter 3
        iFizzBuzz fizz = new FizzBuzz();
        int input = 3;
        String testResult = fizz.giveUsFizzBuzz(input);
        //then return String ending in fizz
        assertTrue(testResult.endsWith("fizz"));
    }

    @Test
    public void given5ThenReturnBuzz() throws Exception{
        //given I am a user
        //when I enter 5
        iFizzBuzz fizz = new FizzBuzz();
        int input = 5;
        String testResult = fizz.giveUsFizzBuzz(input);
        //then return String ending in buzz
        assertTrue(testResult.endsWith("buzz"));
    }

    @Test
    public void given6ThenReturnFizz() throws Exception{
        //given I am a user
        //when I enter 6
        iFizzBuzz fizz = new FizzBuzz();
        int input = 6;
        String testResult = fizz.giveUsFizzBuzz(input);
        //then return String ending in fizz
        assertTrue(testResult.endsWith("fizz"));
    }

    @Test
    public void given10ThenReturnBuzz() throws Exception{
        //given I am a user
        //when I enter 10
        iFizzBuzz fizz = new FizzBuzz();
        int input = 10;
        String testResult = fizz.giveUsFizzBuzz(input);
        //then return String ending in buzz
        assertTrue(testResult.endsWith("buzz"));
    }

    @Test
    public void given15ThenReturnFizzBuzz() throws Exception{
        //given I am a user
        //when I enter 15
        iFizzBuzz fizz = new FizzBuzz();
        int input = 15;
        String testResult = fizz.giveUsFizzBuzz(input);
        //then return String ending in fizzbuzz
        assertTrue(testResult.endsWith("fizzbuzz"));
    }
    @Test
    public void given30ThenReturnFizzBuzz() throws Exception{
        //given I am a user
        //when I enter 30
        iFizzBuzz fizz = new FizzBuzz();
        int input = 30;
        String testResult = fizz.giveUsFizzBuzz(input);
        //then return String ending in buzz
        assertTrue(testResult.endsWith("fizzbuzz"));
    }


}


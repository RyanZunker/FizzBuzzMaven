import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;


public class FlowClassTest {

    @Test
        public void testGiven1ThenIsIntCalledOnce(){
            //Given:I have an integer 1
            String input = "1";
            //When: I call my IntegerChecker.isInt
            IIntegerChecker mockIntegerChecker = mock(IIntegerChecker.class);
            iFizzBuzzValidator mockFizzBuzzValidator = mock(iFizzBuzzValidator.class);
            iFizzBuzz mockFizzBuzz = mock(iFizzBuzz.class);

            FlowClass flowClass = new FlowClass(mockIntegerChecker, mockFizzBuzzValidator, mockFizzBuzz);

            given(mockIntegerChecker.isInt((input))).willReturn(true);
            given(mockFizzBuzzValidator.isValidInput(1)).willReturn(true);
            given(mockFizzBuzz.giveUsFizzBuzz(1)).willReturn("1");

            flowClass.flow(input);
            //Then: It is called one time
            verify(mockIntegerChecker, times(1)).isInt(anyString());
        }

    @Test
    public void testGiven1ThenFizBuzzValidatorCalledOnce(){
        //Given:I have an integer 1
        String input = "1";
        //When: I call my IntegerChecker.isInt
        IIntegerChecker mockIntegerChecker = mock(IIntegerChecker.class);
        iFizzBuzzValidator mockFizzBuzzValidator = mock(iFizzBuzzValidator.class);
        iFizzBuzz mockFizzBuzz = mock(iFizzBuzz.class);

        FlowClass flowClass = new FlowClass(mockIntegerChecker, mockFizzBuzzValidator, mockFizzBuzz);

        given(mockIntegerChecker.isInt((input))).willReturn(true);
        given(mockFizzBuzzValidator.isValidInput(1)).willReturn(true);
        given(mockFizzBuzz.giveUsFizzBuzz(1)).willReturn("1");

        flowClass.flow(input);
        //Then: It is called one time
        verify(mockFizzBuzzValidator, times(1)).isValidInput(anyInt());
    }

    @Test
    public void testGiven1giveMeFizzBuzzCalledOnce(){
        //Given:I have an integer 1
        String input = "1";
        //When: I call my IntegerChecker.isInt
        IIntegerChecker mockIntegerChecker = mock(IIntegerChecker.class);
        iFizzBuzzValidator mockFizzBuzzValidator = mock(iFizzBuzzValidator.class);
        iFizzBuzz mockFizzBuzz = mock(iFizzBuzz.class);

        FlowClass flowClass = new FlowClass(mockIntegerChecker, mockFizzBuzzValidator, mockFizzBuzz);

        given(mockIntegerChecker.isInt((input))).willReturn(true);
        given(mockFizzBuzzValidator.isValidInput(1)).willReturn(true);
        given(mockFizzBuzz.giveUsFizzBuzz(1)).willReturn("1");

        flowClass.flow(input);
        //Then: It is called one time
        verify(mockFizzBuzz, times(1)).giveUsFizzBuzz(anyInt());
    }

    @Test
    public void testGivenANonIntegerStringThenIntegerCheckCalledOnce(){
        //Given:I have a non int string
        String input = "ABC";
        //When: I call my IntegerChecker.isInt
        IIntegerChecker mockIntegerChecker = mock(IIntegerChecker.class);
        iFizzBuzzValidator mockFizzBuzzValidator = mock(iFizzBuzzValidator.class);
        iFizzBuzz mockFizzBuzz = mock(iFizzBuzz.class);

        FlowClass flowClass = new FlowClass(mockIntegerChecker, mockFizzBuzzValidator, mockFizzBuzz);

        given(mockIntegerChecker.isInt((input))).willReturn(false);

        flowClass.flow(input);
        //Then: It is called one time
        verify(mockIntegerChecker, times(1)).isInt(anyString());
    }

    @Test
    public void testGivenANonIntegerStringThenInputValidatorNotCalled() {
        //Given:I have a non int string
        String input = "ABC";
        //When: I call my IntegerChecker.isInt
        IIntegerChecker mockIntegerChecker = mock(IIntegerChecker.class);
        iFizzBuzzValidator mockFizzBuzzValidator = mock(iFizzBuzzValidator.class);
        iFizzBuzz mockFizzBuzz = mock(iFizzBuzz.class);

        FlowClass flowClass = new FlowClass(mockIntegerChecker, mockFizzBuzzValidator, mockFizzBuzz);

        given(mockIntegerChecker.isInt((input))).willReturn(false);
        given(mockFizzBuzzValidator.isValidInput(1)).willReturn(false);
        given(mockFizzBuzz.giveUsFizzBuzz(1)).willReturn("1");

        flowClass.flow(input);
        //Then: It is called one time
        verify(mockFizzBuzzValidator, never()).isValidInput(anyInt());
    }

    @Test
    public void testGivenANonIntegerStringThenFizzBuzzNotCalled() {
        //Given:I have a non int string
        String input = "ABC";
        //When: I call my IntegerChecker.isInt
        IIntegerChecker mockIntegerChecker = mock(IIntegerChecker.class);
        iFizzBuzzValidator mockFizzBuzzValidator = mock(iFizzBuzzValidator.class);
        iFizzBuzz mockFizzBuzz = mock(iFizzBuzz.class);

        FlowClass flowClass = new FlowClass(mockIntegerChecker, mockFizzBuzzValidator, mockFizzBuzz);

        given(mockIntegerChecker.isInt((input))).willReturn(false);
        given(mockFizzBuzzValidator.isValidInput(1)).willReturn(false);
        given(mockFizzBuzz.giveUsFizzBuzz(1)).willReturn("1");

        flowClass.flow(input);
        //Then: It is called one time
        verify(mockFizzBuzz, never()).giveUsFizzBuzz(anyInt());
    }

    @Test
    public void testGivenAnIntegerNotBetween0and300ValidatorCalled() {
        //Given:I have an integer not between 0 and 300
        String input = "0";
        //When: I call my IntegerChecker.isInt
        IIntegerChecker mockIntegerChecker = mock(IIntegerChecker.class);
        iFizzBuzzValidator mockFizzBuzzValidator = mock(iFizzBuzzValidator.class);
        iFizzBuzz mockFizzBuzz = mock(iFizzBuzz.class);

        FlowClass flowClass = new FlowClass(mockIntegerChecker, mockFizzBuzzValidator, mockFizzBuzz);

        given(mockIntegerChecker.isInt((input))).willReturn(true);
        given(mockFizzBuzzValidator.isValidInput(0)).willReturn(false);
        given(mockFizzBuzz.giveUsFizzBuzz(1)).willReturn("1");

        flowClass.flow(input);
        //Then: It is called one time
        verify(mockFizzBuzzValidator, times(1)).isValidInput(anyInt());
    }
    @Test
    public void testGivenAnIntegerNotBetween0and300FizzBuzzNotCalled() {
        //Given:I have an integer not between 0 and 300
        String input = "0";
        //When: I call my IntegerChecker.isInt
        IIntegerChecker mockIntegerChecker = mock(IIntegerChecker.class);
        iFizzBuzzValidator mockFizzBuzzValidator = mock(iFizzBuzzValidator.class);
        iFizzBuzz mockFizzBuzz = mock(iFizzBuzz.class);

        FlowClass flowClass = new FlowClass(mockIntegerChecker, mockFizzBuzzValidator, mockFizzBuzz);

        given(mockIntegerChecker.isInt((input))).willReturn(true);
        given(mockFizzBuzzValidator.isValidInput(0)).willReturn(false);
        given(mockFizzBuzz.giveUsFizzBuzz(1)).willReturn("1");

        flowClass.flow(input);
        //Then: It is called one time
        verify(mockFizzBuzz, never()).giveUsFizzBuzz(anyInt());
    }
}


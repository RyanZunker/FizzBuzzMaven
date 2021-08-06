public class FlowClass implements IFlowClass{
    private IIntegerChecker _intChecker;
    private iFizzBuzzValidator _inputValidator;
    private iFizzBuzz _fizzBuzz;
    public FlowClass(IIntegerChecker mockIntegerChecker, iFizzBuzzValidator mockFizzBuzzValidator, iFizzBuzz mockFizzBuzz) {
        this._intChecker = mockIntegerChecker;
        this._inputValidator = mockFizzBuzzValidator;
        this._fizzBuzz = mockFizzBuzz;
    }

    public String flow(String input) {
        boolean isInt = _intChecker.isInt(input);
        if(isInt){
            int integerInput = Integer.parseInt(input);
            boolean isValid = _inputValidator.isValidInput(integerInput);
            if(isValid){
                _fizzBuzz.giveUsFizzBuzz(integerInput);
            }
        }
        return "Please enter an integer between 1 and 300";
    }
}


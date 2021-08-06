public class fizzBuzzValidator implements iFizzBuzzValidator {
    public boolean isValidInput(int input){
        if(input<1 || input>300){
            return false;
        }
        return true;
    }

}

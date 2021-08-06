public class FizzBuzz implements iFizzBuzz{
    public String giveUsFizzBuzz(int max) {
        String returnValue = "";
        for(int i = 1; i <= max; i++){
            if(i%3 == 0){
                if(i%5 == 0){
                    returnValue += "fizzbuzz";
                }
                else{
                    returnValue += "fizz";
                }
            }
            else if(i%5 == 0){
                returnValue += "buzz";
            }
            else{
                returnValue += String.valueOf(i);
            }

            if(i != max){
                returnValue += ",";
            }
        }

        return  returnValue;
    }
}



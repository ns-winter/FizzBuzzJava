/**
 * Created by Nigel Said on 10/07/2017.
 */
public class FizzBuzz {

    public static String fizzBuzz(int number) {
        if ((number % 15) == 0) {
            return "fizzbuzz";
        } else if ((number % 5) == 0) {
            return "buzz";
        } else if ((number % 3) == 0) {
            return "fizz";
        } else {
            String answer = Integer.toString(number);
            return (answer);
        }

    }
}

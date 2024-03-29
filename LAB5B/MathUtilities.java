
/**
 * this class describes some math utilies
 *
 * @author Mert
 * @version Bekdemir
 */
public class MathUtilities
{
    /**
     * method calculator
     * @param firstNumber
     * @param operation
     * @param secondNumber
     * allow user to add subtract multiply divide and mod two double numbers
     */
    public static void calculator(double firstNumber, char operation,double secondNumber){

        double result = 0.0;

        switch(operation){
            case '+' : result = firstNumber + secondNumber;
            break;
            case '-' : result = firstNumber - secondNumber;
            break;
            case '*' : result = firstNumber * secondNumber;
            break;
            case '/' : result = firstNumber / secondNumber;
            if(secondNumber == 0){
                throw new IllegalArgumentException("denominator cannot be zero");
            }
            break;
            case '%' : result = firstNumber % secondNumber;
            if(secondNumber == 0){
                throw new IllegalArgumentException("denominator cannot be zero");
            }
            break;

            default : throw new IllegalArgumentException("operation value was invalid");

        }
        System.out.println("the result of " + firstNumber +operation+secondNumber+ " = " + result);
    }
    /**
     * method sumOddNumbers
     * @param number
     * display all  the odd numbers from 0 to a given positive number, also the method will  add up all the odd numbers and display the result at the end 
     */
    public static double sumOddNumbers(int number){
        int counter = 1;
        int result = 0;
        while(counter <= number){
           
            System.out.println(counter);
            result = result + counter;
            counter = counter + 2;
           
        }
        System.out.println("result is = " + result);
        if(number < 0){
         throw new IllegalArgumentException("number can not be negative");   
        }
        return result;
    }
    
    /**
     * method displaySquareNumbers
     * @param number
     * will display the square of all numbers from 0 to the given number inclusive. 
     */
    public static void displaySquareNumbers(int number){
        int square = 0;
        int counter = 0;
        int counter2 = 1;
        while(number >= counter2){
            
            
            square = counter2 * counter2;
            
            System.out.println("the square of "+counter2+" is = " + square);
            counter2 ++;
            
        }
        while(number < counter){
            
            square = number * number;
            System.out.println("the square of "+number+" is = " + square);
            number++;
        }
    }
    
    /**
     * method getFactrorial
     * @param number
     * 
     */
    
    public static void getFactorial(int number){
        int counter = 1;
        int result = 1;
        while(counter <= number){
            result = result * counter;
            counter++;
        }
        System.out.println("the factorial of "+number+" is = " + result);
    }
}

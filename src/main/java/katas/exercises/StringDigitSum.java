package katas.exercises;

public class StringDigitSum {

    /**
     * Calculates the sum of all digits in the given string.
     *
     * @param input the string containing digits and other characters
     * @return the sum of all digits in the string
     */
    public static int sumOfDigits(String input) {
        int sum=0;
        for(int i=0;i<input.length();i++){
          if(input.charAt(i)>='0'&&input.charAt(i)<='9')  {
              sum=sum+input.charAt(i)-'0';
          }
        }


        return sum;
    }

    public static void main(String[] args) {
        String input1 = "abc123";
        String input2 = "5 cats and 2 dogs";
        String input3 = "No digits here!";

        System.out.println("Sum of digits in '" + input1 + "': " + sumOfDigits(input1));
        System.out.println("Sum of digits in '" + input2 + "': " + sumOfDigits(input2));
        System.out.println("Sum of digits in '" + input3 + "': " + sumOfDigits(input3));
    }
}

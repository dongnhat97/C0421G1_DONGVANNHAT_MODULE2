package _8_CleanCode.practice;

public class FizzBuzz {
    public static String fizzBuzz(int number){
    boolean isFizz = number%3==0;
    boolean isBuzz = number%5==0;
    if (isFizz&&isBuzz) {
            return "FizzBuzz";
        }
    if (isFizz) {
        return "Fizz";
    }
    if (isBuzz) {
        return "buzz";
    }

      return number+"";
    }

    public static void main(String[] args) {
        System.out.println( fizzBuzz(15));
    }
}

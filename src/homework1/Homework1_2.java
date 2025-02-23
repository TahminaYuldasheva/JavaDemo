package homework1;

public class Homework1_2 {
    public static void main(String[] args) {
        int number = 21;

        int firstDigit = number/10;
        int secondDigit = number%10;

        int sumOfDigits = firstDigit+secondDigit;
        System.out.println("The sum of the digits " + number + " is " + sumOfDigits + ".");
    }
}

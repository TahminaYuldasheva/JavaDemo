package homework1;

public class Homework1_3 {
    public static void main(String[] args) {
        int number = 126;
        int firstDigit = number/100;
        int secondDigit = (number/10)%10;
        int thirdDigit = number%10;
        int sumOfDigits = firstDigit+secondDigit+thirdDigit;

        System.out.println("The sum of the digits " + number + " is " + sumOfDigits + ".");

    }
}

package homework1.homework1_4;

public class Homework1_4 {
    public static void roundingOfNumber (double a) {
        double fractionalPart = a % 1;
        if(fractionalPart >= 0.5) {
           a = a - fractionalPart + 1;
        }
        else {
            a -= fractionalPart;
        }
        System.out.println(a);
    }
}

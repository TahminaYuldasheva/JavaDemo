package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        Random random = new Random();
        int number = scanner.nextInt();
        int[] array = new int[number];
        System.out.println("Выберите способ заполнения массива. 1 - случайными числами, 2 - вручную: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(10);
            }

        } else {
            System.out.println("Введите " + number + " элемента(-ов) массива: ");

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        }


        System.out.println(Arrays.toString(array));
        int inputNumber = 0;
        for (int digit : array) {
            inputNumber = inputNumber * 10 + digit;
        }
        inputNumber += 1;
        System.out.println("Числовое представление массива после добавления 1 равно " + inputNumber);

        String str = Integer.toString(inputNumber);
        char[] array2 = str.toCharArray();
        System.out.println("Число " + inputNumber + " преобразовано в массив " + Arrays.toString(array2));
        scanner.close();
    }
}

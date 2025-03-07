package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        Random random = new Random();
        int number = scanner.nextInt();
        int[] array = new int[number];
        System.out.println("Выберите способ заполнения массива: 1 - случайными числами, 2 - вручную. ");
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
        for (int i = 0; i < array.length / 2; i++) {
            int b = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = b;
        }
        System.out.println(Arrays.toString(array));
        scanner.close();
    }
}

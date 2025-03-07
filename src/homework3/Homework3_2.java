package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
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
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        scanner.close();
    }
}

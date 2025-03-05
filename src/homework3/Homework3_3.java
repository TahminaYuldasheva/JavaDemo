package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {
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
        System.out.println("Минимальный элемент в массиве: " + min);
        System.out.println("Максимальный элемент в массиве: " + max);

        int minCounter = 0;
        for (int i = 0; i < array.length; i++) {
              minCounter++;
            if (array[i] == min) {
                break;
            }
        }
        int maxCounter = -1;
        for (int i = 0; i < array.length; i++) {
            maxCounter++;
            if (array[i] == max) {
                break;
            }
        }
        System.out.println("Индекс минимального элемента в неотсортированном массиве: " + minCounter);
        System.out.println("Индекс максимального элемента в неотсортированном массиве: " + maxCounter);
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
        int minValue = Arrays.binarySearch(array, min);
        int maxValue = Arrays.binarySearch(array, max);
        System.out.println("Индекс минимального элемента в отсортированном массиве: " + minValue);
        System.out.println("Индекс максимального элемента в отсортированном массиве: " + maxValue);
        scanner.close();
    }
}

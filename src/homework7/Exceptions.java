package homework7;

public class Exceptions {
    public void methodWithTryCatch(int divisor) {
        try {
            int result = 10 / divisor;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Деление на ноль!");
        }
    }

    public void methodWithMultipleCatch(String str, int[] arr) {
        try {
            System.out.println("Длина строки: " + str.length());
            System.out.println("Третий элемент массива: " + arr[2]);
        } catch (NullPointerException e) {
            System.out.println("Ошибка! Передана null-строка!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Выход за границы массива!");
        }
    }

    public void methodWithMultiCatch(String str, int index) {
        try {
            char ch = str.charAt(index);
            System.out.println("Символ на позиции " + index + ": " + ch);
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Неверная строка или индекс!");
        }
    }

    public void methodWithTryCatchFinally() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Элемент: " + numbers[5]); // Ошибка
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Выход за границы массива!");
        } finally {
            System.out.println("Блок finally выполнен!");
        }
    }
}

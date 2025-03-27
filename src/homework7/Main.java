package homework7;

public class Main {
    public static void main(String[] args) {
        Exceptions exception = new Exceptions();

        System.out.println("Метод 1:");
        exception.methodWithTryCatch(0);

        System.out.println("Метод 2:");
        exception.methodWithMultipleCatch(null, new int[]{1, 2});

        System.out.println("Метод 3:");
        exception.methodWithMultiCatch("Hello!", 10);

        System.out.println("Метод 4:");
        exception.methodWithTryCatchFinally();
    }
}


package homework5.homework5_2;

public class CashMachine {
    private int count20;
    private int count50;
    private int count100;

    public CashMachine(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void addMoney(int add20, int add50, int add100) {
        count20 += add20;
        count50 += add50;
        count100 += add100;
    }

    public boolean withdrawMoney(int sum) {
        if (sum % 10 != 0 || sum < 20) {
            System.out.println("Невозможно выдать данную сумму.");
            return false;
        }

        int originalSum = sum;

        int take100 = Math.min(sum / 100, count100);
        sum -= take100 * 100;

        int take50 = Math.min(sum / 50, count50);
        sum -= take50 * 50;

        int take20 = Math.min(sum / 20, count20);
        sum -= take20 * 20;

        if (sum == 0) {
            count100 -= take100;
            count50 -= take50;
            count20 -= take20;
            System.out.println("Выдано:");
            System.out.println("100 PLN x " + take100);
            System.out.println("50 PLN x " + take50);
            System.out.println("20 PLN x " + take20);
            return true;
        } else {
            System.out.println("Невозможно выдать сумму " + originalSum + " PLN.");
            return false;
        }
    }

    public void showInfo() {
        System.out.println("Текущее состояние банкомата:");
        System.out.println("20 PLN: " + count20 + " шт.");
        System.out.println("50 PLN: " + count50 + " шт.");
        System.out.println("100 PLN: " + count100 + " шт.");
    }

}


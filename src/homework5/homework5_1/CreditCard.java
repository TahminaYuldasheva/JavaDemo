package homework5.homework5_1;

public class CreditCard {
    private final int id;
    private double balance;

    public CreditCard(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void addMoney(double sum) {
        balance += sum;
    }

    public void withdrawMoney(double sum) {
        if (sum <= balance) {
            balance -= sum;
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    public void showInfo() {
        System.out.println("Номер счета: " + id + ", текущий баланс: " + balance);
    }
}


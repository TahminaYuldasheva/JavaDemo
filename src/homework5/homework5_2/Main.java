package homework5.homework5_2;

public class Main {
    public static void main(String[] args) {
        CashMachine atm1 = new CashMachine(15, 10, 25);
        atm1.showInfo();

        atm1.addMoney(2, 3, 1);
        atm1.showInfo();

        atm1.withdrawMoney(400);
        atm1.showInfo();
    }

}

package homework5.homework5_1;

public class Main {
    public static void main(String[] args) {
        CreditCard c1 = new CreditCard(1, 899);
        CreditCard c2 = new CreditCard(2, 901);
        CreditCard c3 = new CreditCard(3, 950);

        c1.addMoney(888.12);
        c2.addMoney(1037);
        c3.withdrawMoney(12.11);

        c1.showInfo();
        c2.showInfo();
        c3.showInfo();
    }
}


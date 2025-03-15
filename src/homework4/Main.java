package homework4;

public class Main {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.fillArray();
        t.printArray();
        while (true) {
            t.firstPlayerMove();
            t.printArray();
            if (t.checkWin('X')) {
                System.out.println("Игра завершена. Победил первый игрок.");
                break;
            }
            if (t.checkDraw()) {
                System.out.println("Игра завершена. Ничья.");
                break;
            }
            t.secondPlayerMove();
            t.printArray();
            if (t.checkWin('0')) {
                System.out.println("Игра завершена. Победил второй игрок.");
                break;
            }
            if (t.checkDraw()) {
                System.out.println("Игра завершена. Ничья.");
                break;
            }
        }
    }
}

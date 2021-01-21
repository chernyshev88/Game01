import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        a = 1 + (int) (Math.random() * 10);
        // write your code here
        game(a);
    }

    public static void game(int a) {
        System.out.println("Игра начинается");
        System.out.println("Угадай число в диапазоне от 1 до 10 или умри");
        System.out.println("У тебя есть 3 попытки");

        for (int x = 3; x > 0; x--) {
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            if (a == b) {
                System.out.println("Ты победил!");
                System.exit(0);
            } else {
                if (x != 1)
                System.out.println("Кол-во оставшихся попыток:  " + (x-1));
                else
                    System.out.println(" *** ЗВУК ВЫСТРЕЛА ***");
            }
        }
        System.out.println("Ты погиб ! ЛОХ! АЗАЗАЗА");
    }

}



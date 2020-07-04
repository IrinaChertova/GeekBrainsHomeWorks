package homeworkthree;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;


public class guessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  userAnswer=-1;

        do {
            int rightAnswer = (int) (Math.random() * 10);
            System.out.println("угадайте число от 0 до 9, у вас 3 попытки");
            for (int count = 2; count >= 0; count--) {
                userAnswer = sc.nextInt();
                if (userAnswer == rightAnswer) {
                    break;
                } else if (userAnswer < rightAnswer) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }
                System.out.println("Осталось попыток: " + count);
            }
            System.out.println((rightAnswer == userAnswer) ? "вы  выиграли!" : "вы проиграли :(");
            System.out.println("Сыграем еще? да - 1, нет - 0");
        } while (sc.nextInt() == 1);
        sc.close();
    }
}
package homeworkthree;

import java.util.Scanner;

public class guessTheWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int answerIndex = (int) (Math.random() * words.length);
        String rightAnswer = words[answerIndex];
        String userAnswer="";
        System.out.println("угадайте слово: овощ или фрукт на английском");

    for (int i=0; i>=0; i++){
            userAnswer=sc.next();
            if (rightAnswer.equals(userAnswer)) {
                break;
            } else {
                System.out.println("Вы не угадали, попробуйте еще раз! Подсказка(совпавшие буквы): ");
                String helpAnswer=""; //подсказка
                for (int j = 0; j < rightAnswer.length() &&j<userAnswer.length(); j++) {
                    char userLetter = userAnswer.charAt(j);
                    char rightLetter = rightAnswer.charAt(j);
                    char helpLetter;
                    if (userLetter == rightLetter) {
                        helpLetter = userLetter;
                    } else {
                        helpLetter = '#';
                    }
                    helpAnswer = helpAnswer + helpLetter;
                }
                System.out.printf("%.15s", helpAnswer+"#################");
                System.out.println();
            }
            }
        System.out.println("Вы выиграли!");
        sc.close();
    }
}

//                char helpLetter=rightAnswer.charAt(i);
//                helpAnswer=helpAnswer+helpLetter;
//                System.out.printf("%.15s", helpAnswer+"#################");
//                System.out.println();
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
// Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно, можно пользоваться:
//String str = "apple";
//str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово
//Используем только маленькие буквы
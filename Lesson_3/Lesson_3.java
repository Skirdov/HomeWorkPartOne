package HomeWorkPartOne.Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Lesson_3 {
    private static Scanner scan = new Scanner(System.in);
    private static Random rnd = new Random();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру 'УГАДАЙ...!'");
        System.out.println("Если Вы хотите отгадывать ЧИСЛА, нажмите 1, если СЛОВА - 2. Для ВЫХОДА нажмите 0");
        boolean onOff = true;
        while (onOff) {
            int game = scan.nextByte();
            if (game > 2) System.out.println("Такой игры пока не существует, попробуйте еще раз :)");
            switch (game) {
                case 1:
                    game_numb();
                    break;
                case 2:
                    game_word();
                    break;
                default:
                    if (game == 0) onOff = false;
            }
        }
    }


    private static void menu() {
        boolean menu = true;
        while (menu) {
            int game_choise = scan.nextByte();
            switch (game_choise) {
                case 1:
                    game_numb();
                    break;
                case 2:
                    game_word();
                    break;
                default:
                    System.out.println("Надеюсь Вам понравились мои игры, возвращайтесь еще!");
                    if (game_choise == 0) System.exit(0); // хз почему 0 тут стоит , но с ним все норм работает
            }
        }
    }

    private static void game_numb() {
        System.out.println("Ваша задача отгадать ЧИСЛО от 0 до 9. У Вас есть 3 попытки");
        int numb = rnd.nextInt(9);
        int tryNumb = 3;
        boolean inGame = true;
        while (inGame) {
            int answ = scan.nextInt();
            if (numb == answ) {
                System.out.println("Вы ВЫИГРАЛИ!!!");
                inGame = false;
            } else if (numb > answ) {
                System.out.println("Введенное число меньше. " + "Осталось " + --tryNumb + " попытки");
            } else if (numb < answ) {
                System.out.println("Введенное число больше. " + "Осталось " + --tryNumb + " попытки");
            }
            if (tryNumb == 0) {
                System.out.println("Очень жаль, но Вы проиграли :(");
                inGame = false;
            }
        }
        System.out.println();
        System.out.println("Хотите сыграть еще раз в УГАДАЙ ЧИСЛО, нажмите 1. Если хотите сыграть в УГАДАЙ СЛОВО, нажмите 2. Для выхода нажмите 0");
        menu();
    }


    private static void game_word() { //слово leak я не стал использовать, т.к. оно выбивается из общего контекста.
        System.out.println("Ваша задача отгадать загаданное слово. Тема овощи, фрукты и всякое такое.");
        System.out.println();
        System.out.println("Для отгадывания используйте маленькие буквы.");
        System.out.println();
        System.out.println("Если Вы владеете английским, нажмите 1, если не очень, нажмите 2 :)");
        boolean inGame = true;
        while (inGame) {
            int lang = scan.nextByte();
            if (lang > 2) System.out.println("Такой язык пока не поддерживается, выберите из списка возможных :)");
            switch (lang) {
                case 1:
                    langEng();
                    break;
                case 2:
                    langRus();
                    break;
            }

        }
    }

    private static void langEng() {
        System.out.println("Введите СЛОВО");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String choise = words[rnd.nextInt(words.length)]; // Выбор слова компьютером
        boolean inGame = true;
        while (inGame) {
            String answ = scan.next(); // Ввод слова игроком
            String right = "";         // Угадываемое слово
            if (choise.equals(answ)) {
                System.out.println("Абсолютно верно! Это слово - " + answ + ". Вы ВЫИГРАЛИ!!!");
                inGame = false;
            } else {
                for (int i = 0; i < 15; i++) {
                    if ((i < answ.length() && i < choise.length()) && (choise.charAt(i) == answ.charAt(i))) {
                        right += answ.charAt(i);
                    } else {
                        right += "#";
                    }
                }
                System.out.println(right);
            }
        }
        System.out.println("Хотите сыграть еще раз в УГАДАЙ СЛОВО, нажмите 2. Если хотите сыграть в УГАДАЙ ЧИСЛО, нажмите 1. Для выхода нажмите 0");
        menu();
    }


    private static void langRus() {
        System.out.println("Введите СЛОВО");
        String[] words = {"яблоко", "апельсин", "лимон", "банан", "абрикос", "авокадо", "брокколи",
                "морковь", "вишня", "чеснок", "виноград", "дыня", "киви", "манго", "грибы",
                "орех", "оливка", "горох", "арахис", "груша", "перец", "ананас", "тыква", "картофель"};
        String choise = words[rnd.nextInt(words.length)]; // Выбор слова компьютером
        boolean inGame = true;
        while (inGame) {
            String answ = scan.next(); // Ввод слова игроком
            String right = "";         // Угадываемое слово
            if (choise.equals(answ)) {
                System.out.println("Абсолютно верно! Это слово - " + answ + ". Вы ВЫИГРАЛИ!!!");
                inGame = false;
            } else {
                for (int i = 0; i < 15; i++) {
                    if ((i < answ.length() && i < choise.length()) && (choise.charAt(i) == answ.charAt(i))) {
                        right += answ.charAt(i);
                    } else {
                        right += "#";
                    }
                }
                System.out.println(right);
            }
        }
        System.out.println("Хотите сыграть еще раз в УГАДАЙ СЛОВО, нажмите 2. Если хотите сыграть в УГАДАЙ ЧИСЛО, нажмите 1. Для выхода нажмите 0");
        menu();
    }
}

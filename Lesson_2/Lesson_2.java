package HomeWorkPartOne.Lesson_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_2 {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        boolean entExt = true;
        while (entExt) {
            System.out.println();
            System.out.println("Введите номер задания от 1 до 7: ");
            System.out.println("Введите 0 для завершения работы");
            byte task = scanner.nextByte();
            if (task > 7) System.out.println("Такой задачи не существует, попробуйте еще раз :)");
            switch (task) {
                case 1:
                    task_1();
                    break;
                case 2:
                    task_2();
                    break;
                case 3:
                    task_3();
                    break;
                case 4:
                    task_4();
                    break;
                case 5:
                    task_5();
                    break;
                case 6:
                    task_6();
                    break;
                case 7:
                    System.out.println("Задача сдвинуть значения в массиве на n шагов");
                    int size = 10; // размер массива
                    int arr[] = new int[size];
                    System.out.println("Введите шаг сдвига. Можно вводить отрицательное значение для сдвига влево и положительное - для сдвига вправо");
                    int step = scanner.nextInt(); // шаг сдвига
                    for (int i = 0; i < arr.length; i++) arr[i] = random.nextInt(99);
                    task_7(arr, step);
                    break;
                default:
                    if (task == 0) entExt = false;
            }
        }
    }

    private static void task_7(int[] arr, int step) {
        step = step % arr.length;
        if (step < 0) step = arr.length + step;
        System.out.println("Исходный массив   " + Arrays.toString(arr));
        for (int i = 0; i < step; i++) {
            int firstIndex = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = firstIndex;
        }

        System.out.println("Измененный массив " + Arrays.toString(arr));
    }


    private static void task_6() {
        System.out.println("Задача выяснить есть ли в массиве место, где сумма правой и левой части будут равны");
        int lSide = 0;
        int rSide = 0;
        int[] arrT6 = {1, 1, 1, 3, 2, 2, 2, 1, 13};
        System.out.println("Введенные значения: " + Arrays.toString(arrT6));
        for (int equal : arrT6) {
            if (lSide < equal) ;
            lSide += equal;
        }
        for (int equal : arrT6)
            if (rSide < lSide) {
                lSide -= equal;
                rSide += equal;
            }
        if (lSide == rSide) System.out.println("Такое место есть!");
        else
            System.out.println("Такого места нет");

    }

    private static void task_5() {
        System.out.println("Задача найти минимальный и максимальный элемент массива");
        int size = 10;
        int[] arrT5 = new int[size];
        int max = 0;
        int min = 0;
        for (int i = 0; i < arrT5.length; i++) {
            arrT5[i] = random.nextInt(); // тут у меня 2 непонятных момента. 1.) Как задать рандом, скажем, от -500 до 500. И 2.) Если я ввожу ограничения, то минимум выдает 0, а если оставляю рандом без
            // ограничений, тогда все норм работает. Как это пофиксить? )
            System.out.println("Сгенеррированные элементы массива: " + arrT5[i]);
            if (min >= arrT5[i]) {
                min = arrT5[i];
            } else if (max <= arrT5[i]) {
                max = arrT5[i];
            }
        }
        System.out.println();
        System.out.println("Минимальный элемент: " + min + " Максимальный элемент: " + max);

    }

    private static void task_4() {
        System.out.println("Задача создать квадратный массив и заполнить диагонали '1'");
        System.out.println("Введите размер массива:");
        int size = scanner.nextByte();
        int[][] arrT4 = new int[size][size];
        for (int i = 0; i < arrT4.length; i++) {
            for (int j = 0; j < arrT4.length; j++) {
                if (j == size - i - 1 || i++ == j++) arrT4[i][j] = 1;
                System.out.print(arrT4[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void task_3() {
        System.out.println("Задача числа меньшие 6 умножить на 2 ");
        int[] arrT3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //System.out.println(Arrays.toString(arrT3));// я хз как это получилось, идея сама подсветила, сделать так для всех я не смог, чтоб работало норм, но выглядит круто )
        for (int i = 0; i < arrT3.length; i++) {
            System.out.print("Заданные числа: " + arrT3[i]);
            if (arrT3[i] < 6) arrT3[i] *= 2;
            System.out.println("  Измененные числа: " + arrT3[i]);
        }
    }

    private static void task_2() {
        System.out.println("Задача заполнить массив с шагом, равным 3 ");
        int[] arrT2 = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println(i * 3);


        }
    }

    private static void task_1() {
        System.out.println("Задача поменять 0 и 1 местами");
        int[] arrT1 = new int[10];
        for (int i : arrT1) {
            i = random.nextInt(2);
            System.out.print("Сгенерированное значение: " + i);
            if (i == 0) {
                i++;
            } else {
                i--;
            }
            System.out.println("  Измененное значение: " + i);

        }
    }
}

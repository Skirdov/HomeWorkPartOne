package HomeWorkPartOne.Lesson_1;

public class Lesson_1 {
    public static void main(String[] args) { // первое задание
        task_8(); // Для выбора задания смени число от 2 до 8
    }

    private static void task_2() { // второе задание
        byte b = 56;
        short s = 4577;
        int i = 4657256;
        long l = 4654651348551L;
        float f = 4.64f;
        double d = 74.78447;
        char c = 'c';
        String name = "Roman";

    }

    private static void task_3() { // третие задание
        int a = 58;
        int b = 116;
        int c = 274;
        int d = 2;
        int result = a * (b + (c / d));
        System.out.println(result);

    }

    private static void task_4() { // четвертое задание
        int a = 8;
        int b = 11;
        int summ = a + b;
        if (summ >= 10 && summ <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }

    private static void task_5() { // пятое задание
        int a = 15;
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static void task_6() { // шестое задание
        int a = -8;
        if (a <= 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static void task_7() { // седьмое задание
        String name = "Roman";
        System.out.println("Привет, " + name);
    }

    private static boolean task_8() { // восьмое задание
        int year = 2020; // можно было бы сделать через сканнер, но такого задания не было :)
        if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        return false;
    }
}

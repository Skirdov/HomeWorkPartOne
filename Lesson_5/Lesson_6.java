package HomeWorkPartOne.Lesson_5;

import java.util.Arrays;

public class Lesson_6 {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Vasiliy", "Slesar'", "VasiliyVodka@forever.ru", 89235675147L, 12700, 44);
        empArr[1] = new Employee("Boris", "Tokar'", "BorisVodka@forever.ru", 89233465443L, 11300, 32);
        empArr[2] = new Employee("Petr", "Glavniy Mehanik", "PetrVodka@forever.ru", 89232267819L, 18240, 56);
        empArr[3] = new Employee("Viktor", "Mashinist Krana", "ViktorVodka@forever.ru", 89239952365L, 14220, 27);
        empArr[4] = new Employee("Sergey", "Stalevar", "SergeyVodka@forever.ru", 89237896512L, 10080, 40);
        System.out.println("Выведены сотруднники старше 40. Начнем сокращения?");
        for (int i = 0; i < empArr.length; i++) {
            if (empArr[i].getAge() >= 40) {
                System.out.print("\n" + "Сотрудник- " + empArr[i].getName() + "\n");
                System.out.print("Должность- " + empArr[i].getPosition() + "\n");
                System.out.print("Возраст- " + empArr[i].getAge() + "\n" + "=============================");

            }


        }

    }
}

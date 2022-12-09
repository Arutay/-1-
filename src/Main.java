public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        {
            for (int i = 0; i <= 10; i = i + 1) {
                System.out.println(i);
            }
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        {
            for (int k = 10; k >= 0; k = k - 1) {
                System.out.println(k);
            }
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
        {
            for (int j = 2; j < 17; j = j + 2) {
                System.out.println(j);
            }
        }
    }


    public static void task4() {
        System.out.println("Задача 4");
        {
            for (int f = 10; f > -11; f = f - 1) {
                System.out.println(f);
            }
        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        {
            for (int f = 1904; f < 2096; f = f + 4) {
                System.out.println(f + " год является високосным");
            }
        }
    }


    public static void task6() {
        System.out.println("Задача 6");
        {
            for (int j = 7; j < 99; j = j + 7) {
                System.out.println(j);
            }
        }
    }


    public static void task7() {
        System.out.println("Задача 7");
        {
            for (int j = 2; j < 513; j = j * 2) {
                System.out.println(j);
            }
        }
    }


    public static void task8() {
        System.out.println("Задача 8");
        {
            int salary = 29000;
            int total = 0;
            for (int i = 0; i < 12; i++) {
                total = total + salary;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
            }
            System.out.println(total);
        }
    }


    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " рублей.");
        }
        System.out.println(total);
    }


    public static void task10() {
        System.out.println("Задача 10");
        for (int i = 2; i <= 2; i = i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();


}}}







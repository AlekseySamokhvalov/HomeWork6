
public class Main {
    public static void main(String[] args) {
          task1(); //Решение задачи 1
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
    public static void task1 () {
        System.out.println("Задача 1");
        for(int i = 1; i < 11; i++){
            System.out.printf(" %d",i);
        }
        System.out.println("");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        for(int i = 10; i > 0; i--){
            System.out.printf(" %d",i);
        }
        System.out.println("");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        for(int i = 2; i < 17; i = i + 2){
            System.out.printf(" %d",i);
        }
        System.out.println("");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        for(int i = 10; i > -11; i--){
            System.out.printf(" %d",i);
        }
        System.out.println("");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        for(int i = 7; i < 100; i = i + 7){
            System.out.printf(" %d",i);
        }
        System.out.println("");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        for(int i = 1; i < 513; i = i * 2){
            System.out.printf(" %d",i);
        }
        System.out.println("");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int savingsPerMonth = 29000;
        int totalSavings = 0;

        for (int month = 1; month <= 12; month++) {
            totalSavings += savingsPerMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей.");
        }
    }

    public static void task9 () {
        System.out.println("Задача 9");
    }

    public static void task10 () {
        System.out.println("Задача 10");
    }
}
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println(" задача 1");

        for (int i = 1; i < 10; i++) {
            System.out.println(" итерация цыкла" + i);
        }
    }

    public static void task2() {
        System.out.println(" задание 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println(" интеграция цыкла " + i);
        }
    }

    public static void task3() {
        System.out.println(" задание 3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(" интеграция цыкла" + i);
        }
    }


    public static void task4() {
        System.out.println(" задание 4");

        for (int i = 10; i > -10; i--) {
            System.out.println(" интеграция цыкла" + i);
        }
    }

    public static void task5() {
        System.out.println(" задание 5");
    }

}


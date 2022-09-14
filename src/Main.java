public class Main {
    public static void main(String[] args) {

        //Задача 4

        byte bottlesOneMinut = 8;

        // Временные интервалы в минутах
        int t1 = 20;
        int t2 = 60 * 24;
        int t3 = 60 * 24 * 3;
        int t4 = 60 * 24 * 30;

        // Производительность
        int pr1 = bottlesOneMinut * t1;
        int pr2 = bottlesOneMinut * t2;
        int pr3 = bottlesOneMinut * t3;
        int pr4 = bottlesOneMinut * t4;

        System.out.println("За 20 минут машина произвела бутылок " + pr1 + " штук");
        System.out.println("За сутки машина произвела бутылок " + pr2 + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + pr3 + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + pr4 + " штук");

    }

}
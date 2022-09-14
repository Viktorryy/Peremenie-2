public class Main {
    public static void main(String[] args) {

        // Задача 8


        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;

        float promotion = (float) 10 /100;
        float promotion1 = promotion + 1;

        float salaryMashaNew = (float)salaryMasha * promotion1;
        float salaryDenisNew =(float)salaryDenis * promotion1;
        float salaryKrisNew = (float)salaryKris * promotion1;

        float salaryMashaProm = (float)salaryMasha * promotion * 12;
        float salaryDenisProm =(float)salaryDenis * promotion * 12;
        float salaryKrisProm = (float)salaryKris * promotion * 12;


        System.out.println("Маша теперь получает " + salaryMashaNew + " рублей. " +
                "Годовой доход вырос на " + salaryMashaProm + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisNew + " рублей. " +
                "Годовой доход вырос на " + salaryDenisProm + " рублей");
        System.out.println("Кристина теперь получает " + salaryKrisNew + " рублей. " +
                "Годовой доход вырос на " + salaryKrisProm + " рублей");


    }
}
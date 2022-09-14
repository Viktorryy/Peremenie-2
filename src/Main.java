public class Main {
    public static void main(String[] args) {

        // Задача 6

        // Вес одной единицы продукта
        short bananOne = 80;
        short milkOne100 = 105;
        short IcecrOne = 100;
        short eggOne = 70;

        // количество каждого продукта
        short bananAmount = 5;
        short milkAmount = 2;
        short IcecrAmount = 2;
        short eggAmount = 4;

        // общее количество каждого продукта
        int bananAll = bananOne * bananAmount;
        int milkAll =  milkOne100 * milkAmount;
        int IcecrAll = IcecrOne  * IcecrAmount;
        int eggAll = eggOne * eggAmount;


        int koktailAll = bananAll + milkAll + IcecrAll + eggAll;

        float koktailKg = (float)koktailAll / 1000;

        System.out.println("Общий вес спортивного коктейля в килограммах " + koktailKg);


    }
}
public class Main {
    public static void main(String[] args) {

        // Задача 5

        short kraskaAll = 120;
        short kraskaWhite = 2;
        short kraskaBrown = 4;
        float klassAll = kraskaAll / (kraskaWhite + kraskaBrown);
        float kraskaWhiteAll = kraskaWhite * klassAll;
        float kraskaBrownAll = kraskaBrown * klassAll;


        System.out.println("В школе, где " + klassAll + " классов, нужно " +
                kraskaWhiteAll + " банок белой краски и " +
                kraskaBrownAll + " банок коричневой краски");


    }
}
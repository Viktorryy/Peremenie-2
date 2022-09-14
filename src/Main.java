public class Main {
    public static void main(String[] args) {

        // Задача 7


        int weightAll = 7;
        int weight1 = 250;
        int weight2 = 500;

        weightAll = weightAll * 1000;

        float time1 = (float)weightAll / weight1;
        float time2 = (float)weightAll / weight2;

        float timeAver = (time1 + time2) / 2;

        System.out.println( time1 + " дней уйдет на коррекцию веса, " +
                "если спортсмен будет терять в весе от 250 граммов в день. ");
        System.out.println( time2 + " дней уйдет на коррекцию веса, " +
                "если спортсмен будет терять в весе 500 граммов в день. ");
        System.out.println( timeAver + " дней уйдет на коррекцию веса в среднем ");


    }
}
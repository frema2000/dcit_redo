public class Main {
    public static void main(String[] args) {

        // sample 1 according to 2a
        double avg1 = Average.calculateClassAverage(80, 90);
        System.out.println("Average of 2 scores: " + avg1);

        // sample 2 according to 2b
        double avg2 = Average.calculateClassAverage(70, 85, 90);
        System.out.println("Average of 3 scores: " + avg2);

        // sample 3 aaccording to 2c
        double[] scores = {75, 80, 85, 90};
        double avg3 = Average.calculateClassAverage(scores);
        System.out.println("Average of array: " + avg3);
    }
}
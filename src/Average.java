public class Average {

    // 2a. for 2 numbers
    public static double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) / 2;
    }

    // 2b. for 3 numbers
    public static double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    // 2c , for an array of numbers
    public static double calculateClassAverage(double[] scores) {
        double sum = 0;

        for (double score : scores) {
            sum += score;
        }

        return sum / scores.length;
    }
}

package assignment2;
import java.util.Arrays;

/**
 * Simple class for task 3 of assignment 2
 * Method to calculate the final score of an athlete
 * @author maria ramlochan
 */
public class Task3 {
    
    public static void main(String[] args) {
        double[] scores = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(scores));
    }
    
    /**
     * Method to calculate the final score by subtracting the sum by min and max
     * @param scores the scores inputted in the array
     * @return the final score of the array
     */
    public static double calcFinalScore(double[] scores) {
        double sum = 0;
        for(double num : scores)
            sum += num;
        double calcFinalScore = (sum - min(scores) - max(scores)) / (scores.length);
        return calcFinalScore;
    }
    
    /**
     * Method to sort through an array of numbers and find the minimum score
     * @param scores the scores inputted in the array
     * @return the minimum number in the array
     */
    public static double min(double[] scores) {
        Arrays.sort(scores);
        return scores[0];  
    }
    
    /**
     * Method to sort through an array of numbers and find the maximum score
     * @param scores the scores inputted in the array
     * @return the maximum number in the array
     */
    public static double max(double[] scores) {
        Arrays.sort(scores);
        return scores[scores.length - 1];
    }
    
}

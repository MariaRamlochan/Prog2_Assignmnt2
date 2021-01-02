package assignment2;
import java.util.Arrays;

/**
 * Simple class for task 2 of assignment 2
 * Method to generate a uniform distribution number
 * @author maria ramlochan
 */
public class Task2 {
    
    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(Arrays.toString(generateUniformDistributionNum(1, 5, 5)));
    }
    
    /**
     * Method to generate uniform distribution number
     * @param startNum the start number in the array
     * @param endNum the last/end number in the array
     * @param amount the amount/length of the array
     * @return the uniform numbers
     */
    public static double[] generateUniformDistributionNum(double startNum, 
            double endNum, int amount) {
        
        double[] uniformNums = new double[amount];
        double distance;
        double switcher;
        if(startNum > endNum) {
            switcher = startNum;
            startNum = endNum; 
            endNum = switcher; 
        }
        if(amount < 2) {
            uniformNums = new double[] {startNum, endNum};
            return uniformNums;
        }
        distance = (endNum - startNum) / (amount - 1);
        uniformNums[0] = startNum;
        for(int i = 1; i < amount; i++)
            uniformNums[i] = Math.round((uniformNums[i - 1] + distance) * 10) / 10.0;
        return uniformNums; 
    }
    
}

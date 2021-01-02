package assignment2;
import java.util.Arrays;

/**
 * Simple class for task 1 of assignment 2
 * Methods to calculate the sum, the average, the minimum, an increase value and a
 * delete for an array.
 * @author maria ramlochan
 */
public class Task1 {

    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        delete(nums, 1);
        System.out.println(Arrays.toString(nums));
    }
    
    /**
     * Method to calculate the sum of an array of numbers
     * @param nums the numbers inputted in the array
     * @return the sum of the numbers
     */
    public static double sum(double[] nums) {
        double sum = 0;
        for(double num : nums)
            sum += num;
        return sum;
    }
    
    /**
     * Method to calculate the average of an array of numbers
     * @param nums the numbers inputted in the array
     * @return the sum of numbers divided by the length which gives the average
     */
    public static double avg(double[] nums) {
        return sum(nums)/nums.length; 
    }
    
    /**
     * Method to sort through an array of numbers and find the minimum
     * @param nums the numbers inputted in the array
     * @return the minimum number in the array
     */
    public static double min(double[] nums) {
        Arrays.sort(nums);
        double min = nums[0];
        return min;
    }
    
    /**
     * Method to increase the value of each numbers in the array
     * @param nums the numbers inputted in the array
     * @param value the value that will be increased
     */
    public static void increaseValue(double[] nums, double value) {
        for(int i = 0; i < nums.length; i++)
            nums[i] += value;
    }
    
    /**
     * Method to delete a specific index in the array
     * @param nums the numbers inputted in the array
     * @param idx the index of the number in the array
     */
    public static void delete(double[] nums, int idx) {
        int n = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i == idx)
                ;
            else {
            nums[n] = nums[i];
            n++;
            }
        }       
    }
    
}
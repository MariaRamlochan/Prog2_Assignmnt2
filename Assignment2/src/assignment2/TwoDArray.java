package assignment2;
import java.util.Arrays;

/**
 *
 * @author maria
 */
public class TwoDArray {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        
        
        
//        double[][] numss = {{1,2,3,4,}, {5,6,7,8}};
//        System.out.println(Arrays.deepToString(transpose(numss)));
//    }
//    
//    /**
//     * 
//     * @param num2Array
//     * 1 2 3 4
//     * 5 6 7 8
//     * @return 
//     * 1 5
//     * 2 6
//     * 3 7
//     * 4 8
//     */
//    public static double[][] transpose(double[][] num2Array) {
//        if (num2Array == null)
//            return null;
//        
//        int row = num2Array.length;
//        int column = num2Array[0].length;
//        double[][] num2Array2 = new double[column][row];
//
//        for(int i = 0; i < row; i++) 
//            for (int j = 0; j < column; j++)
//                num2Array2[j][i] = num2Array[i][j]; 
//        
//        return num2Array2;     
//    }
//
//    /**
//     * To append the second array under the first array
//     * @param num2Array1
//     * 1 2 3
//     * 4 5 6 7 8 
//     * @param num2Array2
//     * 1 2
//     * 3 4 5
//     * 6
//     * @return 
//     * 1 2 3
//     * 4 5 6 7 8
//     * 3 4 5
//     * 6
//     */
//    public static double[][] appendArrayRow(double[][] num2Array1, double[][] num2Array2) {
//        
//        if (num2Array1 == null)
//            return num2Array2;
//        if (num2Array2 == null)
//            return num2Array1;
//        
//        int length1 = num2Array1.length;
//        int length2 = num2Array2.length;
//        double[][] num2Array3 = new double[length1 + length2][];
//        
//        
//        for (int i = 0; i < length1; i++)
//            num2Array3[i] = Arrays.copyOf(num2Array1[i], num2Array1[i].length);
//       
//        for (int i = 0; i < length2; i++)
//            num2Array3[i + length1] = Arrays.copyOf(num2Array2[i], num2Array2[i].length);
//        
//        return num2Array3;
    }
}

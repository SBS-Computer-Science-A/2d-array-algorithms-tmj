// Joseph, Thomas, Mia
import java.util.*;
public class inClass1 {
    public static void main (String[] args) {
        int[][] num = {{1,2,3,4,5,6},{4,5,6,7,8,9}};
        int[][] n = reverseCol(num);
        for(int i = 0; i<num.length; i++) {
                System.out.println(Arrays.toString(n[i]));
            }
        }
    public static int[][] reverseCol(int[][] mat) {
        int x = mat[1].length;
        int[][] arr = new int[mat.length][x];
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<x; j++){
                arr[i][j]=mat[i][x-j-1];
            }
        }
        return arr;
    }
    public static int[][] reverseColInPlace(int[][] mat) {
        int[][] copyArr = Arrays.copyOf(mat,mat.length);
    }
}

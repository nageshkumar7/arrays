//MAXIMUM ELEMENT IN 2D ARRAY

import java.util.*;

public class arrays_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Rows and columns input
        
        System.out.println("Enter number of row:");
        int rows = sc.nextInt();
        System.out.println("Enter number of column:");
        int cols = sc.nextInt();
        
        // 2D array create
        
        int arr[][] = new int[rows][cols];

        // Array elements input

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "]=");
                arr[i][j] = sc.nextInt();
            }
        }

        //Assume first element is maximum
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Maximum element in the array is: " + max);
    }
    
}

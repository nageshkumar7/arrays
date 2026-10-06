//Search an Element in Matrix

import java.util.*;


public class arrays_6 {
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

        // Search an element in matrix
        System.out.println("Enter the element to search:");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " is found in the matrix.");
        } else {
            System.out.println("Element " + target + " is not found in the matrix.");
        }
    }
    
}

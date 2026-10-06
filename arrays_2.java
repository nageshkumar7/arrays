//SUM OF MATRIX COLUMN AND ROW 

import java.util.*;

public class arrays_2 {
    


  public static void main(String[] args) {
    
  
    
    Scanner sc=new Scanner(System.in);

    // Rows and columns input
    System.out.println("Enter number of row:");
    int rows=sc.nextInt();
    System.out.println("Enter number of column:");
    int cols=sc.nextInt();

    // 2D array create
    int arr[][]=new int[rows][cols];

    // Array elements input
    System.out.println("Enter array elements:");
    for(int i=0;i<arr.length;i++){
      for (int j=0;j<arr.length;j++){
        System.out.println("arr["+i+"]["+j+"]=");
        arr[i][j]=sc.nextInt();
      }
    }

    //calculate rows wise sum
    for(int i=0;i<arr.length;i++){
      int sum=0;
      for(int j=0;j<arr[i].length;j++){
        sum=sum+arr[i][j];
      }
      System.out.println(" Rows " +i+ " sum = "+sum);
    }
  }
}


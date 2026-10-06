//SUM OF MATRIX COLUMN 

import java.util.*;


public class arrays_3 {
    

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

    //calculate column wise sum
    for(int j=0;j<arr.length;j++){
      int sum=0;
      for(int i=0;i<arr[j].length;i++){
        sum=sum+arr[i][j];
      }
      System.out.println(" Column " +j+ " sum = "+sum);
    }
  }
}




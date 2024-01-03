package itp_lab;

import java.util.Scanner;

public class itp_lab {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the row value :");
    int row = sc.nextInt();
    System.out.print("Enter the column value :");
    int col = sc.nextInt();
    printArr(createArray(row, col));

  }

  public static int[][] createArray(int row, int col) {
    int[][] myArray = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        myArray[i][j] = (int) (Math.random() * 11);
      }
    }
    return myArray;
  }

  public static void printArr(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println(" ");
    }
  }

}

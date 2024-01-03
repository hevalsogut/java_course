package strings;

import java.util.Scanner;

public class deemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value :");
    int a = sc.nextInt();
    System.out.print("Enter value :");
    int b = sc.nextInt();
    System.out.print("Enter value :");
    int c = sc.nextInt();

    printArray(multidimensionArr(a, b, c));
  }

  public static int[][][] multidimensionArr(int a, int b, int c) {
    int[][][] myArray = new int[a][b][c];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        for (int k = 0; k < c; k++) {
          myArray[a][b][c] = (int) (Math.random() * 10);
        }
      }
    }
    return myArray;
  }

  public static void printArray(int[][][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        for (int k = 0; k < arr[j].length; k++) {
          System.out.println(arr[i][j][k] + " ");
        }
      }
    }
    System.out.println(" ");
  }
}

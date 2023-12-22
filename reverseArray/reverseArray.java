package reverseArray;

import java.util.Scanner;

public class reverseArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /* Get the size, minimmum, maximum value from the user. */
    System.out.print("Enter the size of the array :");
    int size = sc.nextInt();

    System.out.print("Enter the minimum value :");
    int min = sc.nextInt();

    System.out.print("Enter the maximum value :");
    int max = sc.nextInt();

    /* Generate the random array with the given size, minimum and maximum values. */
    int[] randomArray = generaterandomArray(6, 1, 5);
    System.out.println(randomArray);

    /* Print the generated array */
    System.out.print("Generated array:");
    printArray(randomArray);

    /* Reverse the array */
    int[] reversedArray = reversedArray(randomArray);

    /* Print the generated array */
    System.out.print("Reversed array :");
    printArray(reversedArray);
  }

  /* Generates a random array with the given size, minimum and maximum values. */
  public static int[] generaterandomArray(int size, int min, int max) {
    int[] randomArray = new int[size];
    for (int i = 0; i < size; i++) {
      randomArray[i] = (int) (Math.random() * (max - min + 1) + min);

    }
    return randomArray;
  }

  public static int[] reversedArray(int[] array) {
    int[] reversedArray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      reversedArray[i] = array[array.length - 1 - i];

    }
    return reversedArray;
  }

  public static void printArray(int[] array) {
    for (int num : array) {
      System.out.println(num + " ");

    }
    System.out.println();
  }
}

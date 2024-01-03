/*    Basic Grading System  */
package HW220315060;

public class HW220315060 {
  /* Main Method */
  public static void main(String[] args) {
    /* Initialize a 2D array for the random scores */
    int[][] scoreArray = initiateScoreArray();

    /* Print Scores */
    printScores(scoreArray);

    /* Calculate and print the averages of quizzes, midterms, and finals */
    calculateAverages(scoreArray);

    /* Calculate and print the overall grades for each student */
    double[] overallGrades = calculateOverallGrade(scoreArray);

    /*
     * Calculate and print the letter grades for each student based on overall
     * grades
     */
    calculateLetterGrade(overallGrades);
  }

  /* Returning scoreArray in this Method for initiate random scores */
  public static int[][] initiateScoreArray() {
    /* Defining a new scoreArray with 20 rows and 3 collumns */
    int[][] scoreArray = new int[20][3];
    for (int i = 0; i < 20; i++) {
      for (int j = 0; j < 3; j++) {
        /* Assign random scores between 0 and 100 */
        scoreArray[i][j] = (int) (Math.random() * 101);
      }
    }
    return scoreArray;
  }

  /* Method to print the scores */
  public static void printScores(int[][] scoreArray) {
    System.out.println("Student" + " -- " + "Quiz" + "\t" + "Midterm" + "\t" + "Final");
    for (int i = 0; i < 20; i++) {
      System.out.print("Student " + (i + 1) + ": ");
      for (int j = 0; j < 3; j++) {
        System.out.print(scoreArray[i][j] + "\t");
      }
      System.out.println();
    }
    /* These lines for the better user experience */
    System.out.println("--------------------");
  }

  /*
   * This Method for calculate and print the averages of quizzes, midterms, and
   * finals
   */
  public static double[] calculateAverages(int[][] scoreArray) {
    double[] averages = new double[3];
    for (int j = 0; j < 3; j++) {
      double sum = 0;
      for (int i = 0; i < 20; i++) {
        sum += scoreArray[i][j];
      }
      averages[j] = sum / 20;
    }

    System.out.println("Quiz Average: " + averages[0]);
    System.out.println("Midterm Average: " + averages[1]);
    System.out.println("Final Average: " + averages[2]);
    System.out.println("--------------------");

    return averages;
  }

  /* Method to calculate and print the overall grades for each student */
  public static double[] calculateOverallGrade(int[][] scoreArray) {
    double[] overallGrades = new double[20];

    for (int i = 0; i < 20; i++) {
      double quizWeight = scoreArray[i][0] * 0.2;
      double midtermWeight = scoreArray[i][1] * 0.3;
      double finalWeight = scoreArray[i][2] * 0.5;

      overallGrades[i] = quizWeight + midtermWeight + finalWeight;
    }

    System.out.println("Overall Grades:");
    for (int i = 0; i < 20; i++) {
      System.out.println("Student " + (i + 1) + ": " + overallGrades[i]);
    }
    System.out.println("----------------");
    return overallGrades;
  }

  /* Method to calculate and print the letter grades for each student */
  public static char[] calculateLetterGrade(double[] overallGrades) {
    int numOfStudents = overallGrades.length;
    char[] letterGrades = new char[numOfStudents];

    for (int i = 0; i < numOfStudents; i++) {
      if (overallGrades[i] >= 85) {
        letterGrades[i] = 'A';
      } else if (overallGrades[i] >= 65) {
        letterGrades[i] = 'B';
      } else if (overallGrades[i] >= 50) {
        letterGrades[i] = 'C';
      } else {
        letterGrades[i] = 'F';
      }
    }

    /* Print letter grades */
    System.out.println("Letter Grades:");
    for (int i = 0; i < numOfStudents; i++) {
      System.out.println("Student " + (i + 1) + ": " + letterGrades[i]);
    }

    return letterGrades;
  }
}

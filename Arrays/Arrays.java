package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
      public static void main(String[] args) {
        List<int[]> studentScores = initiateStudentScores();
        printStudentScores(studentScores);

        double[] averages = calculateAverages(studentScores);
        System.out.printf("QUIZ AVERAGE: %.2f, MIDTERM AVERAGE: %.2f, FINAL AVERAGE: %.2f\n",
                averages[0], averages[1], averages[2]);

        double[] overallGrades = calculateOverallGrade(studentScores);
        System.out.println("OVERALL GRADES:");
        printArray(overallGrades);

        char[] letterGrades = calculateLetterGrade(overallGrades);
        System.out.println("LETTER GRADES:");
        printCharArray(letterGrades);
    }

    public static List<int[]> initiateStudentScores() {
        List<int[]> studentScores = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            int[] scores = new int[3];
            scores[0] = (int) (Math.random() * 101);
            scores[1] = (int) (Math.random() * 101);
            scores[2] = (int) (Math.random() * 101);

            studentScores.add(scores);
        }

        return studentScores;
    }

    public static void printStudentScores(List<int[]> studentScores) {
        System.out.println("Student Scores:");
        for (int i = 0; i < studentScores.size(); i++) {
            int[] scores = studentScores.get(i);
            System.out.println("Student " + (i + 1) + ": " + Arrays.toString(scores));
        }
        System.out.println();
    }

    public static double[] calculateAverages(List<int[]> studentScores) {
        double[] averages = new double[3];

        for (int[] scores : studentScores) {
            averages[0] += scores[0];
            averages[1] += scores[1];
            averages[2] += scores[2];
        }

        for (int i = 0; i < averages.length; i++) {
            averages[i] /= studentScores.size();
        }

        return averages;
    }

    public static double[] calculateOverallGrade(List<int[]> studentScores) {
        double[] overallGrades = new double[studentScores.size()];

        for (int i = 0; i < studentScores.size(); i++) {
            int[] scores = studentScores.get(i);
            overallGrades[i] = scores[0] * 0.2 + scores[1] * 0.3 + scores[2] * 0.5;
        }

        return overallGrades;
    }

    public static char[] calculateLetterGrade(double[] overallGrades) {
        char[] letterGrades = new char[overallGrades.length];

        for (int i = 0; i < overallGrades.length; i++) {
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

        return letterGrades;
    }

    public static void printArray(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printCharArray(char[] array) {
        System.out.println(Arrays.toString(array));
    }
     
  }









 /*  public static void main(String[] args) {
    String ogrenci1 = "Ahmet";
    String ogrenci2 = "Mehmet";
    String ogrenci3 = "Heval";

    System.out.println(ogrenci1);
    System.out.println(ogrenci2);
    System.out.println(ogrenci3);
    System.out.println("---------------------");
    String[] ogrenciler = new String[3];
    ogrenciler[0] = "Ahmet";
    ogrenciler[1] = "Mehmet";
    ogrenciler[2] = "Heval";

    for (int i = 0; i < ogrenciler.length; i++) {
      System.out.println(ogrenciler[i]);
    }
    recommended usage 
    for (String ogrenci : ogrenciler) {
      System.out.println(ogrenci);
    }
  }
   */

}

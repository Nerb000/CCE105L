package activity1;

import java.util.Scanner;

public class AssigningGrades {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of students: ");
//        int length = sc.nextInt();
//        int[] scores = new int[length];
//        System.out.print("Enter " + length + " scores: ");
//        for (int i = 0; i < scores.length; i++) {
//            scores[i] = sc.nextInt();
//        }
//        int bestScore = getBestScore(scores);
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println("Student " + i + " score is " + scores[i]
//            + " and grade is " + checkGrade(scores[i], bestScore));
//        }
//    }

    public static char checkGrade(int score, int bestScore) {
        if (score >= bestScore - 10) {
            return 'A';
        } else if (score >= bestScore - 20) {
            return 'B';
        } else if (score >= bestScore - 30) {
            return 'C';
        } else if (score >= bestScore - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static int getBestScore(int[] scores) {
        int value = -1;
        for (int i : scores) {
            if (i > value) {
                value = i;
            }
        }
        return value;
    }
}

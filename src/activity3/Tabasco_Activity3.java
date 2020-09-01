package activity3;

import java.util.Scanner;
//number 4

class CheckingAccount {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = "";
//        double transaction;
//        System.out.println("Enter transactions:");
//        do {
//            transaction = sc.nextDouble();
//            str += " " + transaction;
//        } while (transaction != 0);
//        double[] transactions = new double[getLength(str, ' ') - 1];
//        stringToDouble(str, transactions, ' ');
//        double balance = 0;
//        System.out.println("Transaction\t\tBalance");
//        for (int i = 0; i < transactions.length; i++) {
//            balance = balance + transactions[i];
//            System.out.printf((transactions[i] > 0
//                    ? "Deposit " + transactions[i] + "\t\t%.2f\n"
//                    : "Withdrawal " + (-1 * transactions[i]) + "\t%.2f\n"), balance);
//        }
//    }

    public static int getLength(String string, char c) {
        int value = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                value++;
            }
        }
        return value;
    }

    public static void stringToDouble(String str, double[] arr, char c) {
        int lastStop = 1;
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            for (int j = lastStop; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    lastStop = j + 1;
                    break;
                }
                temp += str.charAt(j);
            }
            arr[i] = Double.parseDouble(temp);
        }

    }
}

//number 5
class GradingTrueOrFalse {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        final String ANSWER_KEY = "TFFTFFTTTTFFTFTFTFTT";
//        System.out.print("Enter number of students: ");
//        int length = Integer.parseInt(sc.next());
//        String[] studentIDs = new String[length];
//        int[] studentScores = new int[length];
//        String[] answers = new String[length + 1]; // plus 1 to have space for ANSWER_KEY
//        answers[0] = ANSWER_KEY;
//        System.out.println("Enter student's ID followed by space and student's answer:");
//        for (int i = 0; i < studentIDs.length; i++) {
//            String input = sc.nextLine();
//            if (input.equals("")) {
//                i--;
//                continue;
//            }
//            studentIDs[i] = input.substring(0, input.indexOf(' '));
//            answers[i + 1] = input.substring(input.indexOf(' ') + 1);
//            studentScores[i] = correctAnswers(ANSWER_KEY, answers[i + 1]);
//        }
//
//        System.out.println("Result:");
//        for (int i = 0; i < studentIDs.length; i++) {
//            System.out.println(studentIDs[i] + " " + answers[i + 1] + " "
//                    + studentScores[i] + " " + getGrade(studentScores[i], ANSWER_KEY.length() * 2));
//        }
//
//    }

    public static int correctAnswers(String ANSWER_KEY, String answer) {
        int value = 0;
        for (int i = 0; i < ANSWER_KEY.length(); i++) {
            if (answer.charAt(i) == ANSWER_KEY.charAt(i)) {
                value += 2;
            } else if (answer.charAt(i) != ANSWER_KEY.charAt(i) && answer.charAt(i) != ' ') {
                value -= 1;
            }
        }
        return value;
    }

    public static char getGrade(int score, int maxScore) {
        double percent = (score / (double) maxScore) * 100;
        if (percent >= 90 && percent <= 100) {
            return 'A';
        } else if (percent >= 80) {
            return 'B';
        } else if (percent >= 70) {
            return 'C';
        } else if (percent >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

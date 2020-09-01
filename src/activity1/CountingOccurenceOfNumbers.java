package activity1;

import java.util.Arrays;
import java.util.Scanner;

public class CountingOccurenceOfNumbers {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = -1;
//        String str = "";
//
//        System.out.print("Enter the integers between 1 and 100: ");
//        while (input != 0) {
//            input = sc.nextInt();
//            str = str + input + " ";
//        }
//
//        int length = getLength(str, ' ') - 1; // -1 to exclude the input '0'
//        int[] arr = new int[length];
//        stringToInt(arr, str, ' ');
//        int[] unique = new int[length - numberDuplicates(arr)];
//        removeDuplicateElements(unique, arr);
//
//        bubbleSort(unique);
//        for (int i = 0; i < unique.length; i++) {
//            int occurence = occurence(arr, unique[i]);
//            System.out.println(unique[i] + " occurs " + occurence
//                    + (occurence > 1 ? " times." : " time."));
//        }
//    }

    public static int numberDuplicates(int[] array) {
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            if (occurence(array, i) > 1) {
                value++;
            }
        }
        return value;
    }

    public static int getLength(String string, char c) {
        int value = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                value++;
            }
        }
        return value;
    }

    public static void stringToInt(int[] arr, String str, char c) {
        int lastStop = 0;
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            for (int j = lastStop; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    lastStop = j + 1;
                    break;
                }
                temp += str.charAt(j);
            }
            arr[i] = Integer.parseInt(temp);
        }

    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i] && i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void removeDuplicateElements(int[] source, int[] compared) {
        int v = 0;
        for (int i = 0; i < compared.length; i++) {
            if (occurence(source, compared[i]) == 0) {
                source[v++] = compared[i];
            }
        }
    }

    public static int occurence(int[] arrays, int number) {
        int value = 0;
        for (int i : arrays) {
            if (i == number) {
                value++;
            }
        }
        return value;
    }

}

package activity4;

import java.util.Scanner;

/*********************
* Group 2            *
* Tabasco, Jedy Matt *
* Nebran, Bern Homer *
* Blase, Alexis      *
**********************/

public class Roman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roman numeral: ");
        String romanNumeral = sc.next();
        System.out.println("1 -- Display roman numeral\n2 -- Display decimal number");
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println(romanNumeral.toUpperCase());
        } else if (num == 2) {
            System.out.println(romanToDecimal(romanNumeral));
        }
    }

    public static int romanToDecimal(String roman) {
        roman = roman.toUpperCase();
        int value = 0;
        int previousValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = charValue(roman.charAt(i));
            if (previousValue > currentValue) {
                value -= currentValue;
            } else {
                value += currentValue;
            }
            previousValue = charValue(roman.charAt(i));
        }
        return value;
    }

    public static int charValue(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return -1;
        }
    }

}

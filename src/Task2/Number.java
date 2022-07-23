package Task2;

import java.util.Scanner;

public class Number {
    static int countDigit(int num) {

        int countDigits = String.valueOf(num).length();
        return countDigits;
    }

    static void biggerThanFour(int num) {
        int[] digits = new int[countDigit(num)];
        int count = 0;
        for (int i = 0; i < digits.length; i++) {
            digits[i] = num % 10;
            num /= 10;
            if (digits[i] > 4) {
                count++;
            }
        }
        System.out.println("Count of 4 -> " + count);
    }

    static void mirrorNumber(int num) {
        int value = num;
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("The reverse  number is: " + mirror);
    }


    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("Number of digit " + countDigit(num));
        biggerThanFour(num);
        mirrorNumber(num);

    }
}

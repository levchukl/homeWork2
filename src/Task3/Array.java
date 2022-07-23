package Task3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arrayA = new int[4];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random() * (b - a)) + a;
            System.out.println(arrayA[i]);
        }

        int max = Integer.MIN_VALUE;
        int indexMax = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > max) {
                max = arrayA[i];
                indexMax = i;
            }
        }
        System.out.println("Max value " + max + " Index " + indexMax);


        int min = Integer.MAX_VALUE;
        int indexMin = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] < min) {
                min = arrayA[i];
                indexMin = i;
            }
        }
        System.out.println("Min value " + min + " Index " + indexMin);

        int sum = 0;
        for (int i = arrayA.length / 2; i < arrayA.length; i++) {
            sum += arrayA[i];
        }
        double averageSum = sum / (arrayA.length / 2.0);

        System.out.println("Average value " + sum);

    }
}



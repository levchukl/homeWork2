package Task1;

import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Time");
        double i = in.nextInt();
        double t = i % 5;
        if (t >= 1.0 && t < 4.0) {
            System.out.println("Green");
        } else {
            System.out.println("Red");
            in.close();
        }
    }

}

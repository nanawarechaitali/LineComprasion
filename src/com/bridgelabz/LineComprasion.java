package com.bridgelabz;
import java.util.Random;

public class LineComprasion {
    public static void main(String[] args) {
        System.out.println("Welcome to line Comprasion Computation Program on Master branch");
        Random random = new Random();
        int x1 = random.nextInt(10);
        int y1 = random.nextInt(20);
        int x2 = random.nextInt(30);
        int y2 = random.nextInt(40);

        System.out.println("Point x1 and y1 is" +x1 +" "+y1);
        System.out.println("Point x2 and y2 is" +x2 +" "+y2);



        double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length of the line is " + length);
    }
}

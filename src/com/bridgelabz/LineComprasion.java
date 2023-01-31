package com.bridgelabz;
import java.util.Random;

public class LineComprasion {
    public static void main(String[] args) {
        System.out.println("Welcome to line Comprasion Computation Program on Master branch");
        Random random = new Random();
        int x1 = random.nextInt(10);
        int y1 = random.nextInt(10);
        int x2 = random.nextInt(10);
        int y2 = random.nextInt(10);

        System.out.println("Point x1 and y1 is" +x1 +" "+y1);
        System.out.println("Point x2 and y2 is" +x2 +" "+y2);



        double length1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length of the line is " + length1);
        Double line1 = Double.valueOf(length1);



        int x3 = random.nextInt(10);
        int y3 = random.nextInt(10);
        int x4 = random.nextInt(10);
        int y4 = random.nextInt(10);

        System.out.println("Point x3 and y3 is" +x3 +" "+y3);
        System.out.println("Point x4 and y4 is" +x4 +" "+y4);



        double length2 = Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
        System.out.println("Length of the line is " + length2);
        Double line2 = Double.valueOf(length2);

        if(line1.equals(line2)){
            System.out.println("Both the lines are equals");
        }else{
            System.out.println("Both the lines are not equal");
        }




    }
}

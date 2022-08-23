package Programs;

 /*23-08-2022 Time - 10:36pm. Tuesday
 I'm starting Java programming language which is best if you never do any coding before.
                                                      - by me a chai 🍵☕😍
                                                        (Avinash Sharma)
        */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 1. In a program, input 3 numbers : A, B & C. You have to output the average of these 3 numbers
        // Solution 👇👇👇
        
            Scanner sc = new Scanner(System.in);
            System.out.println("             Average Finder");
        
            System.out.print("Enter your physics marks :");
            int phy = sc.nextInt();
        
            System.out.print("Enter your Mathematics marks :");
            int bio = sc.nextInt();
        
            System.out.print("Enter your Chemistry marks :");
            int che = sc.nextInt();
        
            int average = (phy+bio+che)/3;
        
            System.out.println("Your Average Marks of 3 Subjects is : "+ average);

            }
        }
public class Solution {
    public static void main(String[] args) {
        //2. In a program, input the side of a square. You have to output the area of the square.
        // Solution 👇

        Scanner sc = new Scanner(System.in);
        System.out.println("             Area of the Sqaure Converter"); // this is for title

        System.out.print("Enter Side of a Square : ");
        float side = sc.nextFloat(); // we use float because somwtimes user want to find e.g 4.5 etc

        float areaOfSquare = side*side;
        System.out.println("Area of a Square is --> " + areaOfSquare +" Sq m");

    }
}

public class Solution {
    public static void main(String[] args) {
        /*3. Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser.
        You have to output the total cost of the items back to the user as their bill.
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/
        // Solution 👇

        Scanner sc = new Scanner(System.in);
        System.out.println("             Bill Calculator"); // this is for title

        DecimalFormat df = new DecimalFormat("#.##"); // import first df. It is use for getting 2 points after decimal.

        System.out.print("Pencil Cost : ");
        float pencil = sc.nextFloat();
        
        System.out.print("Pen Cost : ");
        float pen = sc.nextFloat();

        System.out.print("Eraser Cost : ");
        float eraser = sc.nextFloat();

        float totalcost = pencil+pen+eraser;
        float gst = (totalcost*18)/100;

        float tcoswGST = totalcost+gst;
        float gstcharge = tcoswGST-totalcost;

        System.out.println("Total Cost : " + totalcost);
        System.out.println("Total Cost with GST : "+ tcoswGST);
        System.out.print("GST Charge (18%) : "+ (df.format(gstcharge)));  // this format for whenever we get out put we can only 2 decimal after point

    }
}


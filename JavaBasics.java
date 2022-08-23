// 1. In a program, input 3 numbers : A, B & C. You have to output the average of these 3 numbers
        // Solution 👇👇👇

import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Average Finder");

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

package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner scanLength = new Scanner(System.in);
        Scanner scanWidth = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int length = scanLength.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = scanWidth.nextInt();
        System.out.printf("You entered dimensions of %d feet by %d feet.\n", length, width);
        System.out.println("The area is");

        int f2 = length * width;
        double m2_conversionFactor = 0.09290304;
        double m2 = f2 * m2_conversionFactor;

        System.out.printf("%d square feet\n", f2);
        System.out.printf("%.3f square meters", m2);

    }
}

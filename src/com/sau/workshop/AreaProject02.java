package com.sau.workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaProject02 {
    public static void main(String[] args) {
        Double Menu, Width, Long, AreaOfSquare,Base,High,Radius,AreaOfCircle,AreaOfTriangle;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");




        System.out.println("***************************");
        System.out.println("  Shape Area Program  ");
        System.out.println("***************************");
        System.out.println("1.Square Area");
        System.out.println("2.Triangle Area");
        System.out.println("3.Circle Area");
        System.out.println("***************************");
        System.out.print("Select Menu : " );
        Menu = sc.nextDouble();


        if ( Menu == 1 ){
            System.out.println("***************************");
            System.out.print("Inout widths : ");
            Width = sc.nextDouble();
            System.out.print("Input longs : ");
            Long = sc.nextDouble();
            AreaOfSquare = Long * Width;
            System.out.println("Area Of Square is : "+ AreaOfSquare);
            System.out.println("***************************");
        }else if ( Menu == 2 ) {
            System.out.println("***************************");
            System.out.print("Input bases : ");
            Base = sc.nextDouble();
            System.out.print("Input highs : ");
            High  = sc.nextDouble();
            AreaOfTriangle = Base * High / 2;
            System.out.println("Area of Triangle : " + AreaOfTriangle );
            System.out.println("***************************");
        }else if ( Menu == 3 ) {
            System.out.println("***************************");
            System.out.print("Input raduis : ");
            Radius = sc.nextDouble();
            AreaOfCircle = 3.14 * (Radius * Radius);
            System.out.println("Area of Circle is : " + AreaOfCircle);
            System.out.println("***************************");
        }else{
            System.out.println("Thank you...bye...bye ");
            System.out.println("***************************");

        }
    }
}

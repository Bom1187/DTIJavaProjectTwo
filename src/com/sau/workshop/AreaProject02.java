package com.sau.workshop;

import java.text.DecimalFormat;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AreaProject02 {
    public static void main(String[] args)throws IOException {
        Double Menu, Width, Long, AreaOfSquare,Base,High,Radius,AreaOfCircle,AreaOfTriangle;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("***************************");
        System.out.println("  Shape Area Program  ");
        System.out.println("***************************");
        System.out.println("1.Square Area");
        System.out.println("2.Triangle Area");
        System.out.println("3.Circle Area");
        System.out.println("***************************");
        System.out.print("Select Menu : " );
        Menu = Double.parseDouble( reader.readLine() );


        if ( Menu == 1 ){
            System.out.println("***************************");
            System.out.print("Inout widths : ");
            Width = Double.parseDouble( reader.readLine() );
            System.out.print("Input longs : ");
            Long = Double.parseDouble( reader.readLine() );
            AreaOfSquare = Long * Width;
            System.out.println("Area Of Square is : "+ AreaOfSquare);
            System.out.println("***************************");
        }else if ( Menu == 2 ) {
            System.out.println("***************************");
            System.out.print("Input bases : ");
            Base  = Double.parseDouble( reader.readLine() );
            System.out.print("Input highs : ");
            High  = Double.parseDouble( reader.readLine() );
            AreaOfTriangle = Base * High / 2;
            System.out.println("Area of Triangle : " + AreaOfTriangle );
            System.out.println("***************************");
        }else if ( Menu == 3 ) {
            System.out.println("***************************");
            System.out.print("Input raduis : ");
            Radius = Double.parseDouble( reader.readLine() );
            AreaOfCircle = 3.14 * (Radius * Radius);
            System.out.println("Area of Circle is : " + AreaOfCircle);
            System.out.println("***************************");
        }else{
            System.out.println("Thank you...bye...bye ");
            System.out.println("***************************");

        }
    }
}

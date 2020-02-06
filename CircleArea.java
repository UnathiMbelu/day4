package day4;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
        int radius = 0;
        

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = input.nextInt();
        
        
        double area = circleArea(radius);
        System.out.println("Area is " + area)
        ;
    
    }
	public static double circleArea(double r) {
		 double area = ((3.14159)*(r*r));
		 return area;
     	
     }
	


}



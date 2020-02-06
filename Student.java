package day4;

import java.util.Scanner;

public class Student {
	 public static void main(String[] args) {
	     	
	     	Scanner input = new Scanner(System.in);
	        int marks = 0;
	         System.out.println("Enter the marks");
	         marks = input.nextInt();
	         
	         int points = qualityPoints(marks);
	         System.out.println("The results are " + points + " points");
	 }
	 
	 public static int qualityPoints(int marks) {
		int point = 0; 
     	if(marks >= 90 && marks <= 100) {
     		point = 4;	
     	}
     	if(marks >= 80 && marks <= 89) {
     		point = 3;	
     	}
     	else if(marks >= 70 && marks <= 79) {
     		point = 2;
     		
     	}
     	else if(marks >= 60 && marks <= 69) {
     		point = 1;	
     	}
     	else {
     		
     	}
     	return point;
     }
}	 
	 

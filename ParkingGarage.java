package day4;

import java.util.Scanner;

public class ParkingGarage {
	
	
	public static void main(String[] args) {
     	
     	Scanner input = new Scanner(System.in);
        int  hours = 0;
     	
         
         System.out.println("Enter the number of hours");
         hours = input.nextInt();
         
         double charges = calcCharge(hours);
         System.out.println("The charges are " + charges + " charges");
         
         

 }
 
 public static double calcCharge(int hours) {
	double charge = 0.0; 
 	if(hours > 0 && hours <= 3) {
 		charge = 2.00;
 		
 	}
 	
 	if(hours > 3) {
 		charge = 2.00 + ((hours-3)*(0.50)) ;
 		
 	}
 	
 	return charge;
 	
 }
}	 



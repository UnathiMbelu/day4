package day4;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
     	//declaration of variables
     	Scanner input = new Scanner(System.in);
        int num = 0;		//input
  
         System.out.println("Enter the first integer");
         num = input.nextInt();
         
        boolean number = isEven(num);
         
         System.out.println("Even number is " + number)
         ;
      
      input.close();

     }// end main
     public static boolean isEven(int num) { //method signature
    	 
     
    if (num%2 == 0)	{ 
     
     return true;
    }
    else {
    	return false;
    }

}
}
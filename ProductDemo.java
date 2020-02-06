package day4;
import java.util.Scanner;


public class ProductDemo {


	 public static void main(String[] args) {
     	//declaration of variables
     	Scanner input = new Scanner(System.in);
        int num1 = 0;		//input
     	int num2 = 0;			//input
     	int total = 0;		//output
         

         System.out.println("Enter the first integer");
         num1 = input.nextInt();
         
         System.out.println("Enter the second integer");
         num2 = input.nextInt();
         
         
         
         int product = calcProduct(num1,num2);
         
         System.out.println("Product is " + product)
         ;
     
     
         
      input.close();

     }// end main
     public static int calcProduct(int num1,int num2) { //method signature
     	
     	
    	int product = num1 * num2;
    return product;
     }

}


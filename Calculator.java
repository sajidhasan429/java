/* Name : Nodoliya Sajidhasan Shabbirali
URN : 2022-M-18042000
 */

import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double num1,num2,result = 0.0;//deafult assignment on result = 0.0
		char operator;

		System.out.println("Simple Calculator");
		System.out.println("Enter first number :");//user input the first number
		num1 = sc.nextDouble();

		System.out.println("Enter an operator(+, - , *, /) : ");//choose the one operator
		operator = sc.next().charAt(0);

		System.out.println("Enter second number : ");//user input the second number
		num2 = sc.nextDouble();

		//to perform the arithmetic operations using switch case
		switch(operator){

			//addition of the two numbers 10 + 10 
			case '+':
				 result = num1 + num2;
				 break;

			//subtraction of the two numbers 20 -10
			case '-':
				 result = num1 - num2;
				 break;

			//multiplication of the two numbers 5 * 4
			case '*':
				 result = num1 * num2;
				 break;

			//division of the two numbers 10/5
			case '/':
				//number2 is not input to 0 because is not divisible by 0
				if(num2 != 0){
					result = num1 / num2;
				}
				else{
					System.out.println("Number not divide by zero");//
				}
				break;
			// to choose only this operators(+,-,*,/) otherwise the print in Invalid operator
			default:
				System.out.println("Invalid operator");
				return;

		}
		//display the result 10 + 10 = 20
		System.out.println("Result : " + result);
	}
}
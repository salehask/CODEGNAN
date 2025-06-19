package TASK;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter operator to perform operation");
		Scanner sc = new Scanner(System.in);
		char operator = sc.next().charAt(0);
		System.out.println("Enter two values");
		int n = sc.nextInt();
		int m = sc.nextInt();
		switch (operator) {
		case '+' -> 
		System.out.println("Addition of n&m is "+ (n+m));
		
		case '-' ->
		System.out.println("Subtraction of n&m is "+ (n-m));
		
		case '*' ->
		System.out.println("Multiplication of n&m is "+(n*m));
		
		case '/' ->
		System.out.println("Division of n&m is "+(n/m));
		
		case '%' ->
		System.out.println("Modulus of n&m is "+(n%m));
		
		default -> System.out.println("Enter valid operator");
		}
		sc.close();
	}

}

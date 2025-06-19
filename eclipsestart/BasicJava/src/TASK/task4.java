package TASK;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FIZZ IF DIVISIBLE BY 3 ABD BIZZ IF DIVISIBLE BY 5 AND IF BOTH THAN PRINT FIZZ AND BIZZ
		//ANOTHER TASK 
			//LEAP YEAR
		//ANOTHER TASK
			//take 3 VALUES FROM USERS AND FIND LARGESR VALUE
		//ANOTHER TASK
			//10TH >=90 AND >=70
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if((a%3==0)&&(a%5==0)) {
			System.out.println("BIZZ & FIZZ");
		}
		else if(a%3==0) {
			System.out.println("BIZZ");
		}
		else if(a%5==0) {
			System.out.println("FIZZ");
			
		}
		else {
			System.out.println("Not a Fizz");
		}
		sc.close();

	}

}

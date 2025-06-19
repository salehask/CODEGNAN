package TASK;

import java.util.Scanner;

public class leapyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int yr = sc.nextInt();
		if(yr%400==0) {
			System.out.println("It's LeapYear");
		}
		else if(yr%4==0 && yr%100 != 0) {
			System.out.println("It's a LeapYear");
		}
		else {
			System.out.println("It's not a LeapYear");
		}
		sc.close();
	}

}

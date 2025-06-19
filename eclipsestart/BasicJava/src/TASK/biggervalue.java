package TASK;

import java.util.Scanner;

public class biggervalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if((a>b)&&(a>c)) {
			System.out.println(a+" is bigger Number among all");
		}
		else if((b>a)&&(b>c)) {
			System.out.println(b+" is bigger Number among all");
		}
		else {
			System.out.println(c+" is bigger Number among all");
		}
		sc.close();
	}

}

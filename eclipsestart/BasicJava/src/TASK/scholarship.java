package TASK;

import java.util.Scanner;

public class scholarship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int inter = sc.nextInt();
		if(a>=90 && inter >=70) {
			System.out.println("He is eligible for scholarShip");
			
		}
		sc.close();
		

	}

}

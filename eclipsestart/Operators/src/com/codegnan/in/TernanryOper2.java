package com.codegnan.in;
import java.util.*;

public class TernanryOper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		int result = (a>b)?a:b;
		System.out.println("Bigger Number is "+" : "+result);
		sc.close();
		
	}

}

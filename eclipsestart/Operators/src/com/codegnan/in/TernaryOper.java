package com.codegnan.in;
import java.util.*;

public class TernaryOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		String str= (n%2==0)?"Even number":"odd Number";
		System.out.println(str);
		sc.close();
	}

}

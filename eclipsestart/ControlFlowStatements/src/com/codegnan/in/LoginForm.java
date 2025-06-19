package com.codegnan.in;

import java.util.Scanner;

public class LoginForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user id");
		int uid = sc.nextInt();
		
		if(uid == 120) {
			System.out.println("Enter password");
			int pwd = sc.nextInt();
			if(pwd == 599) {
				System.out.println("Login Successful....");
			}
			else {
				System.out.println("Invalid password");
			}
		}
		else {
			System.out.println("Invalid userid");
		}
		sc.close();

	}

}

package TASK;

import java.util.Scanner;

public class vowels {
		public static void main(String[] args) {
			System.out.println("Enter a alphabet ");
			Scanner sc = new Scanner(System.in);
			char ch = sc.next().charAt(0);
			switch (ch) {
			case 'a','e','i','o','u' ->
			System.out.println("Given char is vowel");
			case '!','@','#','$','%','^','&','*' ->
			System.out.println("only alphabets is accepted");
			
			default -> 
			System.out.println("Given char is consonent");
			}
			sc.close();
		}
	

}

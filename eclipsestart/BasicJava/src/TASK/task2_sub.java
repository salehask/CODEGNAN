package TASK;

import java.util.Scanner;

public class task2_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int length= sc.nextInt();
		System.out.println("Enter breadth of rectangle");
		int breath = sc.nextInt();
		
		System.out.println("Area OF RECTANGLE FOR "+length +":"+breath+" is "+(length*breath) );
		System.out.println("perimeter OF RECTANGLE FOR "+length +":"+breath+" is "+(2*(length+breath)) );
		sc.close();
	}

}

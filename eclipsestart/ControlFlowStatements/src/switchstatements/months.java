package switchstatements;

import java.util.Scanner;

public class months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Name");
		String str = sc.next();
		switch (str) {
		
		case "january","march","may","july","october","december","august" -> 
		System.out.println("31 days ");
		
		case "november","april","june" ->
		System.out.println("30 days");
		
		case "february" ->
		{
			System.out.println("Enter year ");
			int yr = sc.nextInt();
			if(yr%400==0) {
				System.out.println("29 days");
			}
			else if(yr%4==0 && yr%100 != 0) {
				System.out.println("29 days");
			}
			else {
				System.out.println("28 days");
			}
		}
		
		default -> System.out.println("Invalid month pls write month name  in small letters");
		
		}
		sc.close();
		

	}

}

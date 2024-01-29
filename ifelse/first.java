
//1) Write a Program to Check Whether Number is Even or odd

import java.util.Scanner;

public class first{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0){
			System.out.println("you entered number "+(a)+" is even number.");
		}
		else{
			System.out.println("Your entered number "+(a)+" is odd number.");
		}
	}
}

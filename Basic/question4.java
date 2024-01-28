
//) Write a program where the user is asked to enter twointegers (divisor and dividend) and the quotient and theremainder of their division is computed.(Both divisor anddividend should be integers.)

import java.util.Scanner;
public class question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextInt();
		float b = sc.nextInt();
		System.out.println("quotient of a and b is " + (a/b) +" and remainder is " + (int)(a%b));
	}
}

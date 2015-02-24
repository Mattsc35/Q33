// Matthews Curtinhas
package Q33;

import java.util.Scanner;

public class Q33 {

	public static double mm(double x)
	{
		return Math.max(0, Math.min(x, 2.375));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double touchdowns, yards, interceptions, completions, attempts;
		
		System.out.println("Enter how many touchdowns: " );
		touchdowns = scanner.nextDouble();
		System.out.println("Enter how many yards: " );
		yards = scanner.nextDouble();
		System.out.println("Enter how many interceptions: " );
		interceptions = scanner.nextDouble();
		System.out.println("Enter how many completions: " );
		completions = scanner.nextDouble();
		System.out.println("Enter how many attempts: " );
		attempts = scanner.nextDouble();
		
		double a = ((completions / attempts) - .3) / .2;
		double b = ((yards / attempts) - 3) / 4;
		double c = (touchdowns/attempts) / .05;
		double d = (.095 - (interceptions / attempts)) / .04;
		
		double rating = ((mm(a) + mm(b) + mm(c) + mm(d))/6) * 100;
	
		System.out.println("The quarterback's rating is " + rating);
		
		scanner.close();
	}

}

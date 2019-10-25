import java.util.*;

public class Multiples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		while (!scan.hasNextInt()) {
			System.out.println("Enter a positive integer:");
			scan.nextLine();
		}
		int multiple = scan.nextInt();
		while (multiple <= 0) {
			System.out.println("Enter a positive integer:");
			scan.nextLine();
			multiple = scan.nextInt();
		}
		System.out.println("Give me an upper limit:");
		while (!scan.hasNextInt()) {
			System.out.println("Enter a positive integer:");
			scan.nextLine();
		}
		int limit = scan.nextInt();
		while (limit < multiple) {
			System.out.println("Enter a positive integer greater than number before:");
			scan.nextLine();
			limit = scan.nextInt();
		}
		for (int num1 = multiple; num1 <= limit; num1++ ) {
			if((num1 % multiple == 0) && ((num1 / multiple) % 5 == 0)) {
				System.out.print(num1 + " ");
				System.out.println("");
			}
			else if (num1 % multiple ==0 ) {
				System.out.print(num1 + " ");
			}
		}
	}

}

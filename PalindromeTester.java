import java.util.*;


public class PalindromeTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to enter a palindrome? y/n");
		char yesNo = scan.next().charAt(0);
		while (yesNo == 'y') {
			Scanner sc = new Scanner(System.in);
			System.out.println("Type in your palindrome please");
			String palindrome = sc.nextLine();
			String reverse = new StringBuffer(palindrome).reverse().toString();;
			if (palindrome.equals(reverse)){
				System.out.println(palindrome +" is a palindrome");
			}
			else {
				System.out.println("This is not a palindorme");
			}
			System.out.println("Would you like to enter a palindrome? y/n");
			yesNo = scan.next().charAt(0);
			sc.close();
		}
		scan.close();

	}
}

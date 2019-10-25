import java.util.*;
public class PalindromeTester2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to check if a string is a palindrome y/n?");
		char yesNo = scan.nextLine().charAt(0);
		while (yesNo == 'y') {
			System.out.println("Give me a word");
			String word = scan.nextLine();
			int lastInd = word.length() - 1;
			String word2 = "";
			while (lastInd >= 0) {
				word2 += word.charAt(lastInd);
				lastInd --;
			}
			if (word.equals(word2)) {
				System.out.println("This is a palindrome");
			}
			else {
				System.out.println("This is not a palindrome");
			}
			System.out.println(word2);
			System.out.println("Do you want to check if a string is a palindrome y/n?");
			yesNo = scan.nextLine().charAt(0);
		}

	}

}

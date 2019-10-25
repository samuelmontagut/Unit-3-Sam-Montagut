import java.util.*;

public class CharacterPerLine {

	public static void main(String[] args) {
		System.out.println("Give me a word please");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int max = line.length();
		for (int i = 0; i < max; i++) {
			System.out.println(line.charAt(i));
		}
		System.out.println("thank you!");
		sc.close();
	}

}

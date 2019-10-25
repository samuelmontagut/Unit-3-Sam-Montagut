
import java.util.*;

public class MinofThree {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Give me three integers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (num1 < num2 && num1 < num3) {
			System.out.println("the smallest integer is... " + num1);
		}
		else if (num2 < num1 && num2 < num3) {
			System.out.println("the smallest numer is.... " + num2);
		}
		else {
			System.out.println("The smallest number is... " + num3);
		} 
		scan.close();
		

	}

}

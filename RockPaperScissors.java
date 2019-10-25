import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to play Rock Paper Scissors? y/n");
		char yesNo = scan.nextLine().charAt(0);
		while (yesNo != 'n' & yesNo != 'y') {
			System.out.println("Do you want to play Rock PaperScisors? y/n");
			yesNo = scan.nextLine().charAt(0);
		}
		while (yesNo == 'y') {
			System.out.println("Type Rock, Paper, or Scissors");
			String userChoice = scan.nextLine();
			int userNum = 0;
			int gred = 1;
			while (gred == 1) {
				if (userChoice.contentEquals("Rock") || userChoice.contentEquals("rock")) {
					userNum = 1;
					gred = 0;
				}
				else if (userChoice.contentEquals("Paper") || userChoice.contentEquals("paper")) {
					userNum = 2;
					gred = 0;
				}
				else if (userChoice.contentEquals("Scissors") || userChoice.contentEquals("scissors")) {
					userNum = 3;
					gred = 0;
				}
				else {
					System.out.println("Rock, Paper, or Scissors?");
					userChoice = scan.nextLine();
					gred = 1;
				}
			}
			Random rand = new Random();
			int computerNum = rand.nextInt(3) + 1;
			int bro = 1;
			while (computerNum == userNum) {
				System.out.println("Tie: " + userChoice);
				System.out.println("Type Rock, Paper, or Scissors");
				userChoice = scan.nextLine();
				while (bro == 1) {
					if (userChoice.contentEquals("Rock") || userChoice.contentEquals("rock")) {
						userNum = 1;
						bro = 0;
					}
					else if (userChoice.contentEquals("Paper") || userChoice.contentEquals("paper")) {
						userNum = 2;
						bro = 0;
					}
					else if (userChoice.contentEquals("Scissors") || userChoice.contentEquals("scissors")) {
						userNum = 3;
						bro = 0;
					}
					else {
						System.out.println("Rock, Paper, or Scissors?");
						userChoice = scan.nextLine();
						bro = 1;
					}
				}
				computerNum = rand.nextInt(3) + 1;
			}
			if ((userNum - computerNum == 1) || (userNum - computerNum == -2)) {
				if (computerNum == 1) {
					System.out.println("You Won!!! " + userChoice + " beats rock");
				}
				if (computerNum == 2) {
					System.out.println("You Won!!! " + userChoice + " beats paper");
				}
				if (computerNum == 3) {
					System.out.println("You Won!!! " + userChoice + " beats scissors");
				}
			}
			else {
				if (computerNum == 1) {
					System.out.println("I Won!!! Rock beats " + userChoice);
				}
				if (computerNum == 2) {
					System.out.println("I Won!!! Paper beats " + userChoice);
				}
				if (computerNum == 3) {
					System.out.println("I Won!!! Scissors beats " + userChoice);
				}
			}
			System.out.println("Do you want to play Rock Paper Scissors? y/n");
			yesNo = scan.nextLine().charAt(0);
		}
		System.out.println("WE'll play next time");
		scan.close();
	}
	

}

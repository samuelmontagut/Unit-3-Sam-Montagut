import java.util.*;
import java.text.DecimalFormat;

public class WinPercentage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		System.out.println("How many games were played?");
		double gamesPlayed = scan.nextDouble();
		while (gamesPlayed%1 != 0 || gamesPlayed < 1) {
			System.out.println("Please type in the actual number of games played");
			gamesPlayed = scan.nextDouble();
		}
		System.out.println("How many games did you win?");
		double wonGames = scan.nextDouble();
		while (wonGames % 1 != 0 || wonGames < 0 || wonGames > gamesPlayed) {
			System.out.println("Please type in the actual number of games won");
			wonGames = scan.nextDouble();
		}		
		
		System.out.println("The percent of games won was: " + df.format(100 * (wonGames/gamesPlayed)));
		scan.close();

		
		

	}

}

import java.util.Scanner;

public class SevenDriver {
	public static void main(String[] args) {
		System.out.println("Enter number of dice to toss");
		Scanner scanner = new Scanner(System.in);
		int diceCount = scanner.nextInt();
		SevenTally tally = new SevenTally(diceCount);
		int experiments = 1000000;
		int wins = 0;
		for (int j = 0; j < experiments; j++) {
			if (tally.experiment()) {
				wins++;

			}
		}
		System.out.println((double) wins / experiments);

	}
}
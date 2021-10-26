import java.util.Scanner;

/**
 * Given any number of dice rolled what is the experimental probability that two
 * numbers add up to 7? Code runs ten-thousand experiments
 */
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
		System.out
				.println("If " + diceCount + " dice are rolled, the likelyhood that two numbers would add up to 7 is ");
		System.out.println((double) wins / experiments);

	}
}
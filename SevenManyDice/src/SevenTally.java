/**
 * Represents any number of dice rolled resulting with the whether or not two
 * numbers will add up to seven.
 * 
 * @author sagesilberman
 *
 */
public class SevenTally {
	private int die; // number of dice

	/**
	 * Constructs a SevenTally with when given any number of dice rolled the
	 * probability that two numbers add up to 7
	 * 
	 * @param diceCount the number of dice
	 */
	public SevenTally(int diceCount) {
		this.die = diceCount;
	}

	/**
	 * Returns <code>true</code> if the number of wins, two numbers adding up to
	 * seven, is greater than 0, otherwise false
	 * 
	 * @return <code>true</code> if the number of wins, two numbers adding up to
	 *         seven, is greater than 0 <code>false</code> otherwise
	 */
	public boolean experiment() {
		int wins = 0;

		int[] dice = new int[die];
		// Assigning a value between 1-6 to each part of the array
		for (int d = 0; d < dice.length; d++) {
			dice[d] = (1 + (int) (6 * Math.random()));
			// Testing for all possible pairs in the array
			for (int s = 0; s < dice.length; s++) {
				// creating second variable for second dice
				for (int j = s + 1; j < dice.length; j++) {
					if (dice[s] + dice[j] == 7) {
						wins++;
					}
					// testing the pair

				}
			}
		}
		if (wins > 0) {
			return true;
		} else {
			return false;
		}
	}

}
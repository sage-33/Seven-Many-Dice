
public class SevenTally {
	private int die;

	public SevenTally(int diceCount) {
		this.die = diceCount;
	}

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
		// keeps replaying it
	}

}
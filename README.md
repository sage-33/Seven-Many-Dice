# Programming Project: Getting to Seven with Many Dice

## Clone Project

Begin by cloning the provided project and importing it into your workspace.

`git clone <url for github repository>`

After cloning this repository you want to run these commands

`git checkout -b development`

This will create a branch named development and switch you to it. The development branch is where you will make all your commits.

## Import into Eclipse

You should then go to Eclipse, which hopefully has finished installing.

In the top toolbar, click File --> Import. Double-click on General and then `Projects from Folder or Archive`. Click `Directory` and find the folder inside the repository named `SevenManyDice` and click Open. The project should pop up in the text box Projects. Click finish and you should be good to go!

# Complete Seven Many Dice Project

An elementary calculation yields the result that theoretically, the probability of turning up 7 when two dice are thrown is 1/6, or .166666. But what if more dice are thrown? If 3 dice are thrown, what is the probability that some 2 of three sum to 7? (Thus if 2-2-1 or 2-2-3 are thrown, no pair of dice sum to 7, so these combinations are failures, but if 2-3-4 or 2-3-5 or 1-2-5 are thrown, in each case a sum of 7 IS achievable with exactly 2 of the dice).

For this problem, you are to start with the driver below, which first prompts for the number of dice tossed - here, diceCount, and then runs a million experiments to determine the empirical likelihood that with that many dice rolled, some pair of the dice thrown sum to 7:

```java
import java.util.Scanner;
public class SevenDriver{
  public static void main(String[] args){
    System.out.println("Enter number of dice to toss");
    Scanner scanner = new Scanner(System.in);
    int diceCount = scanner.nextInt();
    SevenTally tally = new SevenTally(diceCount);
    int experiments = 1000000;
    int wins = 0;
    for(int j = 0; j < experiments; j++)
      if(tally.experiment()) wins++;
    System.out.println((double)wins/experiments);

  }
}
```

Note that obviously the more dice you throw, the greater the likelihood that some pair will sum to 7.

Your job for this assignment, then, is to write the code for the class SevenTally so that running the driver will correctly report an accurate empirical value for the likelihood of finding a pair that sums to 7.

## Notes

- You need to comment your methods according to this [Javadoc Guide](https://github.com/jd12/liferay-portal/blob/master/readme/ADVANCED_JAVADOC_GUIDELINES.markdown).

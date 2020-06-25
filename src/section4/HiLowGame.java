package section4;



import java.util.Random;

import javax.swing.JOptionPane;

public class HiLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+ 1;
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat until step 10 ten times
		for (int i = 0; i < 10; i++) {
			
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String answer1 = JOptionPane.showInputDialog(null,"Guess a number between 1 and 100 (including both)");
			// 4. Convert the users answer to an int (Integer.parseInt(string))
int x = Integer.parseInt(answer1);
		
			// 5. if the guess is correct
				// 6. Win
if (x==random) {
	JOptionPane.showMessageDialog(null, "You Won!!!");
	System.exit(0);
}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		
		
			// 7. if the guess is high
				// 8. Tell them it's too high
else if (x>random) {
	JOptionPane.showMessageDialog(null, "Too high, guess lower");
}
		
		
			// 9. if the guess is low
				// 10. Tell them it's too low
else if (x<random) {
	JOptionPane.showMessageDialog(null, "Too low, guess higher");
}
		}
		
		
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "You Lose");
		
	}

}

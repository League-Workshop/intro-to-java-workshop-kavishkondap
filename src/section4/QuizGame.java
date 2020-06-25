package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
	String answer1 = JOptionPane.showInputDialog(null, "What is the sin of 30 degrees?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer1.equals("0.5")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct!");
		}else {
			JOptionPane.showMessageDialog(null,"Wrong!");
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2 = JOptionPane.showInputDialog(null, "What type of creature is Dobby from Harry Potter?");
		if (answer2.equals("house elf")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct!");
		}else {
			JOptionPane.showMessageDialog(null,"Wrong!");
		}
		String answer3 = JOptionPane.showInputDialog(null,"How many protons are in one carbon atom?");
		if (answer3.equals("6")) {
			score = score +1;
			JOptionPane.showMessageDialog(null, "Correct!");
		}else {
			JOptionPane.showMessageDialog(null,"Wrong!");
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Final Score = " + score);
	}
		
}

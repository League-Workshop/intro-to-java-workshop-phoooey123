package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is 2+2?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("4")) {
			score = score + 1;
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2 = JOptionPane.showInputDialog("What color is Michaels jacket?");
		
		if(answer2.equals("blue")) {
			score = score + 1;
		}
		
		String answer3 = JOptionPane.showInputDialog("How old is Ryder?");
		
		if(answer3.equals("13")) {
			score = score + 1;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your score is " + score + ". The highest score you could get is 3.");
	}
}

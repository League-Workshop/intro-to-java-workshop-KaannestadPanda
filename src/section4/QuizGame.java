package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String answer=JOptionPane.showInputDialog("Do .io games suck?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("yep")) {
		// 4.  if the user's answer is correct
		score++;
		JOptionPane.showMessageDialog(null,"congrats you is a smart boi");
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
		String dub=JOptionPane.showInputDialog("Do .io games not suck?");
		if(dub.equals("nope")) {
			JOptionPane.showMessageDialog(null,"congrats you is a smart boi");
			score++;
		}
		String b=JOptionPane.showInputDialog(".io games suck right?");
		if(b.equals("right")) {
			JOptionPane.showMessageDialog(null,"congrats you is a smart boi");
			score++;
		}
		String c=JOptionPane.showInputDialog("Wait, .io games DON'T suck!");
		if(c.equals("ur wrong")) {
			JOptionPane.showMessageDialog(null,"congrats you is a smart boi");
			score++;
		}
		String d=JOptionPane.showInputDialog(".io game");
		if(d.equals("that sucks")) {
			JOptionPane.showMessageDialog(null,"congrats you is a smart boi");
			score++;
		}
		
		
		System.out.println("Your score is "+score+" and that is below average");
	
	
	
	
	
	
	
	}

	private static void speak(String answer) {
		// TODO Auto-generated method stub
		
	}
}

package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog("Do ya know how to code me lad?");
		// 2. If they say "yes", tell them they will rule the world.
		if (answer.equals("Ya")) {
			// 3. Otherwise, wish them good luck washing dishes.
			JOptionPane.showMessageDialog(null,
					"OH YES MY DISCIPLINE, YOU WILL SUCCEED WHERE ALL OTHERS HAVE FAILED.  YOU WILL CONTROL THE POPULACE OF TERRA AND RULE ALL ASPECTS OF LIFE ITSELF!!! THE UNIVERSE WILL FEAR YOUR AWESOME POWER!!  THEY WILL BOW DOWN TO YOUR SUPREME MIGHT AS YOUR ENEMIES COWER, JUST WAITING FOR THEIR TIME TO BE CRUSHED BY YOUR DESTRUCTIVE DESTRUCION!!!!");
		}
		else{JOptionPane.showMessageDialog(null,"you suck");
	}
	}
}

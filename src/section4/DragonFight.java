package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/test/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the drtagon to take its treasure!", "Dragon Fighter", 0, dragon);
		
		int playerHealth=200;
		int dragonHealth=9001;
		
		
		while(playerHealth>0 && dragonHealth>0) {
		
		String attack=JOptionPane.showInputDialog(null, "how u attack de drag"
				+ " OOF or qwerty");
		if(attack.equals("OOF")) {
			JOptionPane.showMessageDialog(null, "The drtagon lets loose a primal ROAR!!!");
		speak("AUUUUUWAWAWAWAWAWUUUUUUUUUAAAAAAAAA");
		dragonHealth-=4500;}
		else if(attack.equals("qwerty")) {
			JOptionPane.showMessageDialog(null, "You instantly kill the drtagon!!!");
			JOptionPane.showMessageDialog(null, "But wait!!  The drtagon still has one health!");
			dragonHealth-=9000;
		}
		else 
		{JOptionPane.showMessageDialog(null, "WOW you really suck at this!  You didn't attack the drtagon loser!!  You have been burned to a crisp and the planet is devastated!!  You are an utter failure!!!");
		}
		if(dragonHealth<1) {
			JOptionPane.showMessageDialog(null, "Wow you actually beat this extremely easy game!!  You exeeded all my expectations and this is probably your greatest accomplishment!  You are almost good at life!");
		String victory=JOptionPane.showInputDialog(null, "Type Drtagon if you want a victory song!");
				if(victory.equals("Drtagon")){
					speak("Running in the 90's, it's the new way I like to be!  I'm just running in the 90's, yes you gotta know, yes you gotta see dududududulalaladadadadlaaldldlludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudadsludududulululullululululddudududuaudududuaudddldudads. and by the way narwhale sucks");
				}
					// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		
		// 4. Create a variable to hold the damage the player's attack does each round
		
		// 5. Create a variable to hold the damage the dragon's attack does each round
		
		
		// 6.  Delete the slashes at the beginning of the next line.  
		//while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		
		// 9. If they typed in "yell":
		
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		
	}
		}
}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}
}


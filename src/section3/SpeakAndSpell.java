package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("running in the 90's its the new way i like to be im just running in the 90's yes you gotta know yes you gotta see dododododododododoodlodldolodldodldoldododldoldoldodldoldodldo");
		// 2. Catch the user's answer in a String
String answer=JOptionPane.showInputDialog("spell it");
		// 3. If the user spelled the word correctly, speak "correct"
if(answer.equals("DANK MEMES")){
		// 4. Otherwise say "wrong"
speak("I CONTROL YOUR THOUGHTS AND ACTIONS.  YOUR MIND IS MINE");

		// 5. repeat the process for other words
}
else {
	speak("Wow you suck. You are SOOOOO bad at this.  You are just the worst and you need to research your memes.  You are so bad you suck as much as Andrew does at Narwhale.");
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



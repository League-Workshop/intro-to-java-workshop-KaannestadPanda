package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int random=new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(random);
	// 4. Get the user to enter something that they think is awesome
String answer=JOptionPane.showInputDialog(null,"What is awesome?");
	// 5. If the random number is 0
if(random==0) {
	JOptionPane.showMessageDialog(null,"DAS SO AWESOME");
}
	// -- tell the user whatever they entered is awesome!
if(random==1) {
	JOptionPane.showMessageDialog(null,"That sucks but whatever");
}
	// 6. If the random number is 1
if(random==2) {
	JOptionPane.showMessageDialog(null,"Naw that is booooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooring");
}
	// -- tell the user whatever they entered is ok.
if(random==3) {
	JOptionPane.showMessageDialog(null,"IO SUCKS");
}
	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}

	private static void speak(String string) {
		// TODO Auto-generated method stub
		
	}
}



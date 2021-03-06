package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot Dob = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...

		// 7. Set the pen color to random

		// 1. Call the drawSquare() method
		for (int i = 0; i < 1000; i++) {
			Dob.setRandomPenColor();
			drawSquare();
		}
		// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {

		Dob.penDown();
		Dob.setSpeed(10000);
		Dob.move(50);
		Dob.turn(90);
		Dob.move(50);
		Dob.turn(90);
		Dob.move(50);
		Dob.turn(90);
		Dob.move(50);
		Dob.turn(90);
		Dob.turn(90);

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}

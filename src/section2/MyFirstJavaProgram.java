package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot Rob=new Robot();
		Rob.setSpeed(100000000);
		Rob.setPenColor(100, 25, 25);
		Rob.penDown();
		Rob.move(60);
		Rob.turn(180);
		Rob.move(60);
		Rob.turn(-90);
		Rob.move(60);
	
		
		
	}
}

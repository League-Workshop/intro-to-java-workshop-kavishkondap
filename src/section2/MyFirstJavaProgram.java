package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Bob = new Robot();
//		Bob.penDown();
//	Bob.move(200);
//		Bob.turn(180);
//		Bob.move(100);
//		Bob.turn(-90);
//		Bob.move(100);
//		Bob.turn(90);
//		Bob.move(100);
//		Bob.turn(180);
//		Bob.move(200);
//		Bob.penUp();
//		Bob.turn(180);
//		Bob.move(100);
//		Bob.turn(-90);
//		Bob.move(50);
		
for (int i = 0; i < 100000; i++) {
	Bob.penDown();
	Bob.turn(1);
	Bob.move(1);
}
		
	}
}

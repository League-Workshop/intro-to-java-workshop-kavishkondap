package zebra.section3;

import org.jointheleague.graphical.robot.Robot;

public class RepeatRobot {
	public static void main(String[] args) {
		
		// ▼ Write your code BELOW this line ▼
		
		
		// 1. Make a new Robot().  Remember to give it a name!  Example: Robot isis = new Robot();
		Robot Bob = new Robot();
		// 2. Make your robot have a really fast speed (hint: setSpeed())
		Bob.setSpeed(100);
		// 3. Make your robot put its penDown()
		Bob.penDown();
		// 4. Make your robot turn()
		for (int i = 0; i < 10000; i++) {
			
		
		Bob.turn(15);
		// 5. Make your robot pick a random pen color (hint: setRandomPenColor())
		Bob.setRandomPenColor();
		// 6. Make your robot move() so you can see the new pen color
		Bob.move(i);
		// 7. make the robot do steps 4, 5, and 6 a BUNCH OF TIMES
		}
	
		
		
		// BONUS: Can you make a spiral?
		
		
		
		
		
		
		
		// ▲ Write your code ABOVE this line ▲
		
	}
}

package section4;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotCommander {
	public static void main(String[] args) {
		int sides = 5;
		
		int turn = 360/sides;
		// 1. Create a new Robot
		Robot Bob = new Robot();
		// 2. Ask the user what shape to draw. Give them 3 choices (eg. triangle,
		// square, pentagon)
		String answer = JOptionPane.showInputDialog(null,
				"What shape do you want to draw? The choices are a triangle, square, hexagon, and random.");
		String color = JOptionPane.showInputDialog(null,
				"What color do you want the shape to be? Choices are red green and blue, and random.");
		if (color.equals("red")) {
			Bob.setPenColor(Color.red);
		} else if (color.equals("green")) {
			Bob.setPenColor(Color.green);
		} else if(color.equals("blue")){
			Bob.setPenColor(Color.blue);
		}else {
			Bob.setRandomPenColor();
		}
		// 3. Make the robot draw that shape based on the user's input
		if (answer.equals("triangle")) {
			Bob.setSpeed(100);
			Bob.penDown();
			Bob.turn(30);
			Bob.move(100);
			Bob.turn(120);
			Bob.move(100);
			Bob.turn(120);
			Bob.move(100);
		} else if (answer.equals("square")) {
			Bob.setSpeed(100);
			Bob.penDown();
			for (int i = 0; i < 4; i++) {
				Bob.move(100);
				Bob.turn(90);
			}
		} else if (answer.equals("hexagon")){
			Bob.setSpeed(100);
			Bob.penDown();

			for (int j = 0; j < 6; j++) {
				Bob.turn(360 / 6);
				Bob.move(100);
			} 
		}else {
				
				
		for (int i = 0; i < 200; i++) {
			

					
			Bob.move(i);
					
			
					
			Bob.turn(turn);
					
			Bob.turn(1);
		}
			}
		}

	}

	// 4. Go back to before step #3 and ask the user what color to make the shape.
	// Give them 3 choices (eg. blue, red, green)

	// 5. Add code to set the Robot's pen color the chosen color


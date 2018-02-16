package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot bill = new Robot();
		bill.miniaturize();
		// 5. Set your robot's pen down 
		bill.penDown();
		// 3. Set the robot to go at max speed (10)
		bill.setSpeed(10);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i=0;i<74;i++) {
			// 7. Change the pen color to random
			bill.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			bill.move(i*5);
			// 2. Turn the robot 360/7 degrees to the right
			bill.turn(360/7);
			// 8. Set the pen width to i
			bill.setPenWidth(i);
		}
	}
}

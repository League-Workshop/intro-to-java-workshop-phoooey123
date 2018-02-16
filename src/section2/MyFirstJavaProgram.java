package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// Bill Nye The Robot guy
		Robot bill = new Robot();
		int x = 144;

		bill.miniaturize();
		bill.setSpeed(100);
		bill.penDown();
		bill.setPenWidth(10);

		for (int i = 0;; i = i++) {
			bill.setRandomPenColor();
			bill.move(200);
			bill.turn(x);
			x = x+1;

		}

	}
}

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	
	public static void main(String[] args) {
		
		Robot fred = new Robot();
		fred.setSpeed(10);
	
		String a = JOptionPane.showInputDialog("What shape do you want to paint?");
		String b = JOptionPane.showInputDialog("What color do you want to use?");
		
		if(b.equals("red")) {
		fred.setPenColor(255, 0, 0);
		fred.penDown();
	}
		else if(b.equals("green")) {
			fred.setPenColor(0, 255, 0);
			fred.penDown();
		}
		else if(b.equals("blue")) {
			fred.setPenColor(0, 0 , 255);
			fred.penDown();
		}

			
		
		
		if(a.equals("square")) {
			for (int i = 0; i < 4; i++) {
				fred.move(100);
				fred.turn(90);
			}
		}
		else if(a.equals("circle")) {
			for (int i = 0; i < 360; i++) {
				fred.move(2);
				fred.turn(1);
				
			}
		}
		else if(a.equals("triangle")) {
			for (int i = 0; i < 3; i++) {
				fred.move(100);
				fred.turn(120);
				
			}
		}

		
	}

}

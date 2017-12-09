import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	
	public static void main(String[] args) {
		
		Robot fred = new Robot();
		fred.setSpeed(7);
	//make rainbow, try to set hi to false, then if you select rainbow, it will set hi to true, and in the drawing area
		//have something that will detect for true hi, and if hi is true, then have a special code that will add rainbows and will cycle thru the color using setcolor color.red ect
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
		else if(b.equals("hi")) {
			fred.penDown();
			for (int j = 0; j < 5000; j++) {
				System.out.println(j);
				
					fred.setPenColor(Color.red);
					fred.penDown();
				
							}
			for (int i = 0; i < 5000; i++) {
			
					
				
				fred.setPenColor(Color.ORANGE);
				
				

			}
		}
		if(a+b.equals("square"+"hi"))
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

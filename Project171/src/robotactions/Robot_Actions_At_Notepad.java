package robotactions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_Actions_At_Notepad 
{

	public static void main(String[] args) throws IOException, Exception 
	{
		//Execute runtime program to launch notepad file
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for Robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_Q);

	}

}

package _02_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class SmileyBlues {
	void start() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		Smiley sm = new Smiley();
		Smiley il = new Smiley();
		Smiley ey = new Smiley();
		panel.add(ey);
		panel.add(il);
		panel.add(sm);
		frame.pack();
		
		// 1. Make a new JFrame and set it to be visible

		// 2. Set your frame's default close operation to JFrame.EXIT_ON_CLOSE

		// 3. Make a new JPanel

		// 4. Add your panel to your frame

		// 8. DO THIS LAST: 
		// Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley object's!)
		// Using a specific object for a static variable works, but is not usually recommended.
		// Run it again; are your Smileys all yellow now? Also try changing them to red or green!

		// 5. Make three Smiley objects and add them to your panel

		// 6. Pack your frame

		// 7. RUN THE PROGRAM and make sure you see three blue Smileys!
	}
}

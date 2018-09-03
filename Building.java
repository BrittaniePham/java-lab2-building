package lab2_building;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Building extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// TODO: write code to draw the building
		g.drawRect(100, 100, 200, 400);
		
		int x = 125;
		int y = 150;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
				g.drawRect(x , y, 30, 30);
				x += 60;
			}
			x = 125;
			y += 60;
		}
	}

}

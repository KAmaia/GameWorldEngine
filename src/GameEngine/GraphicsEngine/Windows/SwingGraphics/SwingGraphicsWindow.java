package GameEngine.GraphicsEngine.Windows.SwingGraphics;

import GameEngine.GraphicsEngine.Windows.*;

import javax.swing.*;
import java.awt.*;

/**
 * @author Krystal Amaia
 */
public class SwingGraphicsWindow extends JFrame implements GameWindow {

	public SwingGraphicsWindow(int sizeX, int sizeY) {
		initUI(sizeX, sizeY);

	}

	@Override
	public void update() {
		repaint();
	}


	private void initUI(int sizeX, int sizeY) {
		setTitle("Ant Simulator by: Krystal Amaia");
		setSize(1080, 720);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JLabel helloLabel = new JLabel("Hello World!");
		helloLabel.setSize(getWidth() - 200, getHeight() - 200);

		helloLabel.setBackground(Color.cyan);
		helloLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		add(helloLabel);

	}
}

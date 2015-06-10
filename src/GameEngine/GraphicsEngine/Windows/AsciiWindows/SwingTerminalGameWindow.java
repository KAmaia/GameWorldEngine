package GameEngine.GraphicsEngine.Windows.AsciiWindows;

import GameEngine.GraphicsEngine.Windows.*;
import com.googlecode.lanterna.terminal.swing.*;

/**
 * @author Krystal Amaia
 */
public class SwingTerminalGameWindow implements GameWindow {
	private final int                SIZE_X;
	private final int                SIZE_Y;
	private       SwingTerminalFrame gameFrame;

	public SwingTerminalGameWindow(int sizeX, int sizeY) {
		SIZE_X = sizeX;
		SIZE_Y = sizeY;
		gameFrame = new SwingTerminalFrame("test");
		gameFrame.setVisible(true);
	}

	@Override
	public void update() {

	}
}

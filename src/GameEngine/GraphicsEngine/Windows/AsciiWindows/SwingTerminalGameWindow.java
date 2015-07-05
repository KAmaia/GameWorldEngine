package GameEngine.GraphicsEngine.Windows.AsciiWindows;

import GameEngine.GraphicsEngine.Windows.*;
import com.googlecode.lanterna.screen.*;
import com.googlecode.lanterna.terminal.swing.*;

/**
 * @author Krystal Amaia
 */
public class SwingTerminalGameWindow implements GameWindow {
	private final int                SIZE_X;
	private final int                SIZE_Y;
	private       SwingTerminalFrame gameFrame;
	private TerminalScreen gameScreen;

	public SwingTerminalGameWindow(int sizeX, int sizeY) {
		gameFrame = new SwingTerminalFrame("test");
		int fontHeight = gameFrame.getFontMetrics(gameFrame.getFont()).getHeight();

		System.out.println("---" + fontHeight);
		SIZE_X = sizeX * fontHeight;
		SIZE_Y = sizeY;

		gameFrame.setSize(SIZE_Y, SIZE_X);
		gameFrame.setVisible(true);
		update();
	}

	@Override
	public void update() {
		for (int y = 0; y < SIZE_Y; y++) {
			gameFrame.setCursorPosition(y, 0);
			gameFrame.putCharacter('*');
		}
		gameFrame.flush();
	}
}

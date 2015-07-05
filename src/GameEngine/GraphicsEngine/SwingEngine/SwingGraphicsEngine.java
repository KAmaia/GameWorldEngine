package GameEngine.GraphicsEngine.SwingEngine;

import GameEngine.GraphicsEngine.*;
import GameEngine.GraphicsEngine.Windows.SwingGraphics.*;

/**
 * @author Krystal Amaia
 */
public class SwingGraphicsEngine extends GraphicsEngine {
	private SwingGraphicsWindow sgw;

	public SwingGraphicsEngine(int sizeX, int sizeY) {
		sgw = new SwingGraphicsWindow(sizeX, sizeY);
		sgw.setVisible(true);
		sgw.update();
	}
}

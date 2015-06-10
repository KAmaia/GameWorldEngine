package GameEngine.GraphicsEngine.AsciiEngine;

import GameEngine.GraphicsEngine.*;
import GameEngine.GraphicsEngine.Windows.AsciiWindows.*;

/**
 * @author Krystal Amaia
 */
public class SwingTerminalGraphicsEngine extends GraphicsEngine {

	private SwingTerminalGameWindow STGW;

	public SwingTerminalGraphicsEngine(int sizeX, int sizeY) {
		STGW = new SwingTerminalGameWindow(sizeX, sizeY);
	}

}

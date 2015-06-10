package GameEngine.GraphicsEngine.GraphicsEngineGenerator;

import GameEngine.GraphicsEngine.AsciiEngine.*;
import GameEngine.GraphicsEngine.*;

/**
 * @author Krystal Amaia
 * @version 0.1
 *          <p/>
 *          Generates a new graphics engine based on the selected type.  As of this release only swingTerminal is
 *          supported.
 */

public class GraphicsEngineGenerator {


	/**
	 * Generates a new graphics engine based on the selected type.  As of this release only swingTerminal is
	 * supported.
	 *
	 * @param type
	 * 	   graphics engine to create.
	 *
	 * @return a new graphicsEngine.
	 */
	public static GraphicsEngine generateEngine(GraphicsEngineType type, int sizeX, int sizeY) {
		GraphicsEngine engine;
		switch (type) {
			case SwingTerminal:
				engine = new SwingTerminalGraphicsEngine(sizeX, sizeY);
				break;
			default:
				engine = new SwingTerminalGraphicsEngine(sizeX, sizeY);
				break;
		}
		return engine;
	}
}

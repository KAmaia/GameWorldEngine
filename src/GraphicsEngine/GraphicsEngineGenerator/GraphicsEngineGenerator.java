package GraphicsEngine.GraphicsEngineGenerator;

import GraphicsEngine.AsciiEngine.*;
import GraphicsEngine.*;

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
	public static GraphicsEngine generateEngine(GraphicsEngineType type) {
		GraphicsEngine engine;
		switch (type) {
			case SwingTerminal:
				engine = new SwingTerminalGraphicsEngine();
				break;
			default:
				engine = new SwingTerminalGraphicsEngine();
				break;
		}
		return engine;
	}
}

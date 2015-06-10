package GameEngine.GraphicsEngine.GraphicsEngineGenerator;

/**
 * @author Krystal Amaia
 */
public enum GraphicsEngineType {
	Terminal(1),
	SwingTerminal(2);

	int type;

	private GraphicsEngineType(int type) {
		this.type = type;
	}
}

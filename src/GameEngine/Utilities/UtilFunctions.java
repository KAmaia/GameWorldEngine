package GameEngine.Utilities;

/**
 * @author Krystal Amaia
 */
public class UtilFunctions {
	public static int tilesToPixels(int tiles) {
		return tiles * 64;
	}

	public static int pixelsToTiles(int pixels) {
		return pixels / 64;
	}
}

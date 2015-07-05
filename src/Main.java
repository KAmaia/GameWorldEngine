import GameEngine.GraphicsEngine.*;
import GameEngine.GraphicsEngine.GraphicsEngineGenerator.*;
import GameEngine.WorldEngine.Map.*;
import GameEngine.WorldEngine.MapGenerator.*;
import GameEngine.WorldEngine.World.*;
import GameEngine.WorldEngine.WorldGenerator.*;

/**
 * @author Krystal Amaia
 *         <p>
 *         Test class just used to make sure the library works before exporting.
 *         </p>
 * @version 0.1
 */

public class Main {
	public static void main(String[] args) {
		int sizeX = 25;
		int sizeY = 80;

		World world = new WorldGenerator(sizeX, sizeY).generateWorld();
		CharMap OWCM = new OverWorldMapGenerator().generateOverWorldCharMap(world);

		GraphicsEngine graphicsEngine = new GraphicsEngineGenerator()
			   .generateEngine(GraphicsEngineType.SwingGraphics, sizeX, sizeY);
		graphicsEngine.update();

	}
}
import GameEngine.PathFinder.*;
import GameEngine.Utilities.*;
import GameEngine.WorldEngine.World.*;
import GameEngine.WorldEngine.WorldGenerator.*;

/**
 * @author Krystal Amaia
 *         <p>
 *         Test class just used to make sure the library works before exporting.
 *         </p>
 * @version 0.1
 */

public class GameEngine {

	public static void main(String[] args) {
		int sizeX = 480;
		int sizeY = 640;
		boolean running = true;

		World world = new WorldGenerator(sizeX, sizeY).generateWorld();

		PathFinder pf = new PathFinder(world.getTiles());
		int i = 0;
		while (i < 10) {
			System.out.println("Run #: " + i + "=========");
			pf.createPath(new Coordinate(RandomGenerators.nextIntInRange(0, sizeX),
			                             RandomGenerators.nextIntInRange(0, sizeY)),
			              new Coordinate(RandomGenerators.nextIntInRange(0, sizeX),
			                             RandomGenerators.nextIntInRange(0, sizeY)));
			i++;
			System.out.println("End Run #: " + i + "=====");
		}
	}

}
import GameEngine.Actors.*;
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


		int i = 0;
		Actor a = new Actor(world);
		while (i <= 10) {
			System.out.println("Loop # " + i);
			a.act();
			i++;
		}
	}

}
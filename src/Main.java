import GameWorldGenerationEngine.World.World;
import GameWorldGenerationEngine.WorldGenerator.WorldGenerator;

/**
 * Created by Krystal on 2015-06-05.
 */

public class Main {
	public static void main(String[] args) {
		World world = new WorldGenerator(10, 11).generateWorld();
		world.print();


	}
}
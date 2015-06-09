package GameEngine.WorldEngine.WorldGenerator;



import GameEngine.Utilities.BoundsChecker;
import GameEngine.WorldEngine.World.TileType;
import GameEngine.WorldEngine.World.World;

/**
 * Created by Krystal on 2015-06-05.
 */
public class WorldGenerator {
	private World world;

	private final int DEFAULT_SIZE_X = 100;
	private final int DEFAULT_SIZE_Y = 100;

	private final int SIZE_X;
	private final int SIZE_Y;

	/**
	 * Default Constructor
	 */
	public WorldGenerator() {
		SIZE_X = DEFAULT_SIZE_X;
		SIZE_Y = DEFAULT_SIZE_Y;
	}

	/**
	 * Creates a new World with specified height and width.
	 *
	 * @param sizeX The desired Height of the World.
	 * @param sizeY The desired Width of the World.
	 */
	public WorldGenerator(int sizeX, int sizeY) {
		SIZE_X = sizeX;
		SIZE_Y = sizeY;
	}

	/**
	 *
	 */
	public World generateWorld() {
		world = new World(SIZE_X, SIZE_Y).generateWorld();
		fillWorld(TileType.DIRT);
		return world;
	}


	private void fillWorld(TileType type) {
		for (int x = 0; x <= SIZE_X; x++) {
			for (int y = 0; y < SIZE_Y; y++) {
				if (!BoundsChecker.checkBounds(x, y, world.getTiles())) {
					world.setTile(x, y, type);
				}

				else {
					continue;
				}
			}
		}
	}


	private void populateRandomWorld() {
		for (int x = 0; x <= SIZE_X; x++) {
			for (int y = 0; y <= SIZE_Y; y++) {
				//add random tile.
			}
		}
	}


}



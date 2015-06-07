package GameWorldGenerationEngine.World;

import java.util.Random;

/**
 * @author Krystal Amaia
 * @version 0.0.1
 * @date 2014/06/10
 */
public class World {

	private static final int NORTHWEST = 0;
	private static final int NORTH     = 1;
	private static final int NORTHEAST = 2;
	private static final int WEST      = 3;
	private static final int EAST      = 4;
	private static final int SOUTHWEST = 5;
	private static final int SOUTH     = 6;
	private static final int SOUTHEAST = 7;

	private final int SIZE_X;
	private final int SIZE_Y;

	private Tile[][] gWorld;
	private static Random random = new Random();

	public World(int sizeX, int sizeY) {
		SIZE_X = sizeX;
		SIZE_Y = sizeY;
	}


	/**
	 * Creates and initializes a new tile array with dimensions matching the required dimensions.
	 */
	private void initializeWorld() {
		gWorld = new Tile[SIZE_X][SIZE_Y];
		//initialize a new World of Random Tiles.
		for (int x = 0; x < SIZE_X; x++) {
			for (int y = 0; y < SIZE_Y; y++) {
				//create a new tile.
				Tile tile = new Tile();
				gWorld[x][y] = tile.setupTile(TileType.VOID);
			}
		}
	}

	/**
	 * Creates a one dimensional 8 tile array containing the neighbors of the target cell.
	 *
	 * @param x the x Index of the cell we wish to gather the neighbors for.
	 * @param y the y Index of the cell we wish to gather the neighbors for.
	 * @return a tile array of neighbors
	 */
	private Tile[] getNeighbors(int x, int y) {
		//Create a Tile Arrax to store all 8 of our neighbors in.  This makes things so much easier than what I was
		// doing before.
		Tile[] neighbors = {gWorld[x - 1][y - 1], gWorld[x - y][y], gWorld[x - 1][y + 1], gWorld[x][y - 1],
			   gWorld[x][y + 1], gWorld[x + 1][y - 1], gWorld[x + 1][y], gWorld[x + 1][y + 1]};

		return neighbors;
	}


	/**
	 * return tile at position
	 */
	public Tile getTile(int x, int y) {
		return gWorld[x][y];
	}



	public World generateWorld() {
		initializeWorld();
		return this;
	}


	public void setTile(int i, int j, TileType t) {
		gWorld[i][j].setType(t);
	}

	public Object[][] getTiles() {
		return gWorld;
	}
}


//###END WORLD###
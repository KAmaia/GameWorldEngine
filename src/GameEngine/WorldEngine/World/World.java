package GameEngine.WorldEngine.World;

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

	/**
	 * CTor
	 * @param sizeX The Height of the World.
	 * @param sizeY The Width of the World
	 */
	public World(int sizeX, int sizeY) {
		SIZE_X = sizeX;
		SIZE_Y = sizeY;
	}

	/**
	 * Initializes the world as VOID.  Use this later to check that the world is whole.
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
	 *
	 * @param x x address of tile to get.
	 * @param y y address of tile to get.
	 * @return tile at address [x][y].
	 */
	public Tile getTile(int x, int y) {
		return gWorld[x][y];
	}



	public World generateWorld() {
		initializeWorld();
		return this;
	}


	public void setTile(int x, int y, TileType t) {
		gWorld[x][y].setType(t);
	}

	public Tile[][] getTiles() {
		return gWorld;
	}
	public int getSIZE_X(){
		return SIZE_X;
	}
	public int getSIZE_Y(){
		return SIZE_Y;
	}
}


//###END WORLD###
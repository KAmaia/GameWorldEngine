package GameEngine.WorldEngine.Map;

import GameEngine.Utilities.*;


/**
 * @author Krystal Amaia
 *         <p>
 *         A character based map object.
 *         </p>
 * @version 0.1
 */
public class CharMap {

	private final Character[][] charMap;

	/**
	 * Constructor
	 *
	 * @param size_X
	 * 	   vertical size of the map to create
	 * @param size_Y
	 * 	   horizontal size of the map to create
	 */
	public CharMap(int size_X, int size_Y) {
		int sizeX = size_X;
		int sizeY = size_Y;
		charMap = new Character[size_X][size_Y];
	}

	/**
	 * Returns a mapTileChar for a given Tile
	 * @param x X address of the tile to set.
	 * @param y Y Address of the tile to set
	 * @param mapTileChar The Character to set the tile to.
	 */
	public void setTile(int x, int y, char mapTileChar) {
		if (!BoundsChecker.checkBounds(x,y, charMap)) {
			charMap[x][y] = mapTileChar;
		}
	}

	/**
	 * Gets a tile at a specific address
	 * @param x X address of the tile to get
	 * @param y Y address of the tile to get
	 * @return tile at position X,Y
	 */

	public char getMapTileChar(int x, int y) {
		return charMap[x][y];
	}
}

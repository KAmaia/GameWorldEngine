package GameEngine.WorldEngine.Map;

import GameEngine.WorldEngine.World.*;


/**
 * @author Krystal Amaia
 *         <p>
 *         Enumerates Different TileTypes to their respective characters.
 *         </p>
 * @version 0.1
 */
public enum MapCharType {
	DIRT(TileType.DIRT, '#'),
	VOID(TileType.VOID, '~');

	final TileType tileType;
	final char     tileChar;

	/**
	 * @param tileType
	 * 	   TileType to enumerate
	 * @param tileChar
	 * 	   TileChar to link it to.
	 */
	private MapCharType(TileType tileType, char tileChar) {
		this.tileType = tileType;
		this.tileChar = tileChar;
	}


}

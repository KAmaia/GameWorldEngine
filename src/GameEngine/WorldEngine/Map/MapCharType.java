package GameEngine.WorldEngine.Map;

import GameEngine.WorldEngine.World.TileType;

/**
 * Created by Krystal on 2015-06-08.
 */
public enum MapCharType {
	DIRT(TileType.DIRT, '#'),
	VOID(TileType.VOID, '~');

	TileType tileType;
	char     tileChar;

	private MapCharType(TileType tileType, char tileChar) {
		this.tileType = tileType;
		this.tileChar = tileChar;
	}



}

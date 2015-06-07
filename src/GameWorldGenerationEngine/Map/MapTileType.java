package GameWorldGenerationEngine.Map;

import GameWorldGenerationEngine.World.TileType;

/**
 * Created by Krystal on 2015-06-07.
 */
public enum MapTileType {
	//A simple replication of the tile enumeration to link tile types to characters.  Extensibility!!!!

	VOID(TileType.VOID, '~'),
	DIRT(TileType.DIRT, '#');

	TileType tileType;
	char mapTileChar;

	private MapTileType(TileType tileType, char c) {
		this.tileType = tileType;
		mapTileChar = c;
	}

}

package GameEngine.WorldEngine.Map;

import GameEngine.WorldEngine.World.TileType;

/**
 * This Class links a world tile to a map object eg a character/graphics object etc.
 * graphics objects have not been implemented yet...but this is here for future releases.
 * Created by Krystal on 2015-06-07.
 */
public class MapObject {
	/**
	 *
	 * @param t the tile type to link to a character.
	 * @return the linked Character.
	 *
	 */
	public static char getMapTileChar(TileType t) {
		for(MapCharType mct : MapCharType.values()){
			if(mct.tileType.equals(t)) {
				return mct.tileChar;
			}
		}
		return MapCharType.VOID.tileChar;
	}
}

package GameEngine.WorldEngine.Map;

import GameEngine.WorldEngine.World.TileType;


/**
 * @author Krystal Amaia
 *         <p>
 *         Links a TileType to a Mappable Object be it a character or graphics object
 *         </p>
 * @version 0.1
 */
public class MapObject {
	/**
	 * Static class that returns the character linked to a specific tileType.
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

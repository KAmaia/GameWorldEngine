package GameEngine.WorldEngine.MapGenerator;

import GameEngine.WorldEngine.Map.*;
import GameEngine.WorldEngine.World.*;


/**
 * @author Krystal Amaia
 *         <p>
 *          Generates an OverWorld Map.
 *         </p>
 * @version 0.1
 */
public class OverWorldMapGenerator {

	/**
	 * Maps a world.
	 *
	 * @param world
	 * 	   the world to map
	 *
	 * @return the map that is created.
	 */
	public CharMap generateOverWorldCharMap(World world) {
		CharMap charMap = new CharMap(world.getSIZE_X(), world.getSIZE_Y());

		for (int x = 0; x < world.getSIZE_X(); x++) {
			for (int y = 0; y < world.getSIZE_Y(); y++) {
				Tile t = world.getTile(x, y);
				charMap.setTile(x, y, MapObject.getMapTileChar(t.getType()));
			}

		}
		return charMap;
	}

}



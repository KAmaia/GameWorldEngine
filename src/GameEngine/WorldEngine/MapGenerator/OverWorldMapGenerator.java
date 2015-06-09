package GameEngine.WorldEngine.MapGenerator;

import GameEngine.WorldEngine.Map.MapObject;
import GameEngine.WorldEngine.Map.OverWorldCharMap;
import GameEngine.WorldEngine.World.Tile;
import GameEngine.WorldEngine.World.World;

/**
 * Created by Krystal on 2015-06-07.
 */
public class OverWorldMapGenerator {

	private OverWorldCharMap overWorldCharMap;

	public OverWorldCharMap generateOverWorldCharMap(World world) {
		overWorldCharMap = new OverWorldCharMap(world.getSIZE_X(), world.getSIZE_Y());

		for (int x = 0; x < world.getSIZE_X(); x++) {
			for (int y = 0; y < world.getSIZE_Y(); y++) {
				Tile t = world.getTile(x, y);
				overWorldCharMap.setTile(x, y, MapObject.getMapTileChar(t.getType()));
			}

		}
		return overWorldCharMap;
	}

}



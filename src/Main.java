import GameEngine.WorldEngine.Map.CharMap;
import GameEngine.WorldEngine.MapGenerator.OverWorldMapGenerator;
import GameEngine.WorldEngine.World.World;
import GameEngine.WorldEngine.WorldGenerator.WorldGenerator;

/**
 * Created by Krystal on 2015-06-05.
 */

public class Main {
	public static void main(String[] args) {
		int sizeX = 10;
		int sizeY = 100;
		World world = new WorldGenerator(sizeX, sizeY).generateWorld();
		CharMap OWCM = new OverWorldMapGenerator().generateOverWorldCharMap(world);
		for (int x = 0; x < sizeX; x++) {

			for (int y = 0; y < sizeY; y++) {
				System.out.print(OWCM.getMapTileChar(x, y));
			}
			System.out.print("\n");
		}

	}
}
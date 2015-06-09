package GameEngine.WorldEngine.Map;

import GameEngine.Utilities.BoundsChecker;

/**
 * Created by Krystal on 2015-06-07.
 */
public class OverWorldCharMap {
	private int sizeY;
	private int sizeX;

	private Character[][] overWorldCharMap;

	public OverWorldCharMap(int size_X, int size_Y) {
		sizeX = size_X;
		sizeY = size_Y;
		overWorldCharMap = new Character[size_X][size_Y];
	}

	public void setTile(int x, int y, char mapTileChar) {
		if(!BoundsChecker.checkBounds(x,y, overWorldCharMap)){
			overWorldCharMap[x][y] = mapTileChar;
		}
	}

	public char getMapTileChar(int x, int y){
		return overWorldCharMap[x][y];
	}
}

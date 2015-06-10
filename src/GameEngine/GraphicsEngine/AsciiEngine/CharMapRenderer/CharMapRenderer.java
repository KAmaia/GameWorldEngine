package GameEngine.GraphicsEngine.AsciiEngine.CharMapRenderer;

import GameEngine.WorldEngine.Map.*;

/**
 * Created by Krystal on 2015-06-08.
 */
public class CharMapRenderer {

	private final int SIZE_Y;
	private final int SIZE_X;

	public CharMapRenderer(int sizeX, int sizeY) {
		this.SIZE_X = sizeX;
		this.SIZE_Y = sizeY;
	}

	public CharMap render(CharMap cm) {
		CharMap renderedMap = new CharMap(SIZE_X, SIZE_Y);
		if (cm.getSizeX() > SIZE_X) {
			if (cm.getSizeY() <= SIZE_Y) {
				//fuck logic
			}
			else if (cm.getSizeY() > SIZE_Y) {
				//fuck more logic
			}
		}
		else if (cm.getSizeX() <= SIZE_X) {
			if (cm.getSizeY() <= SIZE_Y) {
				//more logic that I don't care to implement at this point
			}
			else if (cm.getSizeY() > SIZE_Y) {
				//and some more!  fuck!
			}
		}


		return renderedMap;
	}
}

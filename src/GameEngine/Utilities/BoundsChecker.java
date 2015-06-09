package GameEngine.Utilities;

/**
 * Created by Krystal on 2015-06-06.
 */
public class BoundsChecker {
	public static <O extends Object> boolean checkBounds(int x, int y, O[][] objArray) {
		return !(x > -1 && y > -1 && x < objArray.length && y < objArray[x].length);
	}
}

package GameEngine.Utilities;

/**
 * @author Krystal Amaia
 *         <p>
 *         Ensures that a specific address is not out of bounds of an array.
 *         </p>
 * @version 0.1
 */
public class BoundsChecker {
	/**
	 * Checks a 2d array.
	 *
	 * @param x
	 * 	   X address to check.
	 * @param y
	 * 	   Y address to check.
	 * @param objArray
	 * 	   the array to check bounds of.
	 * @param <O>
	 *
	 * @return true if address is out of bounds.
	 */
	public static <O> boolean checkBounds(int x, int y, O[][] objArray) {
		return !(x > -1 && y > -1 && x < objArray.length && y < objArray[x].length);
	}

	public static <O> boolean checkBounds(Coordinate position, O[][] objArray) {
		return !(position.getX() > -1 && position.getY() > -1 && position.getX() < objArray.length && position
			   .getY() < objArray[position.getX()].length);
	}
}

package GameEngine.Utilities;

/**
 * @author Krystal Amaia
 */
public class Coordinate {
	private int Y;
	private int X;

	public Coordinate(int x, int y) {
		X = x;
		Y = y;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	@Override
	public String toString() {
		return "(" + X + "," + Y + ")";
	}
}

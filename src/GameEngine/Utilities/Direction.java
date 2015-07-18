package GameEngine.Utilities;

/**
 * @author Krystal Amaia
 */
public enum Direction {
	NORTHWEST(0),
	NORTH(1),
	NORTHEAST(2),
	EAST(3),
	SOUTHEAST(4),
	SOUTH(5),
	SOUTHWEST(6),
	WEST(7),

	NullDirection(1000);

	private int index;

	private Direction(int index) {
		this.index = index;
	}
}

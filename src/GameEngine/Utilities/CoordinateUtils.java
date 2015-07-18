package GameEngine.Utilities;

/**
 * @author Krystal Amaia
 */
public class CoordinateUtils {
	public static Coordinate normalizedCoordinate(Coordinate start, Coordinate finish) {

		return new Coordinate(0, 0);
	}

	public static boolean areCoordsTheSame(Coordinate a, Coordinate b) {
		return false;
	}

	public static Direction directionToTarget(Coordinate start, Coordinate finish) {
		boolean north = start.getX() - finish.getX() > 0;
		boolean east = start.getY() - finish.getY() < 0;
		boolean south = start.getX() - finish.getX() < 0;
		boolean west = start.getY() - finish.getY() > 0;
		Direction d;
		if (north) {
			if (west) {
				d = Direction.NORTHWEST;
			}
			else if (east) {
				d = Direction.NORTHEAST;
			}
			else {
				d = Direction.NORTH;
			}
		}
		else if (south) {
			if (west) {
				d = Direction.SOUTHWEST;
			}
			else if (east) {
				d = Direction.SOUTHEAST;
			}
			else {
				d = Direction.SOUTH;
			}
		}
		else if (west) {
			d = Direction.WEST;
		}
		else if (east) {
			d = Direction.EAST;
		}
		else {
			d = Direction.NullDirection;
		}
		return d;
	}
}

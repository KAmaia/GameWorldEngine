package GameEngine.Utilities;

/**
 * @author Krystal Amaia
 */
public class CoordinateUtils {
	public static Coordinate normalizedCoordinate(Coordinate start, Coordinate finish) {

		if (start.getX() < finish.getX() && start.getY() < finish.getY()) {
			return new Coordinate(start.getX() + 1, start.getY() + 1);
		}
		else if (start.getX() < finish.getX() && start.getY() == finish.getY()) {
			return new Coordinate(start.getX() + 1, start.getY());
		}

		else if (start.getX() < finish.getX() && start.getY() > finish.getY()) {
			return new Coordinate(start.getX() + 1, start.getY() - 1);
		}
		else if (start.getX() == finish.getX() && start.getY() < finish.getY()) {
			return new Coordinate(start.getX(), start.getY() + 1);
		}

		else if (start.getX() == finish.getX() && start.getY() > finish.getY()) {
			return new Coordinate(start.getX(), start.getY() - 1);

		}
		else if (start.getX() > finish.getX() && start.getY() < finish.getY()) {
			return new Coordinate(start.getX() - 1, start.getY() + 1);
		}
		else if (start.getX() > finish.getX() && start.getY() == finish.getY()) {
			return new Coordinate(start.getX() - 1, start.getY());
		}
		else if (start.getX() > finish.getX() && start.getY() > finish.getY()) {
			return new Coordinate(start.getX() - 1, start.getY() - 1);
		}
		else {
			return start;
		}
	}
}

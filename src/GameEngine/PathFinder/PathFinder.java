package GameEngine.PathFinder;

import GameEngine.Utilities.*;
import GameEngine.WorldEngine.World.*;

/**
 * @author Krystal Amaia
 */
public class PathFinder {
	Tile[][] World;

	public PathFinder(Tile[][] world) {
		World = world;
	}

	public Path createPath(Coordinate start, Coordinate finish) {
		System.out.println("**Pathfinder - createPath()");
		System.out.println("Creating path between: " + start.toString() + " & " + finish.toString());
		System.out.println("\t-Path Length = " + getPathLength(start, finish));

		Path path = new Path(start);
		Coordinate current = start;
		boolean b = true;
		while (b) {
			switch (CoordinateUtils.directionToTarget(current, finish)) {
				case NORTH:
					current = new Coordinate(current.getX() - 1, current.getY());
					path.addToPath(current);
					break;
				case SOUTH:

					current = new Coordinate(current.getX() + 1, current.getY());
					path.addToPath(current);
					break;
				case EAST:

					current = new Coordinate(current.getX(), current.getY() + 1);
					path.addToPath(current);
					break;
				case WEST:
					current = new Coordinate(current.getX(), current.getY() - 1);
					path.addToPath(current);
					break;
				case NORTHEAST:
					current = new Coordinate(current.getX() - 1, current.getY() + 1);
					path.addToPath(current);
					break;
				case NORTHWEST:
					current = new Coordinate(current.getX() - 1, current.getY() - 1);
					path.addToPath(current);
					break;
				case SOUTHEAST:
					current = new Coordinate(current.getX() + 1, current.getY() + 1);
					path.addToPath(current);
					break;
				case SOUTHWEST:
					current = new Coordinate(current.getX() + 1, current.getY() - 1);
					path.addToPath(current);
					break;
				default:
					b = false;
			}

		}

		verifyPath(path);
		return path;
	}

	private void verifyPath(Path path) {
		path.Print();
	}

	private int getPathLength(Coordinate start, Coordinate finish) {

		int lengthX = Math.abs(start.getX() - finish.getX());
		int lengthY = Math.abs(start.getY() - finish.getY());
		float length = (float) Math.abs(Math.sqrt(lengthX * lengthX + lengthY * lengthY));
		int pathLength = 0;
		for (float d = length; d - .1d > length - 1.0d; d--) {
			pathLength = (int) d;
		}
		return pathLength;
	}

	private Coordinate pickCoord(Coordinate start, Coordinate finish) {
		//pick random coordinate between start & finish.

		return CoordinateUtils.normalizedCoordinate(start, finish);
	}

}

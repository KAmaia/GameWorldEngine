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

	public void createPath(Coordinate start, Coordinate finish) {
		System.out.println("**Pathfinder - createPath()");
		System.out.println("Creating path between: " + start.toString() + " & " + finish.toString());
		System.out.println("\t-Path Length = " + getPathLength(start, finish));

		Coordinate[] path;

		int length = getPathLength(start, finish);
		Coordinate current = start;

		System.out.println("\t\t--Pre-loop current: " + current.toString());
		System.out.println("\t\t--Pre-loop length: " + length);
		System.out.println("\t\t--pre-loop finish: " + finish.toString());

		path = new Coordinate[length];
		path[0] = start;
		int i = 0;
		while (!current.equals(finish) && i < length) {
			System.out.println("\t-Picking Path");
			System.out.println("\t\t--Current Coordinate: " + current.toString());
			Coordinate tmp = current;
			current = pickCoord(tmp, finish);
			path[i] = current;
			i++;
		}
		verifyPath(path);
	}

	private void verifyPath(Coordinate[] path) {
		for (Coordinate c : path) {
			System.out.println(c.toString());
		}
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

		return CoordinateUtils.normalizedCoordinate(start, finish);
	}

}

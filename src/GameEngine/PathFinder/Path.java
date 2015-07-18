package GameEngine.PathFinder;

import GameEngine.Utilities.*;

import java.util.*;

/**
 * @author Krystal Amaia
 */
public class Path {
	private ArrayList<Coordinate> path;

	public Path(Coordinate start) {
		path = new ArrayList<Coordinate>();
		path.add(start);

	}

	public void addToPath(Coordinate c) {
		path.add(c);
	}


	public void Print() {
		for (Coordinate c : path) {
			System.out.println(c.toString());
		}

	}

	public Coordinate[] toArray() {
		return path.toArray(new Coordinate[path.size()]);

	}

	public boolean isConnected() {
		for (Coordinate c : path) {
			//check the next Coordinate
			//if ! x +/- = 1
			//if ! y+/- = 1
		}
		return false;
	}

	public Coordinate toArray(int i) {
		return path.get(i - 1);
	}

	public int size() {
		return path.size();
	}
}


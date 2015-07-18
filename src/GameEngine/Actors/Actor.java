package GameEngine.Actors;

import GameEngine.PathFinder.*;
import GameEngine.Utilities.*;
import GameEngine.WorldEngine.World.*;

import java.util.*;

/**
 * @author Krystal Amaia
 */
public class Actor {
	float sight;
	int index = 1;
	private boolean    alive;
	/*
		physicalSatus<health, hunger>
		mentalStatus<curious, hungry>
	 */
	private Coordinate position;
	private ArrayList<Float> phyiscalStatus = new ArrayList<Float>();
	private ArrayList<Float> mentalStatus   = new ArrayList<Float>();
	private float          speed;
	private Coordinate[][] knownWorld;
	private boolean        selected;
	private PathFinder     pathFinder;
	private boolean        isMoving;
	private boolean        idle;
	private Path           currentPath;

	public Actor(World world) {
		knownWorld = new Coordinate[world.getSIZE_X()][world.getSIZE_Y()];
		pathFinder = new PathFinder(world.getTiles());
		int positionX = RandomGenerators.nextIntInRange(0, world.getSIZE_X());
		int positionY = RandomGenerators.nextIntInRange(0, world.getSIZE_Y());


		position = new Coordinate(positionX, positionY);
		currentPath = pathFinder.createPath(position,
		                                    new Coordinate(RandomGenerators.nextIntInRange(0, world.getSIZE_X()),
		                                                   RandomGenerators.nextIntInRange(0, world.getSIZE_Y())));

		sight = 1.0f;
		alive = true;
	}


	public void act() {
		if (idle) {
			idleAction();
		}
		else {
			moveAlongPath(currentPath);
		}
	}

	protected void idleAction() {

	}


	private void move(Coordinate target) {
		position = target;
	}

	private void explore() {

	}

	private void moveAlongPath(Path path) {

		if (!(index == path.size())) {
			isMoving = true;
			position = path.toArray(index);
			System.out.println("Moving to: " + position.toString());
			System.out.println(isMoving);
			index++;
		}
		else {
			isMoving = false;
		}

	}

	public Coordinate getPosition() {
		return position;
	}
}

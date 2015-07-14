package GameEngine.Actors;

import GameEngine.PathFinder.*;
import GameEngine.Utilities.*;
import GameEngine.WorldEngine.World.*;

import java.util.*;

/**
 * @author Krystal Amaia
 */
public abstract class Actor {
	float sight;
	private boolean    alive;
	private Coordinate position;
	/*
		physicalSatus<health, hunger>
		mentalStatus<curious, hungry>
	 */
	private ArrayList<Float> phyiscalStatus = new ArrayList<Float>();
	private ArrayList<Float> mentalStatus   = new ArrayList<Float>();
	private float speed;

	private Tile[][]   knownWorld;
	private boolean    selected;
	private PathFinder pathFinder;

	public Actor(World world) {
		knownWorld = new Tile[world.getSIZE_X()][world.getSIZE_Y()];
		pathFinder = new PathFinder(world.getTiles());
		int positionX = RandomGenerators.nextIntInRange(world.getSIZE_X(), 0);
		int positionY = RandomGenerators.nextIntInRange(world.getSIZE_Y(), 0);


		position = new Coordinate(positionX, positionY);
		sight = 1.0f;
		alive = true;
	}

	private void iniitateStatus() {
		phyiscalStatus.add(5.0f);
		phyiscalStatus.add(0.5f);

		mentalStatus.add(0.5f);
		mentalStatus.add(0.5f);

	}

	public void act() {
		//make decisions as far as what to do.

	}


	public Coordinate getPosition() {
		return position;
	}
}

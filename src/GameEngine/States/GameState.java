package GameEngine.States;

import GameEngine.Actors.*;
import GameEngine.WorldEngine.World.*;
import GameEngine.WorldEngine.WorldGenerator.*;

import java.util.*;

/**
 * @author Krystal Amaia
 */
public class GameState implements State {
	private World            world;
	private ArrayList<Actor> actors;

	public GameState() {

		world = new WorldGenerator().generateWorld();
		actors = new ArrayList<Actor>();
	}

	@Override
	public void Update() {
		//do stuff
	}
}

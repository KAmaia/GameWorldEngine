package GameEngine.WorldEngine.World;

/**
 * @author Krystal Amaia
 *         <p>
 *         The basic unit of a world.
 *         </p>
 * @version 0.1
 */

public class Tile {

	private TileType type;

	Tile() {
		//CTOR
	}


	public boolean isPassable() {
		/*
		 * @Return passable
		 */
		return type.passable;
	}


	/**
	 * @return the type
	 */
	public TileType getType() {
		return type;
	}

	/**
	 * @param type
	 * 	   the type to set
	 */
	public void setType(TileType type) {
		this.type = type;
	}

	public double getSpeedMod() {
		/**
		 *
		 * @return the speedMod.  This will tell units what percentage of their maximum speed they can move across
		 * this tile.
		 */
		return type.speedmod;
	}


}
//###End Tile###
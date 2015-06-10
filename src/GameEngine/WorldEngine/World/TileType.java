package GameEngine.WorldEngine.World;

/**
 * @author Krystal Amaia
 *         <p>
 *         An enumeration of tile types.  Used to quickly set tile types.
 *         </p>
 * @version 0.1
 */

public enum TileType {

	VOID(false, 0.0, "VOID"),
	DIRT(true, 1.0, "DIRT");

	//same member variables as our parent class.

	final boolean passable;
	final double  speedmod;
	final String  sType;

	/**
	 * Enumerator constructor.  Never used Externally.
	 *
	 * @param passable
	 * 	   is the tile passable.
	 * @param speedMod
	 * 	   the tiles speed mod.
	 * @param sType
	 * 	   The tile type expressed as a string.
	 */

	private TileType(boolean passable, double speedMod, String sType) {
		//CTOR
		this.passable = passable;
		this.speedmod = speedMod;
		this.sType = sType;
	}


}

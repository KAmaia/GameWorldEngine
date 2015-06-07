package GameWorldGenerationEngine.World;

public enum TileType {
	//Here we're enumerating out our tile types.  This will make it easier to add tiles in the future.
			/*
			 * Params:
			 * char tileChar: Debug purposes, just to display the map in console.
			 * boolean passable: Whether or not the tile is passable.
			 * double speedMod: Any units moving through this tile multiply their speed by this.
			 * String sType: The String version of the tile type
			 * Unit[5] unitsInMe: Any units that are in the tile.
			 * String sprite: The image file to load for this tile.
			 */
	VOID( false, 0.0, "VOID"),
	DIRT( true, 1.0, "Dirt");

	//same member variables as our parent class.

	boolean passable;
	double  speedmod;
	String  sType;


	private TileType(boolean passable, double speedMod, String sType) {
		//CTOR
		this.passable = passable;
		this.speedmod = speedMod;
		this.sType = sType;
	}


};

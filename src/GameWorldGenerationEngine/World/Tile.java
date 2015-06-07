package GameWorldGenerationEngine.World;

import java.util.Random;
/*Tile.Java
@author Robert

*/

public class Tile {
	
	//member variables
	private TileType type;
	private int numOfTypes = TileType.values().length;
	private static Random random = new Random();
	
	Tile(){
		//CTOR
	}
	
	
		

	public TileType getTypeByIndex(int i){
		//The Cleverest Function that could.   When the Tile() constructor
		// calls this from createTile(TileType.getTypeByIndex)
		//It simply returns the values we need.
		//
		// Genius!
		//
		// To Think, ten minutes ago I was about to give up on the enum type.
			return TileType.values()[i];
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
	 * @param type the type to set
	 */
	public void setType(TileType type) {
		this.type = type;
	}

	public double getSpeedMod() {
		/**
		 * @return the speedMod.  This will tell units what percentage of their maximum speed they can move across this soil.
		 */
		return type.speedmod;
	}


	
	
	public Tile setupTile(){
		//This function was made much neater by the use of an enum.   
		//check out the cleverest little function that could. 
		//This function basically just finalizes creating a tile, by grabbing the appropriate 
		//information from TileType and returning a new tile.  
		//thanks to everyone in ##Java on Freenode for their help.
		TileType typeSelector = getTypeByIndex(random.nextInt
													(TileType.values().length - 2) + 2);
		//here we'll create a tile, and then initialize all of it's variables based on our enum.  *PRETTY CLEVER!*
		this.setType((typeSelector));
		return this;
	}
	

	public Tile setupTile(TileType type){
		//This function over loads setupTile so that it can be used to modify a tile later on.  
		//here we'll create a tile, and then initialize all of it's variables based on our enum.  *PRETTY CLEVER!*
		this.setType((type));
		return this;
	}
	public void printTileInfo(){
		//Later to be deprecated with Tile::printTileToolTip
		System.out.println(this.getType() + "\nPassable: " + this.isPassable() + "\nSpeedMod: " + this.getSpeedMod());
	}
}
//###End Tile###
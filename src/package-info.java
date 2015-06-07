/**
 * Created by Krystal on 2015-06-06.
 *
 * Generates a World based on specifications.
 * Very much a round about builder, but I am working on it.
 *
 * This class generates a World, at this release it is limited to a fill of DIRT.  VOID Cells are used as well,
 * but hopefully more so after a few builds of this library.
 *
 * Given the need for thread safety, all methods are private so that they may only be called within the class.
 * The goal is to be able to return a fully formed World, or a fully formed World map (Character Array).
 *
 * Some of this code is speghetti at the moment.  However I am working on that as well.  I am basically re-writing an
 * old java World generator that I had written.  I never used it for much, but I find that it was a good learning
 * experience at the time, and my goal is to further my learning here.
 *
 * Okay some notes on protocol in order to keep things constant, I am going to try to lay things out in terms of X and Y
 * rather than H and W.  I find that it is easier to keep track of things this way.
 *
 *        Diagram 1:
 *                     |                     | X0      Therefore a position of 0x, 0y would indicate the upper left hand
 *                  X  |                     | X1      corner of the screen, and a position of 19x, 13y would indicate
 *                     |                     | X2      the lower right hand corner of the screen.
 *                  A  |                     | X3
 *                  X  |                     | X4      The preferred method of iteration is the X loop first, to fill it
 *                  I  |                     | X5      line by line, column by column.
 *                  S  |                     | X6
 *                     |                     | X8      This will generate a 2d Tile Array, which can then be used to
 *  ___________________|_____________________| X9      create maps and perform simulation on the World level.  Each tile
 *                Y  A X I S                 | X10     is defined by a TileType, which allows for some interesting
 *                     |                     | X11     levels of abstraction.
 *                     |                     | X12
 *                     |                     | X13     The World Generator Library will eventually have a system of
 *                     |                     | X14     modifying existing worlds, and performing simulations on them,
 *                     |                     | X15     but for this release, that code will mainly exist in the World
 *                     |                     | X16     generator class.
 *                     |                     | X17
 * ____________________|_____________________| X19
 * Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y
 * 0  1  2  3  4  5  5  6  7  8  9  1  1  1  1
 *                                  0  1  2  3


 *
 *
 *
 *
 *
 *   Spare space needed here for this method.
 *   /**
 * For the Graphically Challenged, this will print the World to console.
 * Really Kinda outdated now that we have a 2D map going.  But, still here for future debugging/other
 * purposes.

public void print(){
	   for(int x=0;x<SIZE_X;x++){
	   //create a string to hold each line of the map.
	   String mapString="";
	   for(int y=0;y<SIZE_Y;y++){
	   //add each tilechar to the map.
	   mapString+=this.gWorld[x][y].getTileChar();
	   }
	   //print each line.  Lather, Rinse, Repeat until done.
	   System.out.println(mapString);
	   }
	   }

 */



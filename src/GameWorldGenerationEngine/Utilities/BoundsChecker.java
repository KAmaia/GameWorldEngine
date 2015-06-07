package GameWorldGenerationEngine.Utilities;

/**
 * Created by Krystal on 2015-06-06.
 */
public  class BoundsChecker {
	public static boolean checkBounds(int x, int y, Object[][] objArray){
		boolean outOfBounds = false;
		if(x < 0 || y < 0 ){
			outOfBounds =  true;
		}
		else if(x >= objArray.length || y >= objArray[x].length ){
			outOfBounds = true;
		}
		else{
			outOfBounds = false;
		}
		return outOfBounds;
	}

}

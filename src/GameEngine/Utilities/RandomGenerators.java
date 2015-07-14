package GameEngine.Utilities;


import java.util.*;

/**
 * @author Krystal Amaia
 *         <p>
 *         A bunch of static random generators.
 *         </p>
 * @version 0.1
 */
public class RandomGenerators {
	private static final Random rand = new Random();

	/**
	 * @param min
	 * 	   the lower limit of the range
	 * @param max
	 * 	   the upper limit of the range
	 *
	 * @return a random value between min and max
	 */
	public static int nextIntInRange(int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}

	/**
	 * @param min
	 * 	   the lower limit of the range
	 * @param max
	 * 	   the upper limit of the range
	 *
	 * @return a random value between min and max
	 */
	public static float nextFloatInRange(float max, float min) {
		return rand.nextFloat() * ((max - min) + min);
	}


}

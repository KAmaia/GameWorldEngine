package GameEngine.InventoryEngine.Inventory;

import GameEngine.InventoryEngine.Items.*;

import java.util.*;

/**
 * @author Krystal Amaia
 */
public class Inventory {
	private static final ArrayList<Item> ITEMS = new ArrayList<Item>();
	private UUID ID;

	public boolean hasItem(Item item) {
		return ITEMS.contains(item);
	}

	public UUID getID() {
		return ID;
	}

	public void addItem(Item item) {
		ITEMS.add(item);
	}
}

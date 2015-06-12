package GameEngine.InventoryEngine;

import GameEngine.InventoryEngine.Inventory.*;
import GameEngine.InventoryEngine.Items.*;

import java.util.*;

/**
 * @author Krystal Amaia
 */
public class InventoryEngine {
	InventoryManager inventoryManager;

	public InventoryEngine() {
		inventoryManager = new InventoryManager();
	}

	public boolean hasInventoryManager() {
		return !inventoryManager.equals(null);
	}


	private class InventoryManager {

		private final HashMap<UUID, ArrayList<Inventory>> INVENTORIES = new HashMap<UUID, ArrayList<Inventory>>();

		private void addItemToInventory(UUID actorID, UUID inventoryId, Item item) {
			if (actorOwnsInventory(actorID, inventoryId)) {
				for (Inventory I : INVENTORIES.get(actorID)) {
					if (item.isUnique()) {
						if (!I.hasItem(item)) {
							I.addItem(item);
						}
					}
					else {
						I.addItem(item);
					}
				}
			}
		}

		public void addItemsToInventory(UUID actorId, UUID inventoryId, Item[] items) {
			for (Item I : items) {
				addItemToInventory(actorId, inventoryId, I);
			}
		}

		private boolean actorOwnsInventory(UUID actorID, UUID inventoryId) {
			if (INVENTORIES.containsKey(actorID)) {
				for (Inventory I : INVENTORIES.get(actorID)) {
					if (I.getID().equals(inventoryId)) {
						return true;
					}
				}
			}

			return false;
		}

	}
}

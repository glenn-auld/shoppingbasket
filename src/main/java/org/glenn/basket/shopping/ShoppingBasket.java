package org.glenn.basket.shopping;

import java.util.ArrayList;
import java.util.List;

import org.glenn.basket.items.Item;

public class ShoppingBasket implements CheckOut{

	List<Item> items;
	
	public ShoppingBasket() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public int getTotalItems() {
		return items.size();
	}
	
	@Override
	public double calculateTotalCost() {
		float totalCost = 0;
		
		for (Item item : this.items) {
			totalCost += item.getPrice();
		}
		return totalCost;
	}

}

package org.glenn.basket.shopping;



import static org.junit.Assert.*;

import org.glenn.basket.items.Apple;
import org.glenn.basket.items.Banana;
import org.glenn.basket.items.Orange;
import org.junit.Test;

public class ShoppingBasketTest {

	@Test
	public void EmptyBasketTotalShouldBeZero() {
		ShoppingBasket basket = new ShoppingBasket();
		assertEquals(new Double(basket.calculateTotalCost()),new Double(0));
	}
	
	@Test
	public void BasketWithThreeBananasShouldBeThreeTimesUnitBananaCost() {
		final double unitBananaCost = 1.24;
		ShoppingBasket basket = new ShoppingBasket();
		Banana banana1 = new Banana();
		banana1.setPrice(unitBananaCost);
		Banana banana2 = new Banana();
		banana2.setPrice(unitBananaCost);
		Banana banana3 = new Banana();
		banana3.setPrice(unitBananaCost);
		basket.addItem(banana1);
		basket.addItem(banana2);
		basket.addItem(banana3);
		
		assertEquals(basket.getTotalItems(),3);
		assertEquals(new Double(basket.calculateTotalCost()),new Double(3.0*unitBananaCost),0.01);
	}

	@Test
	public void BasketWithDifferentItemsShouldBeTotalOfEachItem() {
		final double unitBananaCost = 1.24;
		final double unitOrangeCost = 0.5;
		final double unitAppleCost = 0.85;		
		
		ShoppingBasket basket = new ShoppingBasket();
		Banana banana = new Banana();
		banana.setPrice(unitBananaCost);
		Orange orange = new Orange();
		orange.setPrice(unitOrangeCost);
		Apple apple = new Apple();
		apple.setPrice(unitAppleCost);
		basket.addItem(banana);
		basket.addItem(orange);
		basket.addItem(apple);
		
		assertEquals(basket.getTotalItems(),3);
		assertEquals(new Double(basket.calculateTotalCost()),new Double(unitBananaCost + unitOrangeCost + unitAppleCost),0.01);
	}

}

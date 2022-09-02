/**
 * 
 * @author mokel
 * @param <T>
 *
 */
public class TestClass {

	public static void main(String[] args) {
		
		/**
		 * Creating a new ShoppingCart called cart with 20 items
		 */
		ShoppingCart cart = new ShoppingCart(20);
		
		/**
		 * Testing the isEmpty method and it should return true
		 */
		System.out.println("The array is empty: " + cart.isEmpty());
		
		/**
		 * Using the add method to add items into bag1
		 */
		cart.add(new Item("Milk", 3));
		cart.add(new Item("Eggs", 5));
		cart.add(new Item("Cheese", 2));
		cart.add(new Item("Chips", 4));
		cart.add(new Item("Water", 15));
		cart.add(new Item("Chicken", 12));
		cart.add(new Item("Beef", 13));
		cart.add(new Item("Bread", 6));
		cart.add(new Item("Brownie Mix", 10));
		cart.add(new Item("Sprite", 6));
		cart.add(new Item("Coco Cola", 6));
		cart.add(new Item("Bread", 6));
		cart.add(new Item("Frozen Chicken Nuggets", 15));
		cart.add(new Item("Sour Cream", 5));
		cart.add(new Item("Queso", 6));
		cart.add(new Item("Salsa", 5));
		
		/**
		 * Testing the isEmpty method and it should return false
		 */
		System.out.println("The array is empty: " + cart.isEmpty());
		
		/**
		 * Testing the getCurrentSize method and toArray method
		 */
		System.out.println("The array has " + cart.getCurrentSize() + " items");
		System.out.println("The array contains " + cart.toArray());
		/**for (int index = 0; index < cart.getCurrentSize(); index++) {
			System.out.println(cart[index] + " ");
		}*/
		
		/**
		 * Testing the getFrequencyOf method
		 */
		System.out.println("The frequency of bread is: " + cart.getFrequencyOf(new Item ("Bread", 6)));
		
		/**
		 * Removing two random items
		 */
		cart.remove();
		cart.remove();
		
		/**
		 * Removing three specific random items
		 */
		cart.remove(new Item("Salsa", 5));
		cart.remove(new Item("Coco Cola", 6));
		cart.remove(new Item("Sour Cream", 5));
			
		/**
		 * Testing the getCurrentSize method and toArray method
		 */
		System.out.println("The array has " + cart.getCurrentSize() + " units");
		System.out.println("The array contains " + cart.toArray());
		
		/**
		 * Testing the clear method that clears the array of all items and getCurrentSize method 
		 */
		cart.clear();
		System.out.println("The array has " + cart.getCurrentSize() + " items");
	}//end main

}//end class

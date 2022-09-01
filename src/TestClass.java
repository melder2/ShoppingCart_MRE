/**
 * 
 * @author mokel
 * @param <T>
 *
 */
public class TestClass {

	public static void main(String[] args) {
		/**
		 * Creating a bag called bag1
		 */
		BagInterface<String> bag1 = new ResizableArrayBag<>();
		
		/**
		 * Using the add method to add items into bag1
		 */
		bag1.add("A");
		bag1.add("B");
		bag1.add("C");
		bag1.add("D");
		bag1.add("E");
		bag1.add("F");
		bag1.add("G");
		bag1.add("H");
		bag1.add("I");
		bag1.add("J");
		bag1.add("K");
		bag1.add("L");
		bag1.add("M");
		bag1.add("M");
		bag1.add("N");
		bag1.add("O");
		bag1.add("P");
		bag1.add("Q");
		bag1.add("R");
		
		/**
		 * Using the getCurrentSize method
		 */
		System.out.println("The current size is: " + bag1.getCurrentSize());
		
		/**
		 * Using the isEmpty method
		 */
		System.out.println("The list is empty: " + bag1.isEmpty());
		
		/**
		 * Using the remove method twice that removes two random items in the bag1
		 */
		bag1.remove();
		bag1.remove();
		
		/**
		 * Using the getCurrentSize method
		 */
		System.out.println("The current size after removing 2 random items: " + bag1.getCurrentSize());
		
		/**
		 * Using the remove method twice to remove two specific items from bag1
		 */
		bag1.remove("P");
		bag1.remove("O");
		
		/**
		 * Using the getCurrentSize method
		 */
		System.out.println("The current size after removing 2 specific items: " + bag1.getCurrentSize());
		
		/**
		 * Using the getFrequencyOf method to count how many times M is present in bag1
		 */
		System.out.println("The frequency of M is: " + bag1.getFrequencyOf("M"));
		
		/**
		 * Using the contains method to see if bag1 has A or W in bag1
		 */
		System.out.println("Bag1 contains A: " + bag1.contains("A"));
		System.out.println("Bag1 contains W: " + bag1.contains("W"));
		System.out.println(bag1.toString());
	}//end main

}//end class

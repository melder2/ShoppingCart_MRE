
public class ShoppingCart {
	private ResizableArrayBag<Item> cart;
	
	public ShoppingCart() {
		cart = new ResizableArrayBag<Item>();
	}//end empty argument constructor
	public ShoppingCart(int size) {
		cart = new ResizableArrayBag<Item>(size);
	}//end preferred constructor
	public ShoppingCart(Item[] contents) {
		cart = new ResizableArrayBag<Item>()[contents];
	}//end preferred constructor
	public int getCurrentSize() {
		return cart.getCurrentSize();
	}//end getCurrentSize method
	public boolean isEmpty() {
		return cart.isEmpty();
	}//end isEmpty method
	public boolean add(Item anItem) {
		return cart.add(anItem);
	}//end add method
	public Item remove() {
		return cart.remove();
	}//end remove method
	public boolean remove(Item anItem) {
		return cart.remove(anItem);
	}//end remove(Item anItem method
	public int getFrequencyOf(Item anItem) {
		return cart.getFrequencyOf(anItem);
	}//end getFrequencyOf method
	public boolean contains(Item anItem) {
		return cart.contains(anItem);
	}//end contains method
	public Object[] toArray() {
		return cart.toArray();
	}//end toArray method
	public void clear() {
		cart.clear();
	}//end clear method

}//end ShoppingCart class

/**
 * 
 * @author mokel
 *
 * @param <T>
 */
public interface BagInterface<T> {
	public int getCurrentSize();
	public boolean isEmpty();
	public boolean add(T newItem);
	public T remove();
	public boolean remove(T anItem);
	public int getFrequencyOf(T anItem);
	public boolean contains(T anItem);
	public T[] toArray();
	public void clear();
	public double currentPrice(T[] toArray);
}//end interface

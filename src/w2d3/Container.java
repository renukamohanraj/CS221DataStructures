package w2d3;

public class Container<V> {
	private V value;
	
	public void put(V value) {
		this.value = value;
	}
	
	public V get() {
		return value;
	}
}

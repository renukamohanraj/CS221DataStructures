package w2d4;

public class PriorityQueue<T extends Comparable<T>> {
	// array in sorted order, from max at 0 to min at size-1
	private int maxSize;
	private T[] queArray;
	private int nItems;

	// -------------------------------------------------------------
	@SuppressWarnings("unchecked")
	public PriorityQueue(int s) // constructor
	{
		maxSize = s;
		queArray = (T[])new Comparable[maxSize];
		nItems = 0;
	}

	// -------------------------------------------------------------
	public void insert(T item) // insert item
	{
		int j;

		if (nItems == 0) // if no items,
			queArray[nItems++] = item; // insert at 0
		else // if items,
		{
			for (j = nItems - 1; j >= 0; j--) // start at end,
			{
				//if (item > queArray[j]) // if new item larger,
				int comparison = item.compareTo(queArray[j]);
				if (comparison < 0)
					queArray[j + 1] = queArray[j]; // shift upward
				else
					// if smaller,
					break; // done shifting
			} // end for
			queArray[j + 1] = item; // insert it
			nItems++;
		} // end else (nItems > 0)
	} // end insert()

	// -------------------------------------------------------------
	public T remove() // remove minimum item
	{
		return queArray[--nItems];
	}

	// -------------------------------------------------------------
	public T peekMin() // peek at minimum item
	{
		return queArray[nItems - 1];
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if queue is empty
	{
		return (nItems == 0);
	}

	// -------------------------------------------------------------
	public boolean isFull() // true if queue is full
	{
		return (nItems == maxSize);
	}
	// -------------------------------------------------------------
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		for (int i =0 ; i < nItems; i++) {
			sb.append(queArray[i]);
			sb.append(" ");
		}
		sb.append(" ]");
		return sb.toString();
	}

}

/** OUTLINE
    A class of bags whose entries are stored in a chain of linked nodes.
    The bag is never full.
    @author Frank M. Carrano, Timothy M. Henry
    @version 5.0
*/
public class LinkedBag<T> implements BagInterface<T>
{
	private Node firstNode;       // reference to first node
	private int numberOfEntries;

	public LinkedBag()
	{
		firstNode = null;
      numberOfEntries = 0;
	} // end default constructor

   // . . .

	private class Node
	{
	   private T    data; // Entry in bag
	   private Node next; // Link to next node
      
		private Node(T dataPortion)
		{
			this(dataPortion, null);
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;
		} // end constructor
	} // end Node
} // end LinkedBag


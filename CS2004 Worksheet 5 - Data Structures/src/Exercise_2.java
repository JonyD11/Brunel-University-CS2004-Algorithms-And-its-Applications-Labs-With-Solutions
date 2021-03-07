import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Exercise_2 {
	
	/*                                   |
	 *    ArrayList                      |    LinkedList
	 *                                   |
	 * 1) ArrayList internally uses a    |    LinkedList internally
	 *    dynamic array to store the     |    uses a doubly linked
	 *    elements.                      |    list to store the elements.
	 *                                   |
	 * 2) Manipulation with ArrayList    |    Manipulation with LinkedList
	 *    is slow because it internally  |    is faster than ArrayList
	 *    uses an array. If any element  |    because it uses a doubly
	 *    is removed from the array, all |    linked list, so no bit
	 *    the bits are shifted in        |    shifting is required in 
	 *    memory.                        |    memory.
	 *                                   |
	 * 3) An ArrayLit class can act as   |    LinkedList class can act as
	 *    a list only because it         |    a list and queue both because
	 *    implements List only.          |    it implements List and 
	 *                                   |    Deque interfaces.
	 *                                   |    
	 * 4) ArrayList is better for        |    LinkedList is better for 
	 *    storing and accessing data.    |    manipulating data.
	 *                                   |
	 *                                   |
	 * */
	
	public static void PrintCollection(Collection<Data> c)
	{
		for (Iterator<Data> iter = c.iterator(); iter.hasNext();)
		{
			Data x = (Data)iter.next();
			x.Print();
		}
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating ArrayList called array
		ArrayList<Data> array = new ArrayList<Data>();
		
		// Creating Objects
		Data member1 = new Data("Fred", 21);
		Data member2 = new Data("Jo", 43);
		Data member3 = new Data("Zoe", 37);
		
		// Adding objects to array
		array.add(member1);
		array.add(member2);
		array.add(member3);
		
		// Printing all the members
		PrintCollection(array);
		System.out.println();
		
		// Adding Harry aged 78 between Jo and Zoe
		Data member = new Data("Hary", 78);
		array.add(2, member);
		PrintCollection(array);
		
		
		
		
		
		// Creating LinkedList called array1
		
	}

}

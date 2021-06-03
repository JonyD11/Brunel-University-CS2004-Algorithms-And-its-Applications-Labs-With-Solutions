import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Exercise_4_Queues  {
	
	public static void PrintCollection(Collection<Data> c)
	{
		for (Iterator<Data> iter = c.iterator(); iter.hasNext();)
		{
			Data x = (Data)iter.next();
			x.Print();
		}
		System.out.println();
	}

	public static void main(String[] args) throws IllegalArgumentException {
		// TODO Auto-generated method stub

		// This creates a queue based on a cyclic array. The value of 10 is the maximum size of the queue.
		ArrayBlockingQueue<Data> q = new ArrayBlockingQueue<Data>(10);
		
		// Created Objects
		Data member1 = new Data("Fred", 21);
		Data member2 = new Data("Jo", 43);
		Data member3 = new Data("Zoe", 37);
		
		// Added objects to the Queue
		q.add(member1);
		q.add(member2);
		q.add(member3);
		
		// Printing the Data
		System.out.println("Printing the Data");
		PrintCollection(q);
		System.out.println("\nRemoving the element and making it empty");
		
		while(q.isEmpty() == false)
		{
			q.poll().Print(); // First in First Out (FIFO)
		}	
		System.out.println("\n\nThe size of a Queue");
		System.out.println(q.size());
		System.out.println();

		// After changing the limits in the for loop it will show the current value with current index number
		System.out.println("Returning the value by using add method");
		for(int i=10;i<20;++i)
		{
			q.add(new Data("Test:"+String.valueOf(i),i));
		}
		PrintCollection(q);
		
		System.out.println("\nReturning the value by using offer method");
		for(int i=10;i<20;++i)
		{
			q.offer(new Data("Test:"+String.valueOf(i),i));
		}
		PrintCollection(q);
		
		/*
		 * Difference between add method and offer method?
		 * The difference is that offer() will return false if it fails to insert 
		 * the element on a size restricted Queue, whereas add() will throw an 
		 * IllegalStateException.
		 * You should use offer() when failure to insert an element would be 
		 * normal, and add() when failure would be an exceptional occurrence 
		 * (that needs to be handled).
		 * */

	}

}

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class Exercise_3_Stacks {
	
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

		Stack<Data> stack = new Stack<Data>();
		
		// Created Objects
		Data member1 = new Data("Fred", 21);
		Data member2 = new Data("Jo", 43);
		Data member3 = new Data("Zoe", 37);
		
		// Added objects to the Stacks
		stack.push(member1);
		stack.push(member2);
		stack.push(member3);
		
		// Printed the list in Stack
		System.out.println("Printing the list in Stack");
		PrintCollection(stack);
		System.out.println();
		
		// Removing the elements from the Stack
		System.out.println("Removing the elements from the Stack");
		while(stack.isEmpty() == false)
		{
			stack.pop().Print(); // Last in First Out (LIFO)
		}
		System.out.println("\n\nPrinting the size of a Stack");
		System.out.println(stack.size());

	}

}

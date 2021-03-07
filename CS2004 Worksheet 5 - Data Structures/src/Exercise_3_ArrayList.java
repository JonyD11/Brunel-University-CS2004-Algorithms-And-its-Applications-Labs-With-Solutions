import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Exercise_3_ArrayList {
	
	public static void PrintCollection(Collection<Data> c)
	{
		for (Iterator<Data> iter = c.iterator(); iter.hasNext();)
		{
			Data x = (Data)iter.next();
			x.Print();
		}
		System.out.println();
	}

	@SuppressWarnings("unchecked") // The @SuppressWarnings annotation type allows Java programmers to disable compilation warnings for a certain part of a program (type, field, method, parameter, constructor, and local variable). Normally warnings are good. However in some cases they would be inappropriate and annoying.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Created an ArrayList called ArrayA containing the three items
		ArrayList<Data> ArrayA = new ArrayList<Data>();
		
		// Created Objects
		Data member1 = new Data("Fred", 21);
		Data member2 = new Data("Jo", 43);
		Data member3 = new Data("Zoe", 37);
		
		// Added Objects into the ArrayA
		ArrayA.add(member1);
		ArrayA.add(member2);
		ArrayA.add(member3);
		
		// Created an empty ArrayListcalled ArrayB
		ArrayList<Data> ArrayB = new ArrayList<Data>();
		
		// Printed the ArrayList of ArrayA
		PrintCollection(ArrayA); 
		System.out.println();
		
		// Putting the ArrayB equal to ArrayA
		ArrayB = ArrayA;
		PrintCollection(ArrayB); // After printing ArrayB I have noticed that ArrayB contains same items as ArrayA
		System.out.println();
		
		// Remover index 1 from ArrayA
		ArrayA.remove(1);
		PrintCollection(ArrayB); // After removing index 1 from ArrayA I have noticed that it changes the output of ArrayB as well

		// Created an ArrayList called ArrayC containing the three items
		ArrayList<Data> ArrayC = new ArrayList<Data>();
		
		// Added Objects into the ArrayC
		ArrayC.add(member1);
		ArrayC.add(member2);
		ArrayC.add(member3);
		
		// Created an ArrayList called ArrayD
		ArrayList<Data> ArrayD = new ArrayList<Data>();
		
		System.out.println();
		
		// Printed the ArrayList of ArrayC
		PrintCollection(ArrayC);
		System.out.println();
		
		// Making the clone of ArrayC and after that ArrayD equals to the clone of ArrayC
		ArrayD = (ArrayList<Data>)ArrayC.clone();
		
		// Removing the value of index 1 from ArrayC
		ArrayC.remove(1);
		
		// After removing the value I printed the ArrayC
		PrintCollection(ArrayC);
		System.out.println();	
		
		// After printing the ArrayC I have noticed that ArrayD is not going to be changed because ArrayD has made the clone of ArrayC and whatever is going to be happened in the ArrayC is not going to impact ArrayD
		PrintCollection(ArrayD);
		System.out.println();

	}

}

package Exercise_2;

import java.util.Random;

public class Linear_Summation_With_Recursion {
	
	/**
	 * @param is a special format comment used by javadoc 
	 * to generate documentation. it is used to denote a 
	 * description of the parameter (or parameters) a method can receive.
	 */
	
	/**
	 * <p>Linear Sum</p>
	 *  if n=1 then  //base case
	 *     return a[0];
	 *  else         //recursive case  
	 *     return linearSum(a,[n-1])+a[n-1];   
	 * @param a
	 * @param n
	 * @return
	 */
	public static int linearSum(int[] a, int n)
	{
		// n--array length
		// base case
		if (n==1) 
		{
			return a[0];
		}
		// recursive case 
		else if (n > 0)
		{
			return linearSum(a,n-1)+a[n-1];
		}
		else
		{
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// define an array
		int value = 1 + new Random().nextInt(100);
		int[] arr = new int[value];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = i + 1;  // +1 since we want 1-100 and not 0-99
		}
		int length = arr.length;
		
		long StartTime, EndTime, ElapsedTime;
		
		// Save the time before the algorithm run
		StartTime=System.currentTimeMillis();

		System.out.println(value + " = " +(linearSum(arr,length)));
		
		// Save the time after the run
		EndTime=System.currentTimeMillis();
		
		// Calculate the difference
		ElapsedTime= EndTime- StartTime;
		
		System.out.println("The algorithm took " + ElapsedTime + " milliseconds to run.");

	}

}

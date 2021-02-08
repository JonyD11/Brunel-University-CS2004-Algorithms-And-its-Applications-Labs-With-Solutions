package Exercise_1;

public class ArrayMaxExercise {

	public static double ArrayMax(double array[])
	{	
		double CurrentMax = array[0];
		
		for (int i = 1; i <= array.length - 1; i++)
		{
			if (array[i] > CurrentMax)
			{
				CurrentMax = array[i];
			}
		}
		return CurrentMax;
		
	}
	
	public static void main (String[] args) {
		long StartTime, EndTime, ElapsedTime;
		
		// Save the time before the algorithm run
		StartTime=System.currentTimeMillis();

		double[] array = {3,7,4,9,5,6,8,1,20,2};
		System.out.println(ArrayMax(array));
		
		// Save the time after the run
		EndTime=System.currentTimeMillis();

		// Calculate the difference
		ElapsedTime= EndTime- StartTime;
		
		System.out.println("The algorithm took " + ElapsedTime + " milliseconds to run.");
	}
}

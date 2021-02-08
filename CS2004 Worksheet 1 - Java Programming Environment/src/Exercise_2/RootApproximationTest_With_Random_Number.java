package Exercise_2;

import java.util.Random;

	public class RootApproximationTest_With_Random_Number
	{  
		public static void main(String[] args)
		{ 
			long StartTime, EndTime, ElapsedTime;
			
			// Save the time before the algorithm run
			StartTime = System.currentTimeMillis();
			
			// Generating random integers between 1 to 30
			double input = 1 + new Random().nextInt(30);
		
			double x = input;
			RootApproximator r = new RootApproximator(x);
			double y = r.getRoot();
			
			// Save the time after the run
			EndTime = System.currentTimeMillis();
			
			// Calculate the difference
			ElapsedTime= EndTime- StartTime;
	        
			System.out.println("The algorithm took " + ElapsedTime + " milliseconds to run.");
			
			System.out.println("square root of " + x + " = " + y);
				
			
		}
	}

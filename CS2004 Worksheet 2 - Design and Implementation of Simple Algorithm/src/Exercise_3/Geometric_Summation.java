package Exercise_3;

public class Geometric_Summation {
	
	// function to calculate sum of geometric series
	public static float sumOfGP(float a, float r, int n)
	{
		float sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum = sum + a;
			a = a * r;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1; // first term
		float r = (float)(1/2.0); // common ratio
		int n = 10; // number of terms
		
		long StartTime, EndTime, ElapsedTime;
		
		// Save the time before the algorithm run
		StartTime=System.currentTimeMillis();

		System.out.printf("%.5f",(sumOfGP(a, r, n)));
		
		// Save the time after the run
		EndTime=System.currentTimeMillis();

		// Calculate the difference
		ElapsedTime= EndTime- StartTime;

		System.out.println();
		System.out.println("The algorithm took " + ElapsedTime + " milliseconds to run.");
	}

}

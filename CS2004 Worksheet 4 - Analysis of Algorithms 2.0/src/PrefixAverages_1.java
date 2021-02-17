
public class PrefixAverages_1 {
	
	public static double[] PrefixAvg(double[] x) 
	{
		int n = x.length;
		double[] A = new double[n];
		
		for(int i = 0; i <= n-1; i++)
		{
			double s = x[0];
			
			for(int j = 1; j <= n-1; j++)
			{
				if(j <= i)
				{
					s = s + x[j];
				}
			}
			
			A[i] = s / (i+1);
		}
		
		return A;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] X = {7,3,-1,2,9,0,0.8,52,2.2,900};
		double[] A;
		int i, j, k;
		
		long StartTime, EndTime, ElapsedTime;
		
		// Save the time before the algorithm run
		StartTime=System.nanoTime();
		
		A = PrefixAvg(X);
		
		// Save the time after the run
		EndTime=System.nanoTime();
				
				
		System.out.println("Array Elements                                       Average");
		System.out.println("============================================================");
		
		for(i = 0; i < 10; i++)
		{
			for(j = 0; j <= i; j++)
			{
				System.out.print(X[j] + "  ");
			}
			for(k = 10; k > j; k--)
			{
				System.out.print("     ");
			}
			System.out.println("   : " + A[i]);
		}

		// Calculate the difference
		ElapsedTime= EndTime- StartTime;
		
		System.out.println();
		System.out.println("The algorithm took " + ElapsedTime + " nanoseconds to run.");
	}

}

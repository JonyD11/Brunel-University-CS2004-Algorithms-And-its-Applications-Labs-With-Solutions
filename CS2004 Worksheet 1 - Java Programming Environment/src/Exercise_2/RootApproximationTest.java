package Exercise_2;

import javax.swing.JOptionPane;

	/**
   		This program computes square roots of user-supplied inputs.
	 */
	public class RootApproximationTest
	{  
		public static void main(String[] args)
		{  
			boolean done = false;
			while (!done)
			{  
				String input = JOptionPane.showInputDialog("Enter a number, Cancel to quit");

				if (input == null)
				{
					done = true;
				}
				else
				{  
					long StartTime, EndTime, ElapsedTime;
					
					// Save the time before the algorithm run
					StartTime = System.currentTimeMillis();
					
					double x = Double.parseDouble(input);
					RootApproximator r = new RootApproximator(x);
					double y = r.getRoot();
					
					// Save the time after the run
					EndTime=System.currentTimeMillis();

					// Calculate the difference
					ElapsedTime= EndTime- StartTime;

					System.out.println("The algorithm took " + ElapsedTime + " milliseconds to run.");

            
					System.out.println("square root of " + x + " = " + y);
				}
			}
		}
	}


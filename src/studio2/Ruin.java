package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Start amount: $");
		int startAmount= in.nextInt(); 
		
		System.out.println("Win chance (percentage between 0 and 1): ");
		double winChance = in.nextDouble();
		
		System.out.println("Win limit: ");
		int winLimit = in.nextInt();
		double winLose = (double) Math.random();
		
		boolean winLost = (winLose < winChance);
		
		while (startAmount > 0 && startAmount < winLimit)
		{
			if (winLost)
			{
				startAmount++;
				System.out.println("You win!");
				System.out.println(startAmount);
				
			}
			else
			{
				startAmount--;
				System.out.println("You lost!");
				System.out.println(startAmount);
			}
			winLose = (double) Math.random();
			System.out.println(winLose);
			winLost = (winLose < winChance);
			System.out.println(winLost);
			
		}
		
		
		
		

	}

}

import java.util.Scanner;

public class FutureAge
{
	public static void main(String[] args) 
	{
		//Constants and variables
		int currAge;
		int calcAge;
		
		//object
		Scanner keyboard = new Scanner(System.in);

		//Input Phase
		System.out.print("Please enter your current age >> ");
		currAge = keyboard.nextInt();

		System.out.print("How many years in the future would you like to calculate? >> ");
		calcAge = keyboard.nextInt();

		//output phase
		displayAge(currAge, calcAge);
	}

		public static void displayAge(int curr, int calc)
	{
		System.out.println("If you are " + curr + " years old now, " + calc + " years from now you will be " + (curr + calc) + " years old");
	}

}
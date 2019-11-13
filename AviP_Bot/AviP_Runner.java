import java.util.Scanner;

/**
 * This is a simple runner for the AviP class.
 * @author Josh Koh, Sujal Nahata, Tariq Rahman
 * @version 11/12/2019
 */
public class AviP_Runner
{
	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		AviP maggie = new AviP();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}

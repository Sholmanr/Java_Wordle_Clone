package Wordle;
import java.util.Scanner; 

public class Wordle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer;
		
		Scanner scnr = new Scanner(System.in); 
		
		// Gets the users input and determines whether to start the game
		System.out.print("Do you want to play? y/n\n");
		answer = scnr.next();
		
		if(answer.compareTo("y") == 0)
		{
			play();
			scnr.close();
		}
		else if(answer.compareTo("n") == 0)
		{
			System.out.println("Goodbye!");
		}
		else
		{
			System.out.print("Invalid Response");
		}

	}
	
	
	public static void play() 
	{
		setWord word = new setWord(); 
	}
	
	public static void guess()
	{
		
	}

}

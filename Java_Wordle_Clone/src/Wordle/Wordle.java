package Wordle;

import java.util.Scanner;
import java.io.*;
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
	
	// Calls Word class to set word for player to guess
	public static void play() 
	{
		String word = setWord(); // Calls the setWord method to get the word 
		System.out.print(word);
	}
	
	// Gets the word the user wants to guess and compares it to the actual word
	public static void guess()
	{
		String guess = "";
		char[] guessArr = segmentWord(guess);
	}
	
	// Sets the word that the player has to guess then returns it
	public static String setWord()
	{
		
	    String fileName = "Wordle_Words"; 
	    String setWord = ""; 
	    double i = Math.random() * 20; // Picks a random number to choose the letter from the list
	    
		try
		{
		// Opens the file and sets a Scanner to the list in order to iterate through it 
		File newFile = new File(fileName);
		FileReader fRead = new FileReader(newFile);
		Scanner scnr = new Scanner(fRead);
		
		// Loops through the list until the word at the random number is found
		while(scnr.hasNext() && i > 0)
		{
			setWord = scnr.next();
			i--;
		}
		
		// Closes both the Scanner and FileReader 
		scnr.close();
		fRead.close();
		
		}
		catch(IOException e)
		{
			System.err.print("An IOExcpetion occurred " + e.getMessage());
			e.printStackTrace();
		}
		
		return setWord; 
	}
	
	// Separates the word into a char array then returns that char array
	public static char[] segmentWord(String word)
	{
		char[] segmentedWord = new char[word.length() - 1];  
		return segmentedWord; 
	}
	

}

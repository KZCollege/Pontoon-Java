import java.util.Scanner;
public class Pontoon
{
	public static void main(String[] args)
	{
	//open keyboard
		Scanner keyboard = new Scanner(System.in);
	//variables
		int cardOne;
		int cardTwo;
		int cardThree;
		int cardFour;
		int cardFive;
		int totalAmount;
		String userInput;
		String userInputTwo;
		String userInputThree;
	//draw first two cards
		cardOne = 1 + (int)(Math.random() * 10);
		cardTwo = 1 + (int)(Math.random() * 10);
		System.out.println("Your cards are " + cardOne + " and " + cardTwo);
		totalAmount = cardOne + cardTwo;
		System.out.println("Your total cards are equal to " + totalAmount);
	//user choice to stick or hit
		System.out.println("Would you like to Stick, or Draw?");
		userInput = keyboard.next();
	//user chooses to Stick with Two cards
		if (userInput.equalsIgnoreCase("Stick"))
		{
		//win
			if (totalAmount > 18 && totalAmount < 22)
			{
				System.out.println("You have " + totalAmount + ", the house has 18. You win!");
			}
		//lose
			if (totalAmount < 19)
			{
				System.out.println("You have " + totalAmount + ", the house has 18. You lose!");
			}
		}
	//user chooses to Draw for card Three
		if (userInput.equalsIgnoreCase("Draw"))
		{
			cardThree = 1 + (int)(Math.random() * 10);
			System.out.println("Your new card is " + cardThree);
			System.out.println("Your cards are now " + cardOne + ", " + cardTwo + " and " + cardThree);
			totalAmount = totalAmount + cardThree;
		//bust
			if (totalAmount > 21)
			{
				System.out.println("Your total cards are equal to " + totalAmount + ". This is over 21. You lose!");
			}
		//user choice to stick or hit
			else 
			{
				System.out.println("Your total cards are equal to " + totalAmount);
				System.out.println("Would you like to Stick, or Draw?");
				userInputTwo = keyboard.next();
			//user chooses to Stick with Three cards
				if (userInputTwo.equalsIgnoreCase("Stick"))
				{
				//win
					if (totalAmount > 18 && totalAmount < 22)
					{
						System.out.println("You have " + totalAmount + ", the house has 18. You win!");
					}
				//lose
					if (totalAmount < 19)
					{
						System.out.println("You have " + totalAmount + ", the house has 18. You lose!");
					}
				}
			//user chooses to Draw for card Four
				if (userInputTwo.equalsIgnoreCase("Draw"))
				{
					cardFour = 1 + (int)(Math.random() * 10);
					System.out.println("Your new card is " + cardFour);
					System.out.println("Your cards are now " + cardOne + ", " + cardTwo + ", " + cardThree + " and " + cardFour);
					totalAmount = totalAmount + cardFour;
				//bust
					if (totalAmount > 21)
					{
						System.out.println("Your total cards are equal to " + totalAmount + ". This is over 21. You lose!");
					}
				//user choice to stick or hit
					else 
					{
						System.out.println("Your total cards are equal to " + totalAmount);
						System.out.println("Would you like to Stick, or Draw?");
						userInputThree = keyboard.next();
					//user chooses to Stick with Four cards
						if (userInputThree.equalsIgnoreCase("Stick"))
						{
						//win
							if (totalAmount > 18 && totalAmount < 22)
							{
								System.out.println("You have " + totalAmount + ", the house has 18. You win!");
							}
						//lose
							if (totalAmount < 19)
							{
								System.out.println("You have " + totalAmount + ", the house has 18. You lose!");
							}
						}
					//user chooses to Draw for card Five
						if (userInputThree.equalsIgnoreCase("Draw"))
						{
							cardFive = 1 + (int)(Math.random() * 10);
							System.out.println("Your new card is " + cardFive);
							System.out.println("Your cards are now " + cardOne + ", " + cardTwo + ", " + cardThree + ", " + cardFour + " and " + cardFive);
							totalAmount = totalAmount + cardFive;
						//bust
							if (totalAmount > 21)
							{
								System.out.println("Your total cards are equal to " + totalAmount + ". This is over 21. You lose!");
							}
						//Five Card Trick
							else
							{
								System.out.println("You have five cards, and they equal to " + totalAmount + ". this is under 22");
								System.out.println("Which means this a five card trick! You automatically win!");
							}
						}
					}
				}
			}
		}
	//close keyboard
		keyboard.close();
	}
}


		 import java.util.Random;
		 public class diceHW10 {
		 
		     private int rolledNumb; 
		     private int playerScore = 0;
		     
		     
		     public void rollNumber(int numberOfDie, 
		    		 int highestRollValue, 
		    		 int lowestRollValue)
		     {
		         highestRollValue = 6 * numberOfDie;
		         lowestRollValue = 1 * numberOfDie;
		         Random rand = new Random();
		         int rolledNumber = lowestRollValue + (int)(Math.random()* ((highestRollValue - lowestRollValue) + 1));
		         this.rolledNumb = rolledNumber;
		         
		     }
		     
		     public void compareOutcome(int playerGuess)
		     {
		         
		         if (this.rolledNumb == playerGuess) 
		         {
		             System.out.println("Right!");
		             System.out.println("Your Score is " + this.playerScore);
		             System.out.println("Would You Like To Play Again?");
		             System.out.println("Enter 'Yes' or 'No'. ");
		             this.playerScore++; 
		         }
		         else 
		         {
		             System.out.println(" Wrong");
		             System.out.println("Your Score is " + this.playerScore);
		             System.out.println("Would You Like To Play Again?");
		             System.out.println("Enter 'Yes' or 'No'. ");
		         
		     
		     
		     
	}

		     }}

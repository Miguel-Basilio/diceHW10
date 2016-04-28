import java.util.Scanner;
public class DiceGame extends diceHW10 {

    public static void main(String[] args) 
    {
        boolean restart = true;
        Scanner in = new Scanner(System.in);
        diceHW10 rolledNumber = new diceHW10(); 
        diceHW10 numberGuessed = new diceHW10();
        
        while(restart)
        {
            System.out.println("How Many Die Do You Want to Roll");
            int numberOfDie = in.nextInt();

            rolledNumber.rollNumber(numberOfDie, 1, 6);

            System.out.println("What Number Did It Roll On?");
            int playerGuess = in.nextInt();
            numberGuessed.compareOutcome(playerGuess);

            String replay = in.next();
            if (replay.equalsIgnoreCase("yes"))
            {
                restart = true;
            }
                else if (replay.equalsIgnoreCase("no"))
            {
                restart = false; 
            }
        }
        }
    }
import java.util.Scanner;

public class Prompter{
  private Scanner scnr;
  
  public Prompter(){
   this.scnr = new Scanner(System.in); 
  }
  
  // Prompt the player for the type of item
  public String promptForItemType(){
    System.out.print("What type of item should fill the jar? ");
    return scnr.nextLine();
  }
  
  // Prompt for the maximum number of items
  public int promptForMaxQty(String itemType){
    System.out.printf("What is the maximum amount of %s? ", itemType);
    return scnr.nextInt();
  }
  
  // Present the range of items to the player
  public void displayRange(String itemType, int maxQty){
      System.out.printf("How many %s are in the jar? Pick a number between 1 and %d. %n", itemType, maxQty);
  }
  
   // Prompt the player for a guess and validate that it's within range
  public int promptForGuess(int maxQty){
    int playerGuess;
    while(true){
        System.out.print("Enter your guess: ");
        playerGuess = scnr.nextInt();
      if (playerGuess > maxQty){
        System.out.printf("Your guess must be less than the maimum fill amount %d. Try again. %n", maxQty);
      } else {
        break; // valid guess
      }
    }
    return playerGuess;
  }
      
  // Display feedback based on the guess being too high, too low or correct
  public void displayGuessFeedback(int playerGuess, int currentItems){
        if (playerGuess > currentItems){
          System.out.println("Your guess is too high. Try again.");
        } else if (playerGuess < currentItems){
          System.out.println("Your guess is too low. Try again.");
        } else {
          System.out.println("Congratulations! You guessed the correct number of items!");
        }
      }
  
    // Display the total attemps
  public void displayAttempts(int attempts){
      System.out.printf("You got it in %d attempt(s).%n", attempts);
  }
  
  public void close(){
    scnr.close();
  }
}

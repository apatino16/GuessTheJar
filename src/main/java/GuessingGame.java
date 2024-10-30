public class GuessingGame {
    public static void main(String[] args) {
      Prompter prompter = new Prompter();
   
      // Prompt for item type
      String itemType = prompter.promptForItemType();
      
      // Prompt for maximum amount
      int maxQty = prompter.promptForMaxQty(itemType);
      
      //  Create a new Jar instance and fill it
      Jar jar = new Jar(itemType, maxQty);
      jar.fill();
      
      // Present the Range of Items to the player
      prompter.displayRange(jar.getName(), jar.getMaxNum());
      
      // Game loop
      int guessCount = 0;
      int playerGuess; 
      
      while(true){
        playerGuess = prompter.promptForGuess();
        
        // Check guess is within range
        if (!prompter.displayIfOutOfRange(playerGuess, jar.getMaxNum())){
          continue;
        };
        
        guessCount++;
        
        // Display feedback for the guess
        prompter.displayGuessFeedback(playerGuess, jar.getCurrentItems());
        
        // Exit loop if the player guessed correctly
        if (playerGuess == jar.getCurrentItems()){
          break;
        }
      }
      
      // Show the  total attemps
      prompter.displayAttempts(guessCount);
      
      prompter.close();

    }
}

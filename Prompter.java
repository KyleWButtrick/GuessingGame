import java.io.Console;

public class Prompter{
  private Game mGame;
  Console console = System.console();
  
  
  public Prompter(Game game){
    mGame = game;
  }
  public void guiLine(){
    System.out.println("--------------------------------------------------------------------------------------\n");
  }
  
  public void gamePrompt(){
      guiLine();
      System.out.printf("\nLet's play a game!\nHow many " + mGame.mItemInJar + " do you think are in the jar?\n"
                         +"It can hold a maximum of " + mGame.mMaxNumberInJar + ".\n");
  }
 
  public void adminPrompt(){
    String itemType = "";
    String maxNumberString= "";
    int maxNumber;
    
    String mYesOrNo = console.readLine("Are you an Administrator? Enter: Yes or No  ");
    if (mYesOrNo.equalsIgnoreCase("yes")){
      System.out.println("Loading admin settings...");
      itemType = console.readLine("Please enter the name of the item are you filling the jar with (e.g. jelly beans):   \n");
      maxNumberString = console.readLine("Please enter a estimate of how many will fit in the jar(e.g. 250):  \n");
      maxNumber = Integer.parseInt(maxNumberString);
      mGame.gameSetupItem(itemType);
      mGame.gameSetupMaxNumber(maxNumber);
      mGame.randomNumberGen(mGame.mMaxNumberInJar);
    }
    else{
      System.out.println("Loading Game");
      mGame.randomNumberGen(mGame.mMaxNumberInJar);
    }
  }
  
  public boolean playAgainPrompt(){
    String mYesOrNo = console.readLine("\nWould you like to play again? Enter: Yes or No  ");
    if (mYesOrNo.equalsIgnoreCase("yes")){
      return mGame.mPlayAgain = true;
  
  }
    else{
      return mGame.mPlayAgain = false;
    }
  }
  
  public void youWon(){
    System.out.println("\nYou guessed it! Great job!");
    System.out.printf("It only took you %d guesses.", mGame.mCounter);
  }
  
  public void thanksForPlaying(){
    System.out.println("\nThanks for playing!");
  }
    
    
  
  
}
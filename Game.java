import java.util.Random;
import java.io.Console;

public class Game{
  
  
  
  public static String mItemInJar = "jelly beans";
  public static int mMaxNumberInJar = 500;
  public static int mRandomNumber;
  public static boolean mGuessedCorrect = false;
  public static int mGuess;
  public static int mCounter = 0;
  public static boolean mPlayAgain = true;
  
  public Game(String itemInJar, int maxNumberInJar){
    mItemInJar = itemInJar;
    mMaxNumberInJar = maxNumberInJar;
  }
  
  public int fill(int maxNumber){ 
    Random random = new Random();
    mRandomNumber = random.nextInt(mMaxNumberInJar + 1);
    if(mRandomNumber == 0){
      mRandomNumber +=1;
    }
    return mRandomNumber;
    
  }
  public String gameSetupItem(String itemType){
    mItemInJar = itemType;
     return mItemInJar;
  }
  
  public int gameSetupMaxNumber(int maxNumber){
     mMaxNumberInJar = maxNumber;
     return mMaxNumberInJar;
  }
  
   public void play(){
        while(!mGuessedCorrect){
          getGuess();
          verifyGuess(mGuess);
          helpGuesser();
          increaseCountOfGuesses();
        }
          mGuessedCorrect = false;
     }
     
  public int getGuess(){
    Console console = System.console();
    String typedIn;
    int guess;
    typedIn = console.readLine("\nPlease enter your guess:  \n");
    guess = Integer.parseInt(typedIn);
    mGuess = guess;
    return mGuess;
  }
  
  public boolean verifyGuess(int guess){
    if(mGuess == mRandomNumber){
      return mGuessedCorrect = true;
    }
    else{
      return mGuessedCorrect = false;
    }
  }
  
  public void helpGuesser(){
    
    if ( mGuess < mRandomNumber){
     System.out.println("You guessed too low! Try again!");
    }
    if (mGuess > mRandomNumber){
      System.out.println("You guessed too high! Try again!");
    }
  
  }
  
  public int increaseCountOfGuesses(){
    return mCounter ++;
    
  }
  
  
}
  
  

  
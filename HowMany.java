public class HowMany {
 
  public static void main(String[] args) {
    
    Game game = new Game();
    Prompter prompter = new Prompter(game);
    
    prompter.guiLine(); prompter.guiLine();
    
    prompter.adminPrompt();
    
    prompter.guiLine(); prompter.guiLine();
   
   while(game.mPlayAgain){ 
    prompter.gamePrompt();
    game.play();
    prompter.youWon();
    prompter.playAgainPrompt();
    game.mCounter = 0;
    game.randomNumberGen(game.mMaxNumberInJar);
    } 
    
    prompter.thanksForPlaying();
    
   
    
    
    
  
    
  }
  
}
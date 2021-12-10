// Author: JiaYang Wu 
// Date: 11/30/2021
// File: Game.java

// Import Random class 
import java.util.Random;

public class Game {
   // Instaiate private fields
   private String computer;
   private int userWinCount;
   private int computerWinCount;
   private String[] paperRockScissors = {"rock", "paper", "scissors"};
   
   // Constructor
   public Game() {
      // Set the default values for the Game class when created
      computer = "";
      userWinCount = 0;
      computerWinCount = 0;
   }
   
   // Getter that returns user's win count
   public int getPlayerWinCount() {
      return userWinCount;
   }
   
   // Getter that returns computer's win count
   public int getComputerWinCount() {
      return computerWinCount;
   }  
   
   // Getter that returns the computer move    
   public String getComputerMove() {
      // This decides what move the computer will use. Basically the random class will randomly generate a number from 0-2 because the array length will be 3,
      // whatever number that it lands on that's will be the computer's move. So if it is nextInt(0) the computer move will be rock, if nextInt(1) then the computer move will be paper
      computer = paperRockScissors[new Random().nextInt(paperRockScissors.length)]; 
      return computer;
   } 
   
   // Method printWinOrLoss compares the value of player win count to the computer win count
   public void printWinOrLoss() {
      // If computer beats the user in win count overall, then it will print a message saying the computer defeated the user
      if (computerWinCount > userWinCount) {
         System.out.println("Dang! You got beaten by a computer. That means you are worse than a bot xD.\n"); 
      } 
      // Else if user beats computer in win count overall, then it will print a message saying the user beat the computer
      else if (computerWinCount < userWinCount) {
         System.out.println("Congratulations you won against a computer, as expected from a genius like you.\n");
      }
      // Else if the win count is tied, it will print out a message saying it is tied
      else {
         System.out.println("Tied?! I guess you are the same as a bot LOL.\n");
      }
   }
   
   // Method that takes 2 arguments, the user's move and computer's move
   // then checks who won that round using if statements and switch statement.
   // If computer won, increase computerWinCount by 1, vice versa for userWinCount
   public void whoWon(String user, String computerInput) {
   
      // This statement will run if the user inputs "rock"
      if (user.toLowerCase().equals("rock")) {
         switch (computer) {
            case "paper":
               computerWinCount+= 1;
               System.out.println("The computer used " + computer + " against " + user);
               System.out.println("Computer wins! You lost");
               break;
            case "scissors": 
               userWinCount+= 1;
               System.out.println("The computer used " + computer + " against " + user);
               System.out.println("User has won");
               break;
            case "rock": 
               System.out.println("The computer used " + computer + " against " + user);
               System.out.println("That was a tie!");
               break;              
         }
      }
      // This statement will run if the user inputs "paper"
      else if (user.toLowerCase().equals("paper")) {  
         switch (computer) {
            case "scissors":
               computerWinCount+= 1;
               System.out.println("The computer used " + computer + " against " + user);
               System.out.println("Computer wins! You lost");
               break;
            case "rock": 
               userWinCount+= 1;
               System.out.println("The computer used " + computer + " against " + user);
               System.out.println("User has won");
               break;
            case "paper": 
               System.out.println("The computer used " + computer + " against " + user);
               System.out.println("That was a tie!");
               break;
         } 
      } 
      // This statement will run if the user inputs "scissors"             
      else if (user.toLowerCase().equals("scissors")) {  
         switch (computer) {
            case "rock":
               computerWinCount+= 1;
               System.out.println("The computer used " + computer + " against " + user);
               System.out.println("Computer wins! You lost");
               break;
            case "paper": 
               userWinCount+= 1;
               System.out.println("The computer used " + computer + " against " + user);
               System.out.println("User has won");
               break;
            case "scissors": 
               System.out.println("The computer used " + computer + " against " + user);
               System.out.println("That was a tie!");
               break; 
         }
      }
      // If the user inputs something that does not equal the above, then this message will print
      else {
         System.out.println("The input was invalid. Please enter rock, paper, or scissors.");
      }                            
   }
   
   // Method that returns a string and takes in a integer
   // This prints out the message once the user quits the game and final results are printed
   public String endingMessage(int roundNum) {
      // If the round played is less than or equal to 5, then the first if statement will run
      if (roundNum <= 5) {
         return "The game just started, and you are done already?! What a bummer :(";
      }
      // Else if round played is greater than 5 AND less than or equal to 15, this else if statment will run
      else if (roundNum > 5 && roundNum <= 15) {
         return "Darn it, we just got warmed up. Well I guess it is time to say goodbye.";
      }
      // Else if the round played is higher than 15, this will be the return value 
      else {
         return "Man, that was intense. You put up a good fight! Have a nice day :)";
      }
   }
}  
 
               
      
   
   
   
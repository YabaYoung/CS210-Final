// Author: JiaYang Wu 
// Date: 11/30/2021
// File: Game.java

import java.util.Random;

public class Game {

   private String computer;
   private int userWinCount;
   private int computerWinCount;
   
  
   public String getComputerMove() {
      
      String[] paperRockScissors = {"rock", "paper", "scissors"};
      
      computer = paperRockScissors[new Random().nextInt(paperRockScissors.length)]; 
      
      return computer;
   }   
   public void whoWon(String user, String computerInput) {
      
      if (user.toLowerCase().equals("rock")) {
         switch (computer) {
            case "paper":
               computerWinCount+= 1;
               System.out.println(computer);
               System.out.println("Computer wins! You lost");
               break;
            case "scissors": 
               userWinCount+= 1;
               System.out.println(computer);
               System.out.println("User has won");
               break;
            case "rock": 
               System.out.println(computer);
               System.out.println("That was a tie!");
               break;              
         }
      }
      else if (user.toLowerCase().equals("paper")) {  
         switch (computer) {
            case "scissor":
               computerWinCount+= 1;
               System.out.println("Computer wins! You lost");
               break;
            case "rock": 
               userWinCount+= 1;
               System.out.println("User has won");
               break;
            case "paper": 
               System.out.println("That was a tie!");
               break;
         } 
      }              
      else if (user.toLowerCase().equals("scissors")) {  
         switch (computer) {
            case "rock":
               computerWinCount+= 1;
               System.out.println("Computer wins! You lost");
               break;
            case "paper": 
               userWinCount+= 1;
               System.out.println("User has won");
               break;
            case "scissors": 
               System.out.println("That was a tie!");
               break; 
         }
      }
      else {
         System.out.println("The input was invalid. Please enter rock, paper, or scissors.");
      }                            
   }
   
   public int getPlayerWinCount() {
      return userWinCount;
   }
   public int getComputerWinCount() {
      return computerWinCount;
   }
}   
               
      
   
   
   
// Author: JiaYang Wu 
// Date: 11/30/2021
// File: Game.java

import java.util.Random;

public class Game {

   private String computer;
   private int userWinCount;
   private int computerWinCount;
   private String[] paperRockScissors = {"rock", "paper", "scissors"};
   
   // Constructor
   public Game() {
   
      computer = "";
      
      userWinCount = 0;
      
      computerWinCount = 0;
   }
      
   public String getComputerMove() {
      
      computer = paperRockScissors[new Random().nextInt(paperRockScissors.length)]; 
      
      return computer;
   } 
   public void printWinOrLoss() {
   
      if (getComputerWinCount() > getPlayerWinCount()) {
         System.out.println("Dang! You got beaten by a computer. That means you are worse than a bot.\n"); 
      }    
      else if (getComputerWinCount() < getPlayerWinCount()) {
         System.out.println("Congratulations you won against a computer, as expected from a genius like you.\n");
      }
      else {
         System.out.println("Tied?! I guess you are the same as a bot.\n");
      }
   }
   
   public void whoWon(String user, String computerInput) {
      
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
               
      
   
   
   
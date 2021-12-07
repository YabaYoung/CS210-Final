// Author: JiaYang Wu 
// Date: 11/30/2021
// File: RockPaperScissor.java

import java.util.Scanner;

public class RockPaperScissor { 
   
   public static void main (String[] args) {
   
      Scanner keyboard = new Scanner(System.in);
      
      Game gameProcess = new Game();
      
      String rpsInput;
      
      
      while (true) {
         System.out.println("Please input what you want to use against the computer, paper, rock, or scissors? ");
         rpsInput = keyboard.nextLine();
         
         if (rpsInput.toLowerCase().equals("q") || rpsInput.toLowerCase().equals("quit") || rpsInput.equals("Quit")) {
            break;
         } 
           
         else {
            
            gameProcess.whoWon(rpsInput, gameProcess.getComputerMove());
  
            System.out.println("Computer's win count: " + gameProcess.getComputerWinCount());
            System.out.println("User's win count: " + gameProcess.getPlayerWinCount());
         
            if (gameProcess.getComputerWinCount() > gameProcess.getPlayerWinCount()) {
               System.out.println("Dang! You got beaten by a computer. That means you are worse than a bot.\n");
            }
            else if (gameProcess.getComputerWinCount() < gameProcess.getPlayerWinCount()) {
               System.out.println("Congratulations you won against a computer, as expect from a genius like you.\n");
            }
            else {
               System.out.println("Tied?! I guess you are the same as a bot.\n");
            }   
         }
      }         
   }      
}
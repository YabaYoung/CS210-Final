// Author: JiaYang Wu 
// Date: 11/30/2021
// File: RockPaperScissor.java

import java.util.Scanner;
import java.util.Random;
import java.io.*; // Import Java I/O classes

public class RockPaperScissor { 
   
   public static void main (String[] args) throws IOException {
      
      Game gameProcess = new Game();
      
      String rpsInput = "";
      
      File greetingsFile = new File("Greetings.txt");
      
      Scanner fileReader = new Scanner(greetingsFile);
      
      System.out.println(fileReader.nextLine());
      
      fileReader.close();
      
      System.out.println("Read the instruction below to start playing rock, paper, scissors!");
      
      while (true) {
      
      Scanner keyboard = new Scanner(System.in); 
      
      System.out.println("\nPlease input what you want to use against the computer, paper, rock, or scissors? FYI, to quit playing please enter q, or quit.");
      
      rpsInput = keyboard.nextLine();
         
         if (rpsInput.toLowerCase().equals("q") || rpsInput.toLowerCase().equals("quit") || rpsInput.equals("Quit")) {
            break;
         } 
           
         else {
            gameProcess.whoWon(rpsInput, gameProcess.getComputerMove());
  
            System.out.println("Computer's win count: " + gameProcess.getComputerWinCount());
            System.out.println("User's win count: " + gameProcess.getPlayerWinCount()); 
         }
      }   
      gameProcess.printWinOrLoss();            
   }      
}
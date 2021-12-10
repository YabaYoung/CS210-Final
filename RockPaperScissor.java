// Author: JiaYang Wu 
// Date: 11/30/2021
// File: RockPaperScissor.java

import java.util.Scanner; // Import Scanner class
import java.util.Random; // Import Random class
import java.io.*; // Import Java I/O classes

public class RockPaperScissor { 
   // Main method
   public static void main (String[] args) throws IOException {
      
      // Create new Game called gameProcess
      Game gameProcess = new Game();
      
      // Create Scanner to get rock paper scissors input
      Scanner keyboard = new Scanner(System.in); 
      
      String rpsInput = ""; // Declare new String variable called rpsInput to store input
      int roundNumber = 0; // Declare variable roundNumber, of type int, to keep track of what round we are on
      
      // Create file object 
      File greetingsFile = new File("Greetings.txt");
      
      // Create scanner that will read the created file, which is "Greetings.txt"
      Scanner fileReader = new Scanner(greetingsFile);
      
      // Loop that will print the lines in the .txt file as long it has a next line
      while (fileReader.hasNext()) {
         System.out.println(fileReader.nextLine());   
      }
      
      // Closes Scanner fileReader
      fileReader.close();   
      
      // Infinite loop that ends when user quits
      while (true) {
      
         // Increase the round number by 1 for every round played. This number will stop increasing once the user quits the game
         roundNumber++;
         
         // Ask the user to input paper, rock, or scissors and store it in the String variable rpsInput
         System.out.println("\nPlease input what you want to use against the computer, paper, rock, or scissors? FYI, to quit playing please enter q, or quit.");
         rpsInput = keyboard.nextLine();
         
         // If statement that will end the game if the user inputs q or quit.
         // Else, it will compare the user's move with the computer's move. If the computer's move beats the user's input than computer win count increments by 1, vice versa. 
         // Also if they both use the same move, it will return as tie and neither computer or user win count increase.
         if (rpsInput.toLowerCase().equals("q") || rpsInput.toLowerCase().equals("quit") || rpsInput.equals("Quit")) {
            break;
         }  
         else {
            gameProcess.whoWon(rpsInput, gameProcess.getComputerMove());
            System.out.println("Computer's win count: " + gameProcess.getComputerWinCount());
            System.out.println("User's win count: " + gameProcess.getPlayerWinCount()); 
         }
      }
      // Print total rounds played to the console
      System.out.println("Total rounds played: " + roundNumber); 
      // Print the ending message to the console, the argument roundNumber will play a role in what message we get.
      System.out.println(gameProcess.endingMessage(roundNumber));  
      // This compared the win count of the computer and user, and outputs a message depending on if the user won or loss or it is a tie
      gameProcess.printWinOrLoss();            
   }
}
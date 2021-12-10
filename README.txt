----------------------------------------
FILE: README.txt
AUTHOR: JiaYang Wu 
PROJECT: CS 210 Final Project
DATE: 12/7/2013
----------------------------------------

Description: This is a rock paper scissors game/program. To start the program will ask the user to input paper, rock or scissors using the scanner method.
Then the user’s input must match with the ones on the conditional statement. Using the random method to decide what the computer’s 
move will be (paper, rock or scissors). The paper rock scissors will be stored in an array. Then check if the user lost, won, or tied using
conditional statements. The loop will run as long as the user don’t enter quit. Once quit is entered, the program ends.

Installation details: In order for this program to run correctly, MUST download the files: RockPaperScissor.java, Game.java, and Greetings.txt.
Also, they all need to be in the same folder, I will explain why in the section below.

How to run the game/program: 
1. You can either open the java file RockPaperScissor.java using a Java IDE, such as JGRASP, IntelliJ, etc..., and press the run botton to run the program.
2. Or you can do this: Compile the file RockPaperScissor.java, invoke it from the command line. This program does require an input, of type String
(paper, rock, or scissors), in order to run it correctly (Output the right thing, else it will say input is invalid).

Known error/bug:
1. If all the files are not downloaded and are not in the same directory, then an error in the program will occur. If the program does not find the file
"Greetings.txt", java.io.FileNotFoundException will be thrown.
2. Entering a space after you typed in rock paper scissors or quit will result in a invalid input. Instead of rock, the pc reads it as rock(space). 
Avoid adding spaces after typing in the input to ensure that the code will work as intended.

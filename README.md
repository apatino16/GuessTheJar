# Project 1: Guess How Many Are In The Jar Game

## About the Game
**GuessTheJar** is a console-based Java game created as part of Unit 1 of my Java Web Development Techdegree at Treehouse. The game challenges players to guess the number of items in a virtual jar. It provides hints if guesses are too high or too low, and the player wins by finding the exact count. This project demonstrates fundamental Java concepts such as encapsulation, loops, input/output, and class organization.

## Features
- Admin setup to specify item type and max quantity.
- Randomly filled jar for each game session.
- Hints on whether guesses are too high or low.
- Counter to track the number of attempts.

## Getting Started
### Prerequisites
To play the game, you'll need:
- **Java JDK** installed on your computer.

### Installation
1. Clone the repository or download the files to your local machine.
2. Compile the Java files:
   ```bash
   javac GuessingGame.java Jar.java Prompter.java
   ```
3. Run the game:
   ```bash
   java GuessingGame
   ```

## How to Play

1. Start the game. You’ll be asked by the **Prompter** to enter:
   - The type of item in the jar (e.g., gumballs, marbles).
   - The maximum quantity of items that could fit in the jar.
2. Make guesses about the number of items in the jar.
3. Receive feedback if the guess is too high or too low.
4. Continue guessing until you guess the correct number.
5. When you win, the program displays the number of attempts.

## Class Overview

### `GuessingGame`
The main class that runs the game loop and manages the overall gameplay flow.

### `Jar`
Represents the jar object, stores the item type, max quantity, and generates a random count of items in the jar.

### `Prompter`
Handles all input and output interactions, prompting the user and displaying game information.

## Future Enhancements
- **Multiple Rounds**: Enable replaying without restarting the program.
- **Leaderboard**: Track and display high scores for players.


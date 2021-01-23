// package Battleship;
// import java.util.*;
// import java.util.Scanner;


// public class playGame {
    
// 	public static void main(String[] args) {
// 		BattleShip game = new BattleShip();
// 		Scanner keyboard = new Scanner(System.in);
		
// 		System.out.println("There are 3 ships to sink on a 3x3 game board.");
// 		System.out.println("Coordinates of each ship range from a-g and 0-3." + "\n");
// 		System.out.println("Try to sink them all with the least number of guesses!");
// 		System.out.println(game.getShipList());
// 		String input = keyboard.nextLine();
// 		System.out.println(input);
// 		while(game.getShipsFound() != 3) {
// 			try {
// 				input = input.toLowerCase();
// 				game.checkGuess(input);
// 			} catch (Exception e) {
// 				System.out.println("no input");
// 			}
		
// 		}
// 		game.finishGame();
// 		// System.out.println(hitList);
       
//       }
// }

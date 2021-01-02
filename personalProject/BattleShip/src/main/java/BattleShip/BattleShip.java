package Battleship;

import java.util.*;

/*some layout ideas taken from "Head First Java 2nd edition"*/
public class BattleShip {

	private HashSet<HashSet<String>> shipsList = new HashSet<HashSet<String>>();
	private ArrayList<String> hitList = new ArrayList<>();
	private ArrayList<String> missList = new ArrayList<>();
	private int numOfGuesses;
   	private int shipsFound; 
	
	public BattleShip(){
		shipsFound = 0;
		setUpGame();
		numOfGuesses = 0;
	}

	/*setup game*/
	public void setUpGame() {
		Setup ships = new Setup();
		shipsList = ships.placeShips();
		System.out.println("There are 3 ships to sink on a 3x3 game board.");
		System.out.println("Coordinates of each ship range from A-C and 0-2." + "\n");
		System.out.println("Try to sink them all with the least number of guesses!");
		System.out.println(shipsList);
	}
	
	
	public HashSet<HashSet<String>> getShipList(){
		return shipsList;
	}

	public int getShipsFound(){
		return shipsFound;
	}

	
	/*checkGuess*/
	public String checkGuess(String userInput) {
		boolean hit = false;
		numOfGuesses++; 
		for(HashSet<String> ship: shipsList ) {
			hit = ship.contains(userInput);
			if(hit) {
				// System.out.println("hit");
				hitList.add(userInput);
				ship.remove(userInput);
				if(ship.isEmpty()) {
					shipsFound++;
					// System.out.println("kill");
					// System.out.println("Only " + (3 - shipsFound) + " ships left");
				}
				break;
			}else{
				missList.add(userInput);
			}
		}
		if(missList.contains(userInput) && !hitList.contains(userInput)) {
            return "miss";
		}else{
			return "hit";
		}
	}
	
	
	/*finish game*/
	public void finishGame() {
            System.out.print("Congrats you sank all the ships with " + numOfGuesses + " guesses!");
	}

}

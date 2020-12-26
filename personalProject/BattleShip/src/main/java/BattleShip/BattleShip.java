package BattleShip;

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
		System.out.println("There are 3 ships to sink on a 7x7 game board.");
		System.out.println("Coordinates of each ship range from a-g and 0-7." + "\n");
		System.out.println("Try to sink them all with the least number of guesses!");
		System.out.println(shipsList);
	}
	
	
	public HashSet<HashSet<String>> getShipList(){
		return shipsList;
	}

	public int getShipsFound(){
		return shipsFound;
	}

	
	// /*playing game*/
	// public void playGame() {
	// 	int shipsFound = 0;
	// 	while(shipsFound != 3) {
	// 		Scanner keyboard = new Scanner(System.in);
	// 		try {
	// 			String input = keyboard.nextLine();
	// 			input.toLowerCase();
	// 			shipsFound += checkGuess(input);
	// 		} catch (Exception e) {
	// 			System.out.println("no input");
	// 		}
		
	// 	}
	// 	finishGame();
	// 	System.out.println(hitList);
	// }
	
	
	/*checkGuess*/
	public int checkGuess(String userInput) {
		boolean hit = false;
		numOfGuesses++; 
		for(HashSet<String> ship: shipsList ) {
			hit = ship.contains(userInput);
			if(hit) {
				System.out.println("hit");
				hitList.add(userInput);
				ship.remove(userInput);
				if(ship.isEmpty()) {
					shipsFound++;
					System.out.println("kill");
					System.out.println("Only " + (3 - shipsFound) + " ships left");
				}
				if(hitList.size() > 0) {
					System.out.println("all hits:" + "\n" + hitList);
				}
				break;
			}else{
				missList.add(userInput);
			}
			
		}
		if(missList.contains(userInput) && !hitList.contains(userInput)) {
            System.out.println("miss");
            if(missList.size() > 0) {
                System.out.println("all misses:" + "\n" + missList);
            }
		}

		return shipsFound;
	}
	
	
	/*finish game*/
	public void finishGame() {
            System.out.print("Congrats you sank all the ships with " + numOfGuesses + " guesses!");
	}

}

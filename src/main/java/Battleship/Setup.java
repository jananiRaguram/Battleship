package Battleship;

import java.util.*;
import java.io.*;

public class Setup {

	public HashSet<HashSet<String>> placeShips() {
		HashSet<HashSet<String>> ships = new HashSet<HashSet<String>>();
		String coord = null;
		int max = 3;
		int min = 1; 
		char newC = '\0';
		int numOfShips = 1;
		ArrayList<Character> usedC = new ArrayList<Character>();
		
		while(ships.size() != 3) {
			/*setting a random size for each ship*/
			Random size = new Random();
			int shipSize = size.nextInt((max - min) + 1) + min;
//			System.out.println("ship size" + shipSize);
			
			/*creating an array for each ships coords*/
			String eachShip[] = new String[shipSize];
			
			/*random starting character*/
			String alpha = "ABC";
			Random rndChar = new Random();
			char c = alpha.charAt(rndChar.nextInt(alpha.length()));
//			System.out.println(numOfShips);
			
			/*getting only unique letters for each ship*/
			if(numOfShips > 1) {
				/*check is current char is already used*/
				if(usedC.contains(c)) {
					/*create new char and compare with rest until its unique*/
					rndChar = new Random();
					newC = alpha.charAt(rndChar.nextInt(alpha.length()));
					while(usedC.contains(newC)) {
						rndChar = new Random();
						newC = alpha.charAt(rndChar.nextInt(alpha.length()));
					}
					usedC.add(newC);
					c = newC;
				}
			}
			usedC.add(c);
			
			/*random number from 0 to 3 (inclusive)*/
			Random rndNum = new Random();
			int num = rndNum.nextInt((3 - 0) + 1) + 0; 
			
			/*making sure that the range for the ship size can fit in the starting position*/
			int rightSize = num + shipSize;
			while(rightSize > 3) {
				num = rndNum.nextInt((3 - 0) + 1) + 0;
				rightSize = num + shipSize;
//				System.out.println("bigger randnum" + num);
			}
//			System.out.println("start randnum" + num);
			
			int i = 0; 
			while( i < shipSize) {
				/*creating the coordinate*/
				coord = Character.toString(c) + Integer.toString(num);
//				System.out.println("each randnum " + num);
				/* putting each ships coord into an array which will be added to the arrayList later */
				eachShip[i] = coord;
				num++;
//				System.out.print("i" + i);
				i++;
				
			}
			numOfShips++;
			List<String> coordList = Arrays.asList(eachShip);
			Collections.sort(coordList);
			ships.add(new LinkedHashSet<String>(coordList));
		}
		
		return ships;
	}
}
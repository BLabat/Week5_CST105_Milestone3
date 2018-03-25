/** Program: Milestone3
 * File:Manager.java
 * Summary: Manager Class displays 6 players to console
 * Author: Brandon Labat
 * Date: March 25, 2018
 */

public class Manager {//begin manager class
	public static void main(String[]args) {//begin Main method
		final int Array_Length = 6;
		Player [] player = new Player[Array_Length];
		//Organize display console with header
		System.out.println("PLAYER " + "     " + "AGE " + "    " + "WEIGHT" + "   " + "HEIGHT" + "  " + "POS" + "       " + "TEAM" + "      " +
		"#" + "  " + "SEASONS" + "  " + "COLLEGE" + "  " +  "HIGHSCHOOL");
		
		//Instantiate player object, initializes the Player class variable
		Player player1 = new Player("Tom Brady", "Michigan", "Serra HS","QB","NE Patriots",
				19, 12, 40, "6ft 4in", 225);
	
		Player player2 = new Player("Philip Rivers", "North Carolina State", "Athens HS", "QB", "LA Chargers",
				15, 17, 36, "6ft 5in", 228);
		
		Player player3 = new Player("Kareem Hunt", "Toledo", "South HS", "RB","KC Chiefs",
				2, 27, 22, "5ft 10in", 216);
		
		Player player4 = new Player("Todd Gurley","Georgia","Tarboro HS","RB", "LA Rams",
				4, 30, 23,"6ft 1 in", 227);
		
		Player player5 = new Player("Preston Brown","Louiseville", "Northwest HS","LB","Cinc Bengals",
				5,0, 25,"6ft 1in", 251);
		
		Player player6 = new Player("Blake Martinez","Stanford","Canyon del Oro HS","LB","GB Packers",
				3, 50, 24,"6ft 2in", 237);
		//Places player in an array list
		player[0] = player1;
		player[1] = player2;
		player[2] = player3;
		player[3] = player4;
		player[4] = player5;
		player[5] = player6;
		
	Player.sortByPlayer(player);
		
		for(int i = 0; i < player.length; i++) {//begin for loop
			//for readability
			System.out.println("----------------------------------------------------------------------------------------");//For readability
			System.out.println();//For readability
			player[i].Manager();
			
			System.out.println();//For readability
		}//end for loop
	}//end main method
}//end Manager Class



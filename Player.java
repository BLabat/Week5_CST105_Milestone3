/** Program: Milestone2
 * File:player.java
 * Summary: Creates object with properties, getter/setter
 * Author: Brandon Labat
 * Date: March 25, 2018
 */
public class Player {//begin player class
	//declare instance variables
	private String name;
	private String college;
	private String highschool;
	private String position;
	private String team;
	private int experience;
	private int number;
	private int age;
	private String height;
	private int weight;
	
	public Player() {}//Empty constructor
	
		
	public Player(String name, String college, String highschool, String position,
			String team, int experience, int number, int age, String height, int weight) {
		// set instanced variables to be passed in the method
		this.name = name;
		this.college = college;
		this.highschool = highschool;
		this.position = position;
		this.team = team;
		this.experience = experience;
		this.number = number;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {// get the value of the instanced variable name
	return this.name;
	}
	public int getAge() {// get the value of the instanced variable age
		return this.age;
	}
	public int getWeight() {// get the value of the instanced variable weight
		return this.weight;
	}
	public String getHeight() {// get the value of the instanced variable height
		return this.height;
	}
	public int getNumber() {// get the value of the instanced variable number
		return this.number;
	}
	public int getExperience() {// get the value of the instanced variable experience
		return this.experience;
	}
	public String getTeam() {// get the value of the instanced variable team
		return this.team;
	}
	public String getPosition() {// get the value of the instanced variable position
		return this.position;
	}
	public String getHighschool() {// get the value of the instanced variable highschool
		return this.highschool;
	}
	public String getCollege() {// get the value of the instanced variable college
		return this.college;
	}
	
	public void Manager() {//display Manager Class to console
		
		System.out.print(String.valueOf(getName()));
		System.out.print("     " + String.valueOf(getAge()));
		System.out.print("     " + String.valueOf(getWeight()));
		System.out.print("   " + String.valueOf(getHeight()));
		System.out.print("   " + String.valueOf(getPosition()));
		System.out.print("   " + String.valueOf(getTeam()));
		System.out.print("   " + String.valueOf(getNumber()));
		System.out.print("   " + String.valueOf(getExperience()));
		System.out.print("   " + String.valueOf(getCollege()));
		System.out.print("   " + String.valueOf(getHighschool()));
	}

	public static void sortByPlayer(Player player[]) {
		Player  sort;
		for(int j = player.length-2; j>0; j--) {
			for(int i= 0; i<=j; i++) {
				if(player[i].getName().compareTo(player[i +1 ].getName())>0) {
					sort = player[i];
					player[i] = player[i +1];
					player[i +1] = sort;
				}
			}
		}
	}
}


package test002;

public class Animal {

	private static int count = 0;
	private String species;
	
	public Animal() {
		count++;
	}
	
	public Animal(String s) {
		count++;
		species = s;
	}
	
	public String noise() {
		return "no noise from Animal";
	}
	
	public static int getCount() {
		return count;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String s) {
		this.species = s;
	}
}

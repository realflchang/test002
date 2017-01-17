package test002;

public class Dog extends Animal {
	
	public String noise() {
		return "Woof Woof";
	}

	public Dog() {
		this("unknown dog");
	}
	
	public Dog(String s) {
		super(s);
	}
	
	public String toString() {
		return String.format("dog species is %s", getSpecies());
	}
}

package test002;

public class Fish extends Animal {
	
	public String noise() {
		return "Blurp Slurp";
	}
	
	public Fish() {
		this("unknown fish");
	}
	
	public Fish(String s) {
		super(s);
	}
}

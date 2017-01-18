package test002;
// This part added due to CEO request.

public class mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] a = new Animal[2];

		Dog d = new Dog("poodle");
		Fish f = new Fish("tetra");
		
		a[0] = d;
		a[1] = f;
		
		for(Animal x: a) {
			System.out.println("species is "+x.getSpecies()+", noise is "+x.noise());
		}

		System.out.println("Dog object " + String.format("%s", d));
		//System.out.println("Fish goes " + f.noise());
		System.out.println("Animal count is " + Integer.valueOf(Animal.getCount()));
		System.out.println("Feature added in addafeature branch");
	}

}

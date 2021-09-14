package oopsConcept;

class Tree extends PlantLivingThings {
	Tree() {
		breath();
		notMove();
	}
}

class Gross extends PlantLivingThings {
	Gross() {
		breath();
		notMove();
	}
}

class Eagle extends FlyingAnimal {
	Eagle() {
		breath();
		Eye();
		Leg();
		Wings();
	}
}

class Snake extends CrawlAnimal {
	Snake() {
		Eye();
		breath();
	}
}

class EarthWorm extends CrawlAnimal {
	EarthWorm() {
		breath();
	}

}

class Lion extends MovingAnimal {
	Lion() {
		breath();
		Eye();
		Leg();
	}
}

class WaterAnimal extends MovingAnimal {
	WaterAnimal() {
		breath();
		Eye();
	}
}

public class Inheritance {
	public static void main(String[] args) {

		System.out.println("\nTree Living Thing\n");
		Tree t = new Tree();
		System.out.println("\ngross Living Thing\n");
		Gross g = new Gross();
		System.out.println("\nflying Living Thing\n");
		Eagle e = new Eagle();
		System.out.println("\ncrawl Living Thing snake\n");
		Snake s = new Snake();
		System.out.println("\ncrawl Living Thing earthWrorm\n");
		EarthWorm ew = new EarthWorm();
		System.out.println("\n Mammals Animal\n");
		Lion li = new Lion();
		System.out.println("\n water animals \n");
		WaterAnimal wa = new WaterAnimal();

	}

}

package oopsConcept;

/*
 * Encapsulation binding the data with method to access the private variable for secure coding
 * */
class EnCap {
	private int prize;

	protected int getPrize() {
		return prize;
	}

	protected void setI(int prize) {
		this.prize = prize;
	}
}

/*
 * the MobileDescription class is used to get details about mobile phone
 */
abstract class MobileDescription {

	void Processor() {
		System.out.println("Processor  :Apple A14 Bionic");
	}

	void Batery() {
		System.out.println("Battery Capacity: 4500 mAh");
	}

	void Ram() {
		System.out.println("Ram :8 gb");
	}

	abstract void Prize();
}

// here we are  inheriting the abstract class MobileDescription to describe about iphone
class IPhone extends MobileDescription {
	void iPhone() {
		Processor();
		Batery();
		Ram();
		Prize();
	}

	EnCap e = new EnCap();

	void Prize() {
		e.setI(48000);
		System.out.println("Prize : " + e.getPrize());
	}
}

//here we are  inheriting the abstract class MobileDescription to describe about redmi
class Redmi extends MobileDescription {
	/*
	 * Here creating object for pojo class EnCap by using setter and getters we are
	 * accessing the prize of the mobile
	 */

	void Processor() {
		System.out.println("Processor  :Snapdragon 888     ");

	}

	void Batery() {
		System.out.println("Battery Capacity: 5500 mAh");
	}

	EnCap e = new EnCap();

	void Prize() {
		e.setI(18000);
		System.out.println("Prize : " + e.getPrize());
	}

	Redmi() {
		Processor();
		Batery();
		Ram();
		Prize();
	}
}

//here we are  inheriting the abstract class MobileDescription to describe about samsung
class Samsung extends MobileDescription {

	void Processor() {
		System.out.println("Processor  :Snapdragon 555");
	}

	void Batery() {
		System.out.println("Battery Capacity: 5500 mAh");
	}

	EnCap e = new EnCap();

	void Prize() {
		e.setI(23000);
		System.out.println("Prize : " + e.getPrize());
	}

	void Ram() {
		System.out.println("Ram :6 gb");
	}
}

public class Shop {

	public static void main(String[] args) {
		System.out.println("IPHONE");

		IPhone iphon = new IPhone();
		iphon.iPhone();

		System.out.println("REDMI");
		Redmi redmi = new Redmi();

		System.out.println("SAMSUNG");
		Samsung sam = new Samsung();
		sam.Processor();
		sam.Batery();
		sam.Ram();
		sam.Prize();
	}

}
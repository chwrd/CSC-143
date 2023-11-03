import java.util.Random;

public class Car {

	private String make;
	private double weight;
	private StringBuilder id;

	private static Random rand = new Random();

	public Car(String theMake, double theWeight) {
		make = theMake;
		weight = theWeight;

		// ten-character id randomly generated
		id = new StringBuilder();
		for (int i = 1; i <= 10; i++) {
			char c = (char) ('A' + rand.nextInt(26));
			id.append(c);
		}
	}

	public void changeID() {
		// replace the last character with a random digit
		char c = (char) ('0' + rand.nextInt(10));
		id.setCharAt(id.length() - 1, c);
	}

	@Override
	public String toString() {
		return "make = " + make + ", weight = " + weight + ", id = " + id;
	}

	@Override
	public boolean equals(Object obj) {
		// two cars are the same if they have the same weight and the same make
		// How to check that?
		// is this an alias?
		if (this == obj) {
			return true;
		} else if (obj != null && this.getClass() == obj.getClass()) { // (obj instanceof Car) {
			// use getClass to check if this and obj have the same dynamic type
			// -> gives false if comparing a Car and a FancyCar
			Car that = (Car) obj;
			return this.weight == that.weight && this.make.equals(that.make);
		} else {
			// not a Car object
			return false;
		}
	}

	/**
	 * Returns a shallow copy of this car. The copy and the original share the
	 * String make and StringBuilder id
	 */
	public Car shallowCopy() {
		Car copy = new Car(make, weight);
		copy.id = id;
		return copy;
	}

	/**
	 * Returns a deep copy of this car. The copy and the original don't share any
	 * object.
	 */
	public Car deepCopy() {
		Car copy = new Car(new String(make), weight);
		copy.id = new StringBuilder(id);
		return copy;
	}
}

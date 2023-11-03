// A student is a person with a gpa
// A student has a name and an age and can speak
// Since name and age are private in Person, the fields age and name
// cannot be used in Student

public class Student extends Person {
	// the gpa of the student
	private double gpa;

	// if no constructor is explicitly written -> get the default (implicitly)
	// as if we had
//	public Student() {
//		// call to the Person constructor 
//		// -> tries to call the default constructor in Person
//		// it doesn't exist so there is an error
//	}

	/**
	 * Constructs a student given their name, age and gpa
	 */
	public Student(String name, int age, double gpa) {
		// the first line of code in Student MUST call the Person constructor
		// use the super keyword
		super(name, age);
		this.gpa = gpa;
	}

	// to redefine the speak method in Student -> override
	// Just write speak again in Student with exactly the same signature as in
	// Person
	@Override
	public void speak() {
		// print the name, age and gpa
		// but name and age are private and are not accessible in Student
		// what do we do?
		super.speak(); // print the name and age
		System.out.println("gpa = " + gpa);
	}

	/**
	 * Returns a String representation of the person
	 */
	@Override
	public String toString() {
		return super.toString() + " My gpa is " + gpa + ".";
	}

}

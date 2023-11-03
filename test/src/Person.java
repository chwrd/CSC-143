/**
 * A simple model of a person
 * 
 * @author CSC 143
 * 
 */
public class Person {
	// a person is defined by a name and an age
	// protected -> scope = class + all derived classes
	// could make the scope protected to make name and age visible inside of Student
	private String name;
	private int age;

	/**
	 * Constructs a Person object given the name and age
	 * 
	 * @param n the name of the person
	 * @param a the age of the person
	 */
	public Person(String n, int a) {
		name = n;
		age = a;
	}

	/**
	 * Prints the name and age of the person
	 */
	public void speak() {
		System.out.println("My name is " + name + ". I am " + age + " years old.");
	}

	/**
	 * Returns a String representation of the person
	 */
	@Override
	public String toString() {
		return "My name is " + name + ". I am " + age + " years old.";
	}
}

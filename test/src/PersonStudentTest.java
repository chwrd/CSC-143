
public class PersonStudentTest {

	public static void main(String[] args) {
		Person p = new Student("Sarah", 25, 3.9);

		// using toString from Object
		// System.out.println(p.toString());
		System.out.println(p);

		// any variable (such as p) comes with two types:
		// type to declare the variable = static type
		// p has static type Person (the static type never changes)
		// type of the object that p points to = dynamic type (the dynamic type
		// may change or even be undefined (e.g. p = null))

		p.speak();
		// for code to execute correctly
		// 1) it has to compile
		// 2) it has to run
		// the compiler knows only about the static types of variables
		// p.speak() compiles because there is a speak method in Person

		// at run time
		// the JVM looks at the dynamic type of p -> Student
		// the JVM looks for speak starting in the Student class
		// if not found, the JVM continues looking for the method going up
		// the hierarchy of classes
		// Declare and initialize an array of Person objects. Some of the elements may
		// be
		// Student objects
		Person[] a = { new Person("Isabella", 22), new Student("Carlos", 23, 4.0), new Person("Rebecca", 24) };
		for (Person q : a) {
			q.speak();
		}
		// equivalent to
//		for (int i = 0; i < a.length; i ++) {
//			Person q = a[i];
//		}

		// could you switch the dynamic and static types?
		// No
		// Student s = new Person("Suzy" , 25); not allowed

	}

}

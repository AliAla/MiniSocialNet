/**
 * 
 */
package network;

/**
 * @author alial
 *
 */

	


	import java.util.HashMap;
	import java.util.Scanner;

	import connection.Connection;
	import connection.ConnectionType;
	import user.Adult;
	import user.Dependent;
	import user.Person;

	/**
	 * @author alial
	 *
	 */
	public class Driver {
		static Scanner input = new Scanner(System.in);
		private static Network network = new Network();

		public static void addPerson() {

			Person person = null;
			System.out.println("Enter your name : ");
			String name = input.nextLine();
			// System.out.println("Enter your name : ");
			char gender = Utility.readGender();

			int age = Utility.readInt("Enter your age : ", 0, 150);
			if (Utility.isAdult(age)) {
				person = new Adult(name, age, gender);
			} else {
				String mother = Utility.readString("Please enter the name of mother or father: ");
				Person motherPro = Network.getProfile(mother);
				String father = Utility.readString("Please enter the name of mother or father: ");
				Person fatherPro = Network.getProfile(father);
				if (motherPro != null && fatherPro != null)
					person = new Dependent(name, age, gender, motherPro, fatherPro);
			}

			network.addPerson(person);

		}

		/*
		 * To connect two people As
		 */
		public static void connect(Person person1, Person person2) {
			person1.addConnection(new Connection(ConnectionType.Friend, person2));

		}

	


}

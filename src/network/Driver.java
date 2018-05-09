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
			
			char gender = Utility.readGender();

			int age = Utility.readInt("Enter your age : ", 0, 150);
			if (!Utility.isAdult(age)) {
				String father = Utility.readString("Please enter your father's name : ");
				Person fatherPro = Network.getProfile(father);
				String mother = Utility.readString("Please enter your mother's name : ");
				Person motherPro = Network.getProfile(mother);
				if (motherPro != null && fatherPro != null)
					person = new Dependent(name, age, gender,fatherPro, motherPro);
				
			} else 
				person = new Adult(name, age, gender);
						
			network.addPerson(person);

		}

		/*
		 * To connect two people
		 */
		public static void connect(Person person, Person person2, String relation) {
			ConnectionType connectionType;
			if(Utility.isAdult(person.getAge()) && Utility.isAdult(person2.getAge()))
					{
			 connectionType =ConnectionType.valueOf(relation);
			person.addConnection(new Connection(connectionType, person2));
			System.out.println("connected as "+ relation);
					}
			else if((!Utility.isAdult(person.getAge())&& person.getAge()>2) || (!Utility.isAdult(person2.getAge())&& person2.getAge()>2))
			{
				if(Utility.ageLimit(person.getAge(), person2.getAge())&& relation !="Parent" && relation != "Colleague")
				{
					connectionType =ConnectionType.valueOf(relation);
				    person.addConnection(new Connection(connectionType, person2));
				    System.out.println("connected as "+ relation);
				}
					
			}
				
		}
		
	


}

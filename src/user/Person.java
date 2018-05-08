/**
 * 
 */
package user;

import java.util.HashSet;

/**
 * @author alial
 *
 */

	import java.util.List;
	import java.util.Set;
	import java.util.TreeSet;

	import connection.Connection;
import connection.ConnectionType;

	public class Person  {
		/**
		 * name of a person
		 */
		private String name;
		/**
		 * gender
		 */
		private char gender;
		/**
		 * age
		 */
		private int age;
		/**
		 * status 
		 */
		private String status = "";
		
		/**
		 * image
		 */
		private byte [] photo;
		Set <Connection> connection=new HashSet<>();
		
		public Person(String name, int age, char gender) {
			this.name = name;
			this.age = age;
			this.gender=gender;
			
		}
		
		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public byte[] getPhoto() {
			return photo;
		}
		public void setPhoto(byte[] photo) {
			this.photo = photo;
		}
		public void addConnection(Connection conns)
		{
			//conns.getPerson().addConnection(new Connection(ConnectionType.Friend, this));
			connection.add(conns);
			System.out.println("Connected Person");
		}
		
		
		
		

	

}

/**
 * 
 */
package user;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

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
		static Set <Connection> connection=new HashSet<>();
		ConnectionType connectionType;
		
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
			conns.getPerson().addConnection(new Connection(connectionType, this));
			connection.add(conns);
			System.out.println("Connected Person");
		}
		public static void hasConnection()
		{
			connection.forEach(Person -> System.out.println(Person));
//			if(connection.contains(person))
//				
//			return ;
			
		}
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
					
		        return "Name of the person.:" + this.name + ",, "
		                + "Gender :" + this.gender + ",, " + "Age :"
		                + this.age ;
		    
		}
		
		public static void s()
		{
			
			Iterator<Connection> iterator = connection.iterator();
			
	        
			while (iterator.hasNext()){
				 Object val = iterator.next();
				System.out.println(" Iterating over HashSet in Java current object: " + iterator.next());
			       
			       // System.out.println(val);
			
		}
		
		
		}	

	

}

/**
 * 
 */
package user;

import connection.ConnectionType;

/**
 * @author alial
 *
 */
public class Dependent extends Person {
	Person father;
	Person mother;
	
	public Dependent(String name, int age, char gender, Person mother,Person father) {
		super(name, age, gender);
		this.father= father;
		this.mother= mother;
		System.out.println("zzzzzzzz");
	//	if()
		// TODO Auto-generated constructor stub
	}
	private boolean isConnected(Person person1,Person person2)
	{
		
		return false;
		
	}
}

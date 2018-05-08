/**
 * 
 */
package user;


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
		// TODO Auto-generated constructor stub
	}
	
}

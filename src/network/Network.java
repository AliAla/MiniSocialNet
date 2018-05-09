/**
 * 
 */
package network;

/**
 * @author alial
 *
 */

	import java.util.Collection;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Map.Entry;
	import java.util.Set;
	import java.util.stream.Collectors;

	import user.Person;

	/**
	 * @author alial
	 *
	 */
	public class Network {
		static HashMap<String, Person> profile = new HashMap<>(100);
		static Person person;
	/*
	 * Get a profile when we want to create a Dependent object
	 */
		
		public static Person getProfile(String name) {

			if (profile.containsKey(name)) {
				Set<Entry<String, Person>> entires = profile.entrySet();
				
				for (Entry<String, Person> ent : entires) {
//					System.out.println(ent.getKey() + " ==> " + ent.getValue());
//					System.out.println(person.toString());
					
					return ent.setValue(person);

				}

			}
			return null;

		}

	/*
	 * Print out All people in the Map
	 */
		
		public void listEveryone() {

			for (String keys : profile.keySet()) {
				System.out.println(keys + ":" + profile.get(keys));
			}
		}
			/*
			 * To Add a person to the Map
			 */
		public void addPerson(Person person) {
			profile.put(person.getName(), person);
			
		}

	


}

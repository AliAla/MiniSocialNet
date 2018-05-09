
<<<<<<< HEAD
package connection;
=======
package src.connection;
>>>>>>> 8061fdeca458f23d5b5d8076975126ea14424d3f

/**
 * @author alial
 *
 */

	import user.Person;

	

	public class Connection {
		private ConnectionType conType;
		private Person person;

		public Connection(ConnectionType conType, Person person) {
			this.conType = conType;
			this.person = person;
		}

		public ConnectionType getConType() {
			return conType;
		}

		public Person getPerson() {
			return person;
		}

	

}

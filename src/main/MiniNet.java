package main;


		
		import network.Driver;
		import network.Network;
		import network.Utility;
		import user.Adult;
		import user.Dependent;
		import user.Person;

		public class MiniNet {

			public static void main(String[] args) {

				
				 {
				int input = menu();
				
				
				Network network = new Network();
				Person person=null;
				Person person2=null;

				while (input != 0) {
					switch (input) {
					case 1:
						Driver.addPerson();
						break;
					case 2:
						Driver.connect(person=network.getProfile(Utility.readString("the first name")),person2=network.getProfile(Utility.readString("the second name"))
								      ,Utility.readString("the relation"));
						break;
					case 3:
						network.listEveryone();
						break;

					case 4:
						Person.hasConnection();
						/*Network.getProfile(Utility.readString("Type the name"));
						 * 
						 */
						break;
					}
					input = menu();
				}
				
				 }
			}

			private static int menu() {

				System.out.println("1. Add a person");
				System.out.println("2. Connect two person");// there is an error
				System.out.println("3. List everyone");
				System.out.println("4. Get a person"); // to cheak the getprofile work or not
				System.out.println("0. Exit");
				return Utility.readInt("Enter your chooce", 0, 4);
			}

			



}

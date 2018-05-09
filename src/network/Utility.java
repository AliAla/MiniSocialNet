/**
 * 
 */
package network;

/**
 * @author alial
 *
 */
	import java.util.Scanner;

	/**
	 * utility class
	 */
	public class Utility {
		
		/**
		 * create new Scanner object
		 */
		private static Scanner scanner = new Scanner(System.in);
		
		/**
		 * check if age is adult
		 * @param age age
		 * @return true or false
		 */
		public static boolean isAdult(int age){
			return age > 16;
		}
		/**
		 * check if age is Dependent in limit age to make friend
		 * @param age age
		 *  @param age age
		 * @return true or false
		 */
		public static boolean ageLimit(int age1,int age2)
		{
			if((age1<age2+3)&&(age1>age2-3))	
			   return true;
			return false;
		}
		
		/**
		 * read gender
		 * @return gender that is M or F
		 */
		public static char readGender(){
			
			char gender = ' ';//valid gender
			
			System.out.print("Please enter gender (M/F) ");
			
			//loop until user enter F or M
			while (true){
				try{
					gender = scanner.nextLine().toUpperCase().charAt(0);
					if (gender != 'M' && gender != 'F'){
						System.out.printf("Please enter F or M. Try again: ");
					}else{
						break;
					}
				}catch(NumberFormatException e){
					System.out.print("Invalid input. Try again: ");
				}//end try
			}//end while
			
			return gender;
		}
		
		/**
		 * read an integer between minimum and maximum
		 * @param prompt
		 * @param min minimum
		 * @param max maximum
		 * @return value in range minimum, maximum inclusive
		 */
		public static int readInt(String prompt, int min, int max){
			
			int number;//valid number
			
			System.out.print(prompt);
			
			//loop until user enter an integer
			while (true){
				try{
					number = Integer.parseInt(scanner.nextLine());
					if (number < min && number > max){
						System.out.printf("Please enter number between %d and %d inclusive. Try again: ", min, max);
					}else{
						break;
					}
				}catch(NumberFormatException e){
					System.out.print("Invalid input. Try again: ");
				}//end try
			}//end while
			
			return number;
		}
		
		/**
		 * choose relation
		 * @return valid relation
		 */
		public static String chooseRelation(){
			
			String relation;//valid relation
			
			System.out.println("Please choose relation (friend, spouse, parent): ");
			
			//loop until user enter an integer
			while (true){
				relation = scanner.nextLine();
				
				//ignore this command
				if (relation.equals("")){
					return "";
				}
				
				if (!relation.equalsIgnoreCase("friend") && !relation.equalsIgnoreCase("spouse")
						&& !relation.equalsIgnoreCase("parent")){
					System.out.printf("Invalid selection. Try again: ");
				}else{
					break;
				}
			}//end while
			
			return relation;
		}
		
		/**
		 * read a string and validate not empty
		 * @param prompt
		 * @return not empty string
		 */
		public static String readString(String prompt){
			
			String string;//valid string
			
			System.out.print(prompt);
			
			//loop until user enter a valid string
			while (true){
					string = scanner.nextLine();
					if (string.equals("")){
						System.out.print("Invalid input. Try again: ");
					}else{
						break;
					}
			}//end while
			
			return string;
		}

		
	

}


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//PhonebookPerson Class
public class PhonebookPerson {

	private String firstName;
	private String lastName;
	private String fullName;
	private String telephoneNumber;
	
	
	Scanner input = new Scanner(System.in);
	
	static String[] tempRead = new String[10];
	
	static String[] people = new String[10];
	

	public void addNewEntry() {
		
		System.out.println("Please Add A New Entry With The Following Syntax:");
		System.out.println("John Doe, 114 Market St, St Louis, MO, 63403, 6366435698");
	
        int i = 0; 
        
        int j = 0;
        
		while (input.hasNextLine()){
		    
			String read = input.nextLine();
			tempRead[j] = read;
		
			j++;
			
		    if(read == null || read.isEmpty()){ //if the line is empty
		    	j = 0;
		        break;  //exit the loop
		    }
		  
		}
		
        // iterating over an array 
        for (i = 0; i < people.length; i++) { 
        	
        		if (tempRead[j].length() == 0) {
        			break;
        		}
        		
          	//checks if array is empty
            	if (people[i] == null) {
           		
            	people[i] = tempRead[j];
            
            	
            	System.out.println();
            	j++;
            	
            	} 
         
            	if ((i == people.length - 1) && (people[i] != null)) {
            		
            		System.out.println("\nExceeded number of stored entries!"
            				+ " Entry not successful.\n");
            		
            	}
           	
            }//End For Loop
        System.out.println("\nEnd of entry session.");
	 }
        	
	public void searchFirstName() {

		
		boolean matchFound = false;
		System.out.println("Please enter the first name:");
		
		String inputedFirstName = input.nextLine();
		
		System.out.println("\nOutput: \n");
		for (int i = 0; i < people.length; i++) {
			
        	if (people[i] != null) {
        		//splits array into seperate lines
        		//System.out.println(people[i]);
        		
        		String line = people[i];
				String[] parsedLine = line.split(",");
				
				String arrayFullName = null;
				
				arrayFullName = parsedLine[0];
				
				
				 parsedLine = arrayFullName.split(" ");				
				
				 if (inputedFirstName.equalsIgnoreCase(parsedLine[0])) {
					 matchFound = true;
					 //System.out.println("Match found");
					 //System.out.println(people[i]);
					 
					 printPerson(i);
					 
				 }
				 
				 
				
        		
        	}
      } 
				if (!matchFound) {
					System.out.println("\nSorry no matches found!");
				}
		
		
	}
	
	public void searchLastName() {
		
		boolean matchFound = false;
		System.out.println("Please enter the last name:");
		
		String inputedLastName = input.nextLine();
		
		System.out.println("\nOutput: \n");
		for (int i = 0; i < people.length; i++) {
			
        	if (people[i] != null) {
        		//splits array into seperate lines
        		//System.out.println(people[i]);
        		
        		String line = people[i];
				String[] parsedLine = line.split(",");
				
				String arrayFullName = null;
				
				arrayFullName = parsedLine[0];
				
				//prints out full name
				//System.out.println(arrayFullName);
				
				 parsedLine = arrayFullName.split(" ");
				 
				 //Tests for first name: System.out.println(parsedLine[0]);				
				 int lastNameIndex = parsedLine.length - 1;
				 if (inputedLastName.equalsIgnoreCase(parsedLine[lastNameIndex])) {
					 matchFound = true;
					 //System.out.println("Match found");
					 
					 printPerson(i);
					 
					 //System.out.println(people[i]);
				 }
				 
		
        	}
      } 
				if (!matchFound) {
					System.out.println("\nSorry no matches found!");
				}
		
		
	}
	
	public void searchFullName() {

		
		boolean matchFound = false;
		System.out.println("Please enter the full name:");
		
		String inputedFullName = input.nextLine();
		
		System.out.println("\nOutput: \n");
		for (int i = 0; i < people.length; i++) {
			
        	if (people[i] != null) {
        	
        		String line = people[i];
				String[] parsedLine = line.split(",");
			
				
				 if (inputedFullName.equalsIgnoreCase(parsedLine[0])) {
					 matchFound = true;
					 //System.out.println("Match found");
					 
					 printPerson(i);
					 
	
				 }
				 
		
        	}
      } 
				if (!matchFound) {
					System.out.println("\nSorry no matches found!");
				}
		
		
	}
	
	public void searchCityState() {
		
		boolean matchFound = false;
		
		int answer = 10;
		
		int searchMethod = 0;
		String searchString= "";
		
		do {	
			System.out.println("\nWould you like to search by City or State?");
			System.out.println(" (Enter '1' for CITY and '0' for STATE)");
		
			answer = input.nextInt();
			
			if (answer == 1) {
				searchMethod = 2;
				searchString = "City \n  (Example - Hillside)";
				break;
			}
			else if (answer == 0) {
				searchMethod = 3;
				searchString = "State \n  (Example - NJ)";
				break;
			}
			else {
				System.out.println("Error, try again");
			}	
		
		}
		while (answer != 1 || answer != 0);
		
		input.nextLine();
		
		System.out.println("Please enter the " + searchString + ":");
		
		String inputedValue = input.nextLine();
		
		System.out.println("\nOutput: \n");
		for (int i = 0; i < people.length; i++) {
			
        	if (people[i] != null) {
        		//splits array into seperate lines
        		
        		
        		String line = people[i];
				String[] parsedLine = line.split(", ");
				
				 if (inputedValue.equalsIgnoreCase(parsedLine[searchMethod])) {
					 matchFound = true;
					 //System.out.println("Match found");
					 printPerson(i);
				
				 }
				 
		
        	}
      } 
				if (!matchFound) {
					System.out.println("\nSorry no matches found!");
				}
		
	}
	
	public void searchZipcode() {

		boolean matchFound = false;
		System.out.println("Please enter the zipcode:");
		
		String inputedZipcode = input.nextLine();
		
		System.out.println("\nOutput: \n");
		for (int i = 0; i < people.length; i++) {
			
        	if (people[i] != null) {
        		//splits array into seperate lines
        		//System.out.println(people[i]);
        		
        		String line = people[i];
				String[] parsedLine = line.split(", ");
				
				 if (inputedZipcode.equalsIgnoreCase(parsedLine[4])) {
					 matchFound = true;
					 //System.out.println("Match found");
					 //System.out.println(people[i]);
					 printPerson(i);
				 }
				 
		
        	}
      } 
				if (!matchFound) {
					System.out.println("\nSorry no matches found!");
				}
		
			
	}
	
	public void searchTelephone() {
		
		boolean matchFound = false;
		
		System.out.println("Please enter the telephone number:");
		
		String inputedTelephoneNumber = input.nextLine();
		
		System.out.println("\nOutput: \n");
		
		for (int i = 0; i < people.length; i++) {
			
        	if (people[i] != null) {
        		//splits array into seperate lines
        		//System.out.println(people[i]);
        		
        		String line = people[i];
				String[] parsedLine = line.split(",");
				parsedLine[5] = parsedLine[5].replaceAll("\\s", "");
				
				if (inputedTelephoneNumber.equalsIgnoreCase(parsedLine[5])) {
					matchFound = true;
					//System.out.println("Match found");
					//System.out.println(people[i]);
					
					printPerson(i);
					
				 }
			
        	}
		} 
		
		if (!matchFound) {
			System.out.println("\nSorry no matches found!");
		}
		
	}
	
	public void deleteEntry() {
		
		boolean matchFound = false;
		
		System.out.println("Please enter the telephone number of entry you would like to delete:");
		
		String inputedTelephoneNumber = input.nextLine();
		
		System.out.println("\nOutput: \n");
		
		for (int i = 0; i < people.length; i++) {
			
        	if (people[i] != null) {
        		//splits array into seperate lines
        		//System.out.println(people[i]);
        		

        		String line = people[i];
				String[] parsedLine = line.split(",");
				parsedLine[5] = parsedLine[5].replaceAll("\\s", "");
				
				
				if (inputedTelephoneNumber.equalsIgnoreCase(parsedLine[5])) {
					matchFound = true;
					System.out.println("Match found: \n");
					//System.out.println(people[i]);
					
					printPerson(i);
				
					int answer = 10;
					
					do{	
						
						System.out.println("\n Are you sure you want to delete this entry? This is not reversible!");
						System.out.println("(Enter '1' for YES and '0' for NO)");
					
						answer = input.nextInt();
					
						
						if (answer == 1) {
							System.out.println("\nEntry deleted");
							people[i] = null;
							break;
						}
						else if (answer == 0) {
							System.out.println("\nCanceled");
							break;
						}
						else {
							System.out.println("\nError, try again");
						}	
					
					}
					while (answer != 1 || answer != 0);
					
					
				 }
			
        	}
		} 
		
		if (!matchFound) {
			System.out.println("\nSorry no matches found!");
		}
		
	}
	
	public void updateEntry() {
		
		boolean matchFound = false;
		
		System.out.println("Please enter the telephone number of entry you would like to update:");
		
		String inputedTelephoneNumber = input.nextLine();
		
		System.out.println("\nOutput: \n");
		
		for (int i = 0; i < people.length; i++) {
			
        	if (people[i] != null) {
        		//splits array into seperate lines
        		//System.out.println(people[i]);
        		
        		String line = people[i];
				String[] parsedLine = line.split(",");
				parsedLine[5] = parsedLine[5].replaceAll("\\s", "");
				
				if (inputedTelephoneNumber.equalsIgnoreCase(parsedLine[5])) {
					matchFound = true;
					System.out.println("Match found: \n");
					//System.out.println(people[i]);
					
					printPerson(i);
					
				
					
					//System.out.println(people[i]);
				
					int answer = 10;
					
					do{	
						
						System.out.println("\n Are you sure you want to update this entry? This is not reversible!");
						System.out.println(" (Enter '1' for YES and '0' for NO)");
					
						answer = input.nextInt();
					
						
						if (answer == 1) {
							
							String inputedString;
							
							System.out.println("Please update entry with the following syntax:");
							System.out.println("John Doe, 114 Market St, St Louis, MO, 63403, 6366435698");
							
							input.nextLine();
							
							inputedString = input.nextLine();
							
							people[i] = inputedString;
							
							System.out.println("\nEntry updated Succesffuly");
							
							
							break;
							
						}
						else if (answer == 0) {
							System.out.println("\nCanceled");
							break;
						}
						else {
							System.out.println("\nError, try again");
						}	
					
					}
					while (answer != 1 || answer != 0);
					
					
				 }
			
        	}
		} 
		
		if (!matchFound) {
			System.out.println("\nSorry no matches found!");
		}
		
	}
	
	public void printArray() {
		
		int i = 0;
		
		//Arrays.sort(people); with nulls
		Arrays.sort(people, new Comparator<String>() {
		    
		int nullCounter = 0;
			
		    public int compare(String o1, String o2) {
		        if (o1 == null && o2 == null) {
		            return 0;
		        }
		        if (o1 == null) {
		            return 1;
		        }
		        if (o2 == null) {
		            return -1;
		        }
		        return o1.compareTo(o2);
		}});
		
        // iterating over an array 
		
		System.out.println("\n***Current Directory***\n");
		
		int nullCounter = 0;
		
        for (i = 0; i < people.length; i++) {
        	
        	if (people[i] != null) {
        		
        		String line = people[i];
				String[] parsedLine = line.split(",");
				
				String arrayFullName = parsedLine[0] + ",";
				String arrayAddress = parsedLine[1]+ "," + parsedLine[2] + ","
					                + parsedLine[3]+ "," + parsedLine[4]+ ", ";
				
				
				String arrayTelephone = parsedLine[5];
				

				arrayTelephone = "(" + arrayTelephone.charAt(1) + arrayTelephone.charAt(2) + arrayTelephone.charAt(3) + ")" + " " +
						arrayTelephone.charAt(4) + arrayTelephone.charAt(5) + arrayTelephone.charAt(6) + " - " + arrayTelephone.charAt(7)
						+ arrayTelephone.charAt(8) + arrayTelephone.charAt(9) + arrayTelephone.charAt(10);
				//prints out telephone in (xxx) xxx - xxxx format
				
				
				
        		
        		System.out.println(arrayFullName + arrayAddress + arrayTelephone);
        	}
        	
        	
        	else if (people[i] == null) {
        		
        		nullCounter += 1;
        		
        		if (nullCounter == people.length) {
            		System.out.println("\nDirectory is empty!\n\nPlease add an entry to search.");
            	}
        		
        	}
        	
        	
      }
        	
       System.out.println("\n***End of list***");
        

	}
		
	public void printPerson(int index) {
		
		String line = people[index];
		String[] parsedLine = line.split(",");
		
		String arrayFullName = parsedLine[0] + ",";
		String arrayAddress = parsedLine[1]+ "," + parsedLine[2] + ","
			                + parsedLine[3]+ "," + parsedLine[4]+ ",";
		
		
		String arrayTelephone = parsedLine[5];
		
		arrayTelephone = " (" + arrayTelephone.charAt(1) + arrayTelephone.charAt(2) + arrayTelephone.charAt(3) + ")" + " " +
				arrayTelephone.charAt(4) + arrayTelephone.charAt(5) + arrayTelephone.charAt(6) + " - " + arrayTelephone.charAt(7)
				+ arrayTelephone.charAt(8) + arrayTelephone.charAt(9) + arrayTelephone.charAt(10);
		//prints out telephone in (xxx) xxx - xxxx format
		
		
		
		
		System.out.println(arrayFullName + arrayAddress + arrayTelephone);
		
	}
	
	public void setFirstName(String fName) {
		
		this.firstName = fName;
		
	}
	
	public void setLastName(String lName) {	
		this.lastName = lName;
	}
	
	public void setTelephone(String telephone) {	
		this.telephoneNumber = telephone;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getTelephone() {
		return this.telephoneNumber;
	}
	
	public String toString() {
		return this.fullName + "," + this.telephoneNumber;
		
	}
	
}


import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		PhonebookPerson person = new PhonebookPerson();
		
	
	    
	
	    
		
		System.out.println("**** Welcome to the Phonebook Beta ****");
		
		
		
		int programOption;
		programOption = 0;
		
		do {
			
		System.out.println("\nPlease enter a corresponding number below: ");
		System.out.println("");
		System.out.println("- (1) Add a new entry");
		System.out.println("- (2) Search by first name");
		System.out.println("- (3) Search by last name");
		System.out.println("- (4) Search by full name");
		System.out.println("- (5) Search by city or state");
		System.out.println("- (6) Search by zipcode");
		System.out.println("- (7) Search by telephone");
		System.out.println("- (8) Show all stored records");
		System.out.println("- (9) Update records by telephone");
		System.out.println("- (10) Delete records by telephone");
		System.out.println("- (11) Exit");
		
		programOption = input.nextInt();
		
		
		switch (programOption) {
		
		case 1:
			System.out.println("\nYou Choose Option 1\n");
			person.addNewEntry();
			break;
			
		case 2:
			System.out.println("\nYou Choose Option 2!\n");
			person.searchFirstName();
			break;
			
		case 3:
			System.out.println("You Choose Option 3!");
			person.searchLastName();
			break;
			
		case 4:
			System.out.println("\nYou Choose Option 4!\n");
			person.searchFullName();
			break;
			
		case 5:
			System.out.println("\nYou Choose Option 5!\n");
			person.searchCityState();
			break;
			
		case 6:
			System.out.println("\nYou Choose Option 6!\n");
			person.searchZipcode();
			break;
			
		case 7:
			System.out.println("\nYou Choose Option 7!\n");
			person.searchTelephone();
			break;
			
		case 8:
			System.out.println("\nYou Choose Option 8!\n");
			person.printArray();
			break;
			
		case 9:
			System.out.println("\nYou Choose Option 9!\n");
			person.updateEntry();
			
			break;
			
		case 10:
			System.out.println("\nYou Choose Option 10!\n");
			person.deleteEntry();
			break;
			
		case 11:
			System.out.println("\nYou Choose Option 11!\n");
			System.out.println("Thanks for using the Phonebook beta!");
			break;
				
			
		default:
			System.out.println("\nError. Please choose a valid option listed.\n");
			

			}
		}
		
		while (programOption != 11) ; 
			
	}

}

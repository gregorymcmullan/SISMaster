import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class NameSort implements Comparator<Student>
	{
public int compare(Student s1, Student s2) {
	return s1.getLastName().compareTo(s2.getLastName());
}
public static void askToSort() {
	System.out.println("\t(1) sort by last name");
	System.out.println("\t(2) sort by GPA");
	System.out.println("\t(3) sort by period");
	System.out.println("\t(4) return to main menu");
	
	Scanner userInput = new Scanner(System.in);
	int menuChoice= userInput.nextInt();
	if(menuChoice == 1) {
		Collections.sort(Database.roster, new NameSorter());
		
	}else if(menuChoice==2) {
		Collections.sort(Database.roster,newGPASorter());
		
	}else if(menuChoice == 3) displayPeriodSorterMenu();
		
	else {
		displayAddDeleteMenu();
	
	
	}
	SISRunner.displayData();
	
	
	
	
	
	
	
	
	
	
	

}
public static void displayPeriodSorterMenu() {
	
}

	}


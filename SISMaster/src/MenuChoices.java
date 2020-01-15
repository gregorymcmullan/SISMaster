import java.util.Collections;
import java.util.Comparator;
import java.util.Comparator;
import java.util.Scanner;
public class MenuChoices 
	{
		
		public static void askToSort() {
			System.out.println("\t(1) sort by last name");
			System.out.println("\t(2) sort by GPA");
			System.out.println("\t(3) sort by period");
			System.out.println("\t(4) return to main menu");
			
			Scanner userInput = new Scanner(System.in);
			int menuChoice= userInput.nextInt();
			if(menuChoice == 1) {
				Collections.sort(SISRunner.roster, new NameSorter());
				
			}else if(menuChoice==2) {
				Collections.sort(SISRunner.roster, newGPASorter());
				
			}else if(menuChoice == 3) displayPeriodSorterMenu();
				
			else {
				displayAddDeleteMenu();
			
			
			}
			SISRunner.displayData();
			
			
			
			
			
			
			
			
			
			
			

		}
		private static void displayAddDeleteMenu()
			{
				// TODO Auto-generated method stub
				
			}
		private static void displayPeriodSorterMenu()
			{
				// TODO Auto-generated method stub
				
			}
		private static Comparator newGPASorter()
			{
				// TODO Auto-generated method stub
				return null;
			}


	}






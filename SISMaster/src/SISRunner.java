
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class SISRunner
	{
		
		// Please place all of the main static variables here VVVVVVV
		static ArrayList<Student> roster = new ArrayList<Student>();
		static DecimalFormat decFor = new DecimalFormat("0.00");
		static Scanner userIntInput = new Scanner(System.in);
		
		public static void main(String[] args) throws FileNotFoundException
			{
				FileReader.readFile();
				GPACalculator.calculateGPAForEachStudent();
				MainMenu.printMainMenu();
				Submenus.addOrDelete();

				//testArrayList();
			}
		
		public static void testArrayList()
			{
				for(Student t: roster)
					{
						System.out.println(t.getFirstName() + " " + t.getLastName() + " " + t.getGradePointAverage());
					}
			}

		public static void displayData()
			{
				// TODO Auto-generated method stub
				
			}

	}






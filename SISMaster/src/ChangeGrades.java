import java.util.Scanner;

public class ChangeGrades
{

	public static void changeGrades()
	{
		
		//var
		String fName;
		String lName;
		int period;
		int switchPeriod;
		String temp;
		Scanner strInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);
		
		//getStudent
		System.out.println("Enter Student's First Name");
		System.out.print("Input: ");
		fName = strInput.nextLine();
		System.out.println("Enter Student's Last Name");
		System.out.print("Input: ");
		lName = strInput.nextLine();
		
		//getClass
		System.out.println("Enter a Class Period Number");
		System.out.print("Input: ");
		period = intInput.nextInt();
		System.out.println("Enter a Class Period Number to Swich With");
		System.out.print("Input: ");
		switchPeriod = intInput.nextInt();
		
		//switchClasses
		for (int i = 0; i < SISRunner.roster.size(); i++)
		{
			
			if (SISRunner.roster.get(i).getFirstName() == fName && SISRunner.roster.get(i).getFirstName() == lName)
			{
				
				SISRunner.roster.get(i).getFirstClass;
				
			}
			
		}
		
	}
	
}

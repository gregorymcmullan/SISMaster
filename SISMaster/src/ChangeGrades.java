import java.util.Scanner;

public class ChangeGrades
{

	public static void changeGrades()
	{
		
		//var
		String fName;
		String lName;
		String[] gSchedule;
		int period;
		String nGrade;
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
		System.out.println("Enter a New Grade");
		System.out.print("Input: ");
		nGrade = strInput.nextLine();
		
		//changeGrade
		for (int i = 0; i < SISRunner.roster.size(); i++)
		{
			
			if (SISRunner.roster.get(i).getFirstName() == fName && SISRunner.roster.get(i).getFirstName() == lName)
			{
				
				gSchedule = new String[] { SISRunner.roster.get(i).getFirstGrade(),
						SISRunner.roster.get(i).getSecondGrade(), SISRunner.roster.get(i).getThirdGrade() };
				gSchedule[period] = nGrade;
				SISRunner.roster.get(i).setFirstGrade(gSchedule[0]);
				SISRunner.roster.get(i).setSecondGrade(gSchedule[1]);
				SISRunner.roster.get(i).setThirdGrade(gSchedule[2]);
				
			}
			
		}
		
	}
	
}

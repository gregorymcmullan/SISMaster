import java.util.Scanner;

public class ChangeSchedule
{

	public static void changeSchedule()
	{

		// var
		String fName;
		String lName;
		int period;
		int switchPeriod;
		String cTemp;
		String gTemp;
		String[] cSchedule;
		String[] gSchedule;
		Scanner strInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);

		// getStudent
		System.out.println("Enter Student's First Name");
		System.out.print("Input: ");
		fName = strInput.nextLine();
		System.out.println("Enter Student's Last Name");
		System.out.print("Input: ");
		lName = strInput.nextLine();

		// getClass
		System.out.println("Enter a Class Period Number");
		System.out.print("Input: ");
		period = intInput.nextInt();
		System.out.println("Enter a Class Period Number to Swich With");
		System.out.print("Input: ");
		switchPeriod = intInput.nextInt();

		// switchClassesWithGrades
		for (int i = 0; i < SISRunner.roster.size(); i++)
		{

			if (SISRunner.roster.get(i).getFirstName() == fName && SISRunner.roster.get(i).getFirstName() == lName)
			{

				//classes
				cSchedule = new String[] { SISRunner.roster.get(i).getFirstClass(),
						SISRunner.roster.get(i).getSecondClass(), SISRunner.roster.get(i).getThirdClass() };
				cTemp = cSchedule[period];
				cSchedule[period] = cSchedule[switchPeriod];
				cSchedule[switchPeriod] = cTemp;
				SISRunner.roster.get(i).setFirstClass(cSchedule[0]);
				SISRunner.roster.get(i).setSecondClass(cSchedule[1]);
				SISRunner.roster.get(i).setThirdClass(cSchedule[2]);
				
				//grades
				gSchedule = new String[] { SISRunner.roster.get(i).getFirstGrade(),
						SISRunner.roster.get(i).getSecondGrade(), SISRunner.roster.get(i).getThirdGrade() };
				gTemp = gSchedule[period];
				gSchedule[period] = gSchedule[switchPeriod];
				gSchedule[switchPeriod] = gTemp;
				SISRunner.roster.get(i).setFirstGrade(gSchedule[0]);
				SISRunner.roster.get(i).setSecondGrade(gSchedule[1]);
				SISRunner.roster.get(i).setThirdGrade(gSchedule[2]);

			}

		}

	}

}

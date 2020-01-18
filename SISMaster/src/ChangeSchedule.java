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
		String temp;
		String[] schedule;
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

		// switchClasses
		for (int i = 0; i < SISRunner.roster.size(); i++)
		{

			if (SISRunner.roster.get(i).getFirstName() == fName && SISRunner.roster.get(i).getFirstName() == lName)
			{

				schedule = new String[] { SISRunner.roster.get(i).getFirstClass(),
						SISRunner.roster.get(i).getSecondClass(), SISRunner.roster.get(i).getThirdClass() };
				temp = schedule[period];
				schedule[period] = schedule[switchPeriod];
				schedule[switchPeriod] = temp;
				SISRunner.roster.get(i).setFirstClass(schedule[0]);
				SISRunner.roster.get(i).setSecondClass(schedule[1]);
				SISRunner.roster.get(i).setThirdClass(schedule[2]);

			}

		}

	}

}

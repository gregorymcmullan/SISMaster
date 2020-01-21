import java.util.Scanner;

public class Submenus
	{
		static int choiceOne;
		static int i;
		
		
		public static void addOrDelete()
		{
			Scanner intInput = new Scanner(System.in);
			Scanner stringInput = new Scanner(System.in);


			System.out.println("Would you like to (1) delete a student or (2) add a student?");
		
			choiceOne = intInput.nextInt();
			
			if (choiceOne == 1)
				{
					System.out.println(SISRunner.roster.get(0).getLastName());
					i = intInput.nextInt();
					
					
					SISRunner.roster.remove(i);
					System.out.println(SISRunner.roster.get(0).getLastName());

				}
			
			if (choiceOne == 2)
				{
					Scanner userInput;

					System.out.println("What is the new student's first name?");
					String firstName = stringInput.nextLine();
					
					System.out.println("What is the new student's last name?");
					String lastName = stringInput.nextLine();
					
					System.out.println("What is " + firstName + lastName + "'s first class?");
					String firstClass = stringInput.nextLine();
					
					System.out.println("What is " + firstName + lastName + "'s second class?");
					String secondClass = stringInput.nextLine();
					
					System.out.println("What is " + firstName + lastName + "'s third class?");
					String thirdClass = stringInput.nextLine();
					
					System.out.println("What is " + firstName + "'s grade in " + firstClass + "?");
					String firstGrade = stringInput.nextLine();
					
					System.out.println("What is " + firstName + "'s grade in " + secondClass + "?");
					String secondGrade = stringInput.nextLine();
					
					System.out.println("What is " + firstName + "'s grade in " + thirdClass + "?");
					String thirdGrade = stringInput.nextLine();
					
					System.out.println("Finally, what is " + firstName + lastName + "'s GPA?");
					double gpa = stringInput.nextDouble();
				

					
				}
		
		}
	}

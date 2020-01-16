import java.util.Scanner;

public class Submenus
	{
		static int choiceOne;
		static int i;
		
		
		public static void addOrDelete()
		{
			Scanner intInput = new Scanner(System.in);

			System.out.println("Would you like to (1) delete a student or (2) add a student?");
		
			choiceOne = intInput.nextInt();
			
			if (choiceOne == 1)
				{
					i = intInput.nextInt();
					
					Student.remove(i).getfirstName;
				}
			
			if (choiceOne == 2)
				{
					
				}
		
		}
	}

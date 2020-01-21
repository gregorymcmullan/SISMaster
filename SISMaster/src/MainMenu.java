
public class MainMenu
	{
		
		public static void printMainMenu()
			{
				System.out.println("What would you like to do? \n"
						+ "1) Add or delete a student? \n"
						+ "2) Change student grades / schedule \n"
						+ "3) Sort Students ");
				
				int mainMenuChoice = SISRunner.userIntInput.nextInt();
				
				
				//default for the later to do a while loop
				switch (mainMenuChoice)
				{
					case 1:
						//do the adding or deleting thing here
						break;
					case 2:
						//do the changing here
						break;
					case 3:
						//sort the students here
					default:
						System.out.println("Please enter a number between 1 and 3.");
				}
			}
		
		
	}

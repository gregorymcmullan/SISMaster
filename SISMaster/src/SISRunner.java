import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SISRunner
	{

		static ArrayList<Student> roster = new ArrayList<Student>();
		
		public static void main(String[] args) throws FileNotFoundException
			{
				FileReader.readFile();
				//testArrayList();
			}
		
		public static void testArrayList()
			{
				for(Student t: roster)
					{
						System.out.println(t.getFirstName() + " " + t.getLastName());
					}
			}

		public static void displayData()
			{
				// TODO Auto-generated method stub
				
			}

	}






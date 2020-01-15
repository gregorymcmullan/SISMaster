import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SISRunner
	{
		
		// Please place all of the main static variables here VVVVVVV
		static ArrayList<Student> roster = new ArrayList<Student>();
		
		public static void main(String[] args) throws FileNotFoundException
			{
				FileReader.readFile();
				GPACalculator.calculateGPAForEachStudent();
				//testArrayList();
			}
		
		public static void testArrayList()
			{
				for(Student t: roster)
					{
						System.out.println(t.getFirstName() + " " + t.getLastName() + " " + t.getGradePointAverage());
					}
			}

	}






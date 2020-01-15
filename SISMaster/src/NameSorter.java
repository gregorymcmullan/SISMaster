import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NameSorter implements Comparator<Student>
	{
		Collections.sort (SISRunner.roster, new NameSorter<Student>() {
		public int compare(Student s1,Student s2) {
			
			return s1.getLastName().compareTo(s2.getLastName());
		}
		};
	
		

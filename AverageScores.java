
import java.util.Scanner;
public class AverageScores {
	public static void main( String args[] ) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number of Marks: ");
		int noMarks = in.nextInt();
		int totalMark = 0;
		int avg = (totalMark / noMarks);
		System.out.println(avg);
		
		for (int i = 0; i < noMarks; i++) {
			
			System.out.print("Mark: ");
			int mark = in.nextInt();
			
			totalMark = (totalMark + mark);
			System.out.println(totalMark);

		}
	}
}
package Activity1;
//Author Dnyandev
//highest placements in the college
import java.util.Scanner;

public class HighestPlacement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//input for operator is taken by scanner
		System.out.println("enter the no of students in CSE:");
		int CSE =sc.nextInt();
		System.out.println("enter the no of students in IT:");
		int IT =sc.nextInt();
		System.out.println("enter the no of students in MECH:");
		int MECH =sc.nextInt();
		 if (MECH>IT && MECH>CSE)
         {
             System.out.println("Highest placement \n MECH ");
         }
         else if(CSE>MECH && CSE>IT)
         {
             System.out.println("Highest placement \n CSE");
         }
         else if(IT>MECH && IT>CSE)
         {
             System.out.println("Highest placement \n IT");
         }
         else if(IT==MECH)
         {
             System.out.println("Highest Placement \n IT \n MECH");
         }
         else if(CSE==IT)
         {
             System.out.println("Highest Placement \n CSE \n IT");
         }
         else if(CSE==MECH)
         {
             System.out.println("Highest Placement \n CSE \n MECH");
         }
         
	}
}



package Training;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Marks");
		int marks=sc.nextInt();
		
		if(marks>=90 && marks<=100) {
			System.out.println("O");
		}
		
	else if(marks>=80 && marks<90) {
			System.out.println("A+");
		}
		
	else if(marks>=70 && marks<80) {
		System.out.println("A");
	}
		
	else if(marks>=60 && marks<70) {
		System.out.println("B+");
	}
		
	else if(marks>=50 && marks<60) {
		System.out.println("B");
	}
		
	else if(marks>=40 && marks<50) {
		System.out.println("C");
	}
	
	else if (marks<40) {
		System.out.println("Fail");
	}
		
	}

}

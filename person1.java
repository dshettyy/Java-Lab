package persondetail;
import java.util.Scanner;

class person{
	String name;
	int age ;
	
	void ReadDetails() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter person Name: ");
		name = input.nextLine();
		System.out.print("Enter person Age: ");
		age = input.nextInt();
		
		
	}
}
class student extends person
{
	int RegNo ;
	double m1 , m2 , m3 , total , avg ;
	String result ;
	Scanner input = new Scanner (System.in);
	

	
	public void GetDetails() {
	System.out.println("Enter the student Register Number: ");
	RegNo = input.nextInt();
	
	
	System.out.println("Enter the 3 Subjects marks :");
	m1 = input.nextDouble();
	m2 = input.nextDouble();
	m3 = input.nextDouble();
	}
		
	public void Calculate()
	{
		total = m1 + m2 + m3 ;
		avg =( m1 + m2 + m3 )/3 ;
		
		if (total > 85)
		{
			result ="Distinction";
		}
		else if (total>= 60 || total <=84 )
		{
			result="Pass";
		}
		else if (total>= 35 || total <=59 )
		{
			result="Just Pass";
		}
		else 
		{
			result = "Fail";
		}
	}
	
	public void display()
	{
		System.out.print(" \t| " + name);
		System.out.print(" \t| " + age);
		System.out.print(" \t| " + RegNo);
		System.out.print(" \t| " + m1);
		System.out.print(" \t| " + m2);
		System.out.print(" \t| " + m3);
		System.out.print(" \t| " + total);		
		System.out.print(" \t| " + avg);
		System.out.print(" \t| " + result);
		System.out.println("|");
		
	}
	
}
public class person1{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		student[] ob = new student[100] ;
		
		System.out.println("Enter the total number of students :");
		int n = input.nextInt();
		
		for (int i = 0 ; i < n ; i++)
		{
			ob[i] = new student();
			ob[i].ReadDetails();
			ob[i].GetDetails();
			ob[i].Calculate();
			
		}
		System.out.println("\t___________________________________________________________________________________________");
		System.out.println("\t|Name \t|Age \tREegNO \t|M1 \t|M2 \t|M3 \t|Total \t|Average \t|Result");
		System.out.println("\t___________________________________________________________________________________________");
		
		for(int i=0 ; i<n ; i++)
		{
			ob[i].display();
			System.out.println("\t___________________________________________________________________________________________");
		}
		
		
		
		
		
		
	}
}

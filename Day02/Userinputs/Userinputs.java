import java.util.Scanner;
class Userinputs{
	public static void main(String args[]){
		String fname;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		fname=sc.nextLine();
		
		System.out.println("Enter your last name: ");
		String lname=sc.next();
		
		System.out.print("Enter your marks: ");
		int marks=sc.nextInt();
		
		System.out.println("Full name: "+fname+" "+lname+"\n"+"Marks is: "+marks);
	}
}

		
		
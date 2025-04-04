import java.util.Scanner;
class doWhileEx{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char control=' ';
		int EvenCounter=0,OddCounter=0;
		int sum=0;
		do{
			System.out.print("Enter the number to find the summation: ");
			int num = sc.nextInt();
			if(num%2==0)
			{
				EvenCounter=EvenCounter+1;
			}
			else
			{
				OddCounter=OddCounter+1;
			}
				sum=sum+num;
			System.out.print("Do you want to continue(Y/N):");
		    control = sc.next().charAt(0);
		}while (control=='Y');
		System.out.println("Summation of the numbers "+sum);
		System.out.println("Count the Even numbers of user has Entered is: "+EvenCounter);
		System.out.println("Count the odd numbers of user has Entered is: "+OddCounter);
		
	}
}
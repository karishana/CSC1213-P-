import java.util.Scanner;
class doWhileloop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char control=' ';
		int sum=0;
		do{
			System.out.print("Enter the number to find the summation: ");
			int num = sc.nextInt();
				sum=sum+num;
			System.out.print("Do you want to continue(Y/N):");
		    control = sc.next().charAt(0);
		}while (control=='Y');
		System.out.print("Summation of the numbers "+sum);
	}
}
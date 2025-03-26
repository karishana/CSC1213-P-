import java.util.Scanner;
class NestedForLoop{
	public static void main(String Args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter valur for Counter 1: ");
		int Counter1=scan.nextInt();
		System.out.print("Enter valur for Counter 2: ");
		int Counter2=scan.nextInt();
		for(int i=0; i<Counter1; i++){
			{
			System.out.println("Value for i: "+i);
			}
		for(int j=0; j<Counter2; j++)
		{
			System.out.println("Value for j: "+j);
		}
		System.out.println();
		}
		
		
	}
}
		
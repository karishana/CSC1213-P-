import java.util.Scanner;

public class Array1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			int[] numbers=new int[5];
		for (int i=0; i<5; i++){
		System.out.print("Enter the number: ");
		numbers[i]=sc.nextInt();
		}
		int sum=0;
		for (int i=0; i<5; i++){
			sum +=numbers[i];
		}
		System.out.println("The sum is: "+sum);
	}
}
		
			
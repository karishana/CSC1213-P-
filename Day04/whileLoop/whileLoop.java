import java.util.Scanner;
class whileLoop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num = sc.nextInt();
		int i=1;
		int sum=0;
		while (i<=num){
			sum=sum+i;
			i++;
		}
		System.out.print("Summation="+sum);
	}
}
		 
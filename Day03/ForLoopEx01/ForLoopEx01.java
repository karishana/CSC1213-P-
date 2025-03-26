import java.util.Scanner;
class ForLoopEx01{
	public static void main(String Args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int Number=scan.nextInt();
		for(int i=1; i<=Number; i++)
		{System.out.print(i+"\t");
		}
	}
}
		
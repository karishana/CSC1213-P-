import java.util.Scanner;
public class Ex3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[5];
		for(int i=0; i<5; i++){
			System.out.println("Enter the element: ");
			numbers[i]=sc.nextInt();
		}
		
		int max=numbers[0];
		for(int i=0; i<5; i++){
			if(numbers[i]>max)
				max=numbers[i];
		}
	System.out.println("The maximun number is : "+max);
	int min=numbers[0];
	for(int i=0; i<5; i++){
			if(numbers[i]<min)
				min=numbers[i];
			} 
			System.out.println("The minimun number is : "+min);
			
	}
}
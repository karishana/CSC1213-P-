import java.util.Scanner;

class Ex6{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size of row: ");
		int row = sc.nextInt();
		System.out.print("Enter the size of coloum: ");
		int column = sc.nextInt();
		
		int numbers [][] = new int [row][column];
		System.out.print("Enter the elements: ");
		for (int i=0;i<row;i++){
			for (int j=0;j<column;j++){
				numbers[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<row;i++){
			for (int j=0;j<column;j++){
				System.out.print(numbers[i][j] +" ");
			}
			System.out.println();
		}
		int maximum = numbers[0][0];
		int sum=0;
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				if(maximum<numbers[i][j]){
					maximum=numbers[i][j];
				}
				sum = sum+numbers[i][j];
			}
		}
		System.out.println("The maximum value is :" +maximum); 
		System.out.println("The sum is :"+sum);
	}
}	
		
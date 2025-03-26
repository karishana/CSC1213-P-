import java.util.Scanner;
class Maximum{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		 int a=ob.nextInt();
		 System.out.print("Enter the 2nd number: ");
		 int b=ob.nextInt();
		 System.out.print("Enter the 3rd number: ");
		 int c=ob.nextInt();
		 if ((a>b)&&(a>c))
		 {
			 System.out.println(a+ " is the maximum number");
		 }
		 else if ((b>c)&&(b>a))
		 {
			 System.out.println(b+ " is the maximum number");
		 }
		 else
		 {
			 System.out.println(c+ " is the maximum number");
		 }
	}
}
		 
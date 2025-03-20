import java.util.Scanner;
class StuDetails{
	public static void main(String args[]){
		String name;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter your Full name: ");
		name=sc.nextLine();
		
		System.out.print("Enter your Age: ");
		int Age=sc.nextInt();
		
		System.out.print("Enter your Registration number: ");
		String RegNo=sc.next();
		
		System.out.print("Enter your Sex: ");
		char Sex=sc.next().charAt(0);
		
		System.out.print("Enter your Mobile Number: ");
		long MobileNo=sc.nextLong();
		
		System.out.print("Enter your GPA: ");
		double GPA=sc.nextDouble();
		
		System.out.print(" Fullname: "+name+"\n"+"Age: "+Age+"\n"+"Registration Number: "+RegNo+"\n"+"Sex: "+Sex+"\n"+"Mobile Number: "+"\n"+"GPA: "+GPA);
	}
}
		
		
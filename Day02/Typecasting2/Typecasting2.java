public class Typecasting2{
	public static void main(String args[]){
		int num=5004;
		double doubleNum=(double)num;
		System.out.println("The value of "+num+" after converting to the double is " +doubleNum);
		
		int convertedInt=(int)doubleNum;
		System.out.println("The valu of "+doubleNum+" after converting in to int again is "+convertedInt);
	}
}
import java.util.Scanner;
class Vowels{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter the Character: ");
		char letter = ob.next().charAt(0);
		switch(letter){
			case'A':System.out.println("This is vowel");
			break;
			case'a':System.out.println("This is vowel");
			break;
			case'E':System.out.println("This is vowel");
			break;
			case 'e':System.out.println("This is vowel");
			break;
			case'I':System.out.println("This is vowel");
			break;
			case 'i':System.out.println("This is vowel");
			break;
			case 'O':System.out.println("This is vowel");
			break;
			case 'o':System.out.println("This is vowel");
			break;
			case 'U':System.out.println("This is vowel");
			break;
			case 'u':System.out.println("This is vowel");
			break;
			default: System.out.println("This is not a vowel");
		}
	}
}
			
		
public class Third{
	static int findMax(int a, int b, int c){
		if (a>=b && a>=c){
			return a;
		}
		if (b>=c && b>=c){
			return b;
		}
		else{
			return c;
		}
	}
	public static void main(String[] args){
		int max = findMax(10,25,15);
		int max1 = findMax(24,12,48);
		System.out.println("maximum: "+max);
	}
}
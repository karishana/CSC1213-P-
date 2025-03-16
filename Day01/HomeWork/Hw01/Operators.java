class Operators{
	public static void main(String [] args)
	{
		//unary operators 
		int num=5;
		int a=num++;
		int b=++num;
		int c=num--;
		int d=--num;
		
		System.out.println("The initial value is: "+num);
		System.out.println("The post increment is: "+a);
		System.out.println("The pre increment is: "+b);
		System.out.println("The post decrement is: "+c);
		System.out.println("The pre decrement is: "+d);	
		System.out.println();
		
		//logical operators
		boolean x=true;
		boolean y=false;
		
		//logical AND
		System.out.println("x&&y: "+(x&&y));
		//logical OR
		System.out.println("x||y: "+(x||y));
		//logical NOT
		System.out.println("!x: "+(!x));
		System.out.println("!y: "+(!y));
		System.out.println();
		
		//relational operators
		int l=10;
		System.out.println("The value of l is: "+l);
		int m=3;
		System.out.println("The value of m is: "+m);
		int n=5;
		System.out.println("The value of n is: "+n);
		
		System.out.println("l>m: "+(l>m));
		System.out.println("l<m: "+(l<m));
		System.out.println("l>=m: "+(l>=m));
		System.out.println("i<=m: "+(l<=m));
		System.out.println("l==n: "+(l==n));
		System.out.println("l!=n: "+(l!=n));
		System.out.println();
		
		//assignment operators
		int f=7;
		System.out.println("The intial value is: "+f);
		System.out.println("f+=3: "+(f+=3));
		System.out.println("f-=2: "+(f-=2));
		System.out.println("f*=4: "+(f*=4));
		System.out.println("f/=3: "+(f/=3));
		System.out.println("f%=2: "+(f%=2));
		System.out.println();
		
		//ternary operators
		int p=20, q=10, r=30, result;
		result =((p>q)?(p>r)?p:r:(q>r)?q:r);
	System.out.println("Max of three numbers= "+result);
	System.out.println();
	}
}
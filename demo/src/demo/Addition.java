package demo;

public class Addition {
	public static void add(int x, int y) {
		int z=x+y;
		System.out.println(z);
	}
	public  void sub(int x,int y) {
	
		int O=x-y;
		System.out.println(O);
	}

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
		Addition ref1=new Addition();
		ref1.sub(5,6);
		add(2,5);
		add(20,30);


	}
	 

}

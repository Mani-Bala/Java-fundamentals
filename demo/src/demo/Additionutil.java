package demo;

public class Additionutil {

	public static void main(String[] args) {
		positive();
		negative();
		partial();
		
	}
	private static void positive() {
		System.out.println("Positive Testing..");
		Addition1 ref=new Addition1();
		int res=ref.add(4,6);
		System.out.println(res);
	}
	private static void negative() {
		System.out.println("negative Testing..");
		Addition1 ref=new Addition1();
		int res=ref.add(-4,-6);
		System.out.println(res);
	}
	private static void partial() {
		System.out.println("partial Testing..");
		Addition1 ref=new Addition1();
		int res=ref.add(0,-6);
		System.out.println(res);
	}
}

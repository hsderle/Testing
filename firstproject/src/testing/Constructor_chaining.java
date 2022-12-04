package testing;

public class Constructor_chaining {
	
	public Constructor_chaining(int a) {
		this(1,1);
		System.out.println("I am in single parameter");
	}
	
	public Constructor_chaining() {
		this(1);
		System.out.println("I am in no parameter");
	}
	
	public Constructor_chaining(int a,int b) {
		
		System.out.println("I am in double");
	}


	
	public static void main(String[] args) {
	
		Constructor_chaining obj=new Constructor_chaining();
		
		
	}

}

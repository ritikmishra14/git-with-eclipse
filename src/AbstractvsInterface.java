abstract class example{
	int a;
	int b;
	public example() {
		System.out.println("yeah working");
	}
	public example(int a, int b) {
		this.a=a;
		this.b=b;
	}
	abstract void substract();
	public void add2() {
		
		System.out.println(a+b);
	}
	public static int multiply(int a, int b) {
		return a*b;
	}
}
		
		public  class AbstractvsInterface extends example{
			

	public AbstractvsInterface(int a, int b) {
//				super(a, b);
				
			}

	public static void main(String[] args) {
//		abstract class can have constructors. 
//		Abstract class can have methods with bodies without default keyword.
//		it can have non-abstract methods.
AbstractvsInterface exp1=new AbstractvsInterface(20, 10);
exp1.substract();
exp1.add2();
int h=example.multiply(20,10);
System.out.println(h);
	}

	@Override
	void substract() {
		System.out.println(a-b);
		
	}

}

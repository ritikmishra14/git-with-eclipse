package Learn_LE;

public class Lambdas2 {
	public static void main(String[] args) {
//		creating thread using runnable interface.
//		Running thread with anonymous class writing.
		Runnable r=new Runnable() {

			@Override
			public void run() {
				System.out.println("thread is running");
				
			}
			
		};
		Thread t=new Thread(r);
		t.start();
//		 Runnable implementation using lambda expression.
		Runnable r1=()-> System.out.println("thread running using lambdas..");
		Thread t1=new Thread (r1);
		t1.start();
		 
	}
	

}

@FunctionalInterface
interface PrintMsg{
	public String msg(String msg);
	public static void hi() {
		System.out.println("hi from other class");
	}
}
	
//	FI(stands for Functional Interface) can have methods of object class also.
//	String toString(); 
//		int hashcode();
	

// A FI can extend other FI if it does not have any abstract method.

@FunctionalInterface

interface sample extends PrintMsg{
	String msg(String string);
}
public class Learn_FI implements PrintMsg {
	@Override
	public String msg(String msg) {
		
		return msg;
		
	}

	public static void main(String[] args) {
//		Learn_FI learn=new Learn_FI();
//		String op=learn.msg("hello functional interface" );
//System.out.println(op);
		
		Foo foo=(String)->{
			return "hi";
		};
		foo.method("hiii");
		}
		
	}




interface Foo{
	String method(String string);
}
class UseFoo {
	String add(String string , Foo foo) {
		return foo.method(string);
		
	}
}

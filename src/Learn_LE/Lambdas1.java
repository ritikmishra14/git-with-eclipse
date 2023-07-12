package Learn_LE;

import java.util.ArrayList;
import java.util.List;

interface drawable{
	public void draw(String colour);
}

public class Lambdas1 {

	public static void main(String[] args) {
		int width=10;
//		without lambdas.
		drawable d1=new drawable() {
			
			@Override
			public void draw(String c) {
				System.out.println("drwaing width =" + width + c);
				
			}
			
		};
		d1.draw("yellow");
//		with lambdas.
//		example 1
		drawable d2=(e)-> 
		{System.out.println("drwaing "+ width + e);
		};
		d2.draw("blue");
		
//		example 2
		sayable s1=( w)->{
			return "I have nothing to say " + w;
		};
		System.out.println(s1.say("ritik"));
		
//		example 3
		adable a1= (a,  b)-> a+b;
		System.out.println(a1.add(100, 200));
		
//	example 4
		List<String> list=new ArrayList<String>();
		list.add("rohan");
		list.add("susan");
		list.add("call");
		
		list.forEach((n)->
		System.out.println(n));
		
//		example 4
		sayable str1=(message)->{ String str2="i want to say ";
		String str3= str2 + message;
		return str3;
			
		};
		String str4=str1.say("time is precious");
		System.out.println(str4);
		}

		

	}
	interface sayable{
		public String say(String name);
	}
	interface adable{
		int add(int a, int b);
	}
	



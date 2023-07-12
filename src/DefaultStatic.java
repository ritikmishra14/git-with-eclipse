// Default Methods- introduced in java 8, in an interface now we can declare method as default and that
// method can have body also which is not possible with abstract methods.

// Static Methods- methods which can be used by the class without creating object. it is class property not object.
// an interface in java 8 can have static methods.

//interface sam{
//	default void sam1() {
//		System.out.println("default method  called");
//	}
//	public void sam2();
//	
//	public static void sam3() {
//		System.out.println("static method called");
//	}
//}
public class DefaultStatic{
//	public void sam2() {
//		System.out.println("abstract method called");
//	}

	public static void main(String[] args) {
//		DefaultStatic d1=new DefaultStatic();
//		d1.sam1();
//		d1.sam2();
//		sam.sam3();
//		printmsg.hi();
//		
Car c=new Car();
System.out.println(c.getBrand());
System.out.println(c.speedUp());
System.out.println(c.slowDown());
System.out.println(c.turnAlarnOn());
System.out.println(c.turnAlarnOff());
System.out.println(Vehicle.getHorsePower(12, 13));
System.out.println();
int a=Car.num;
System.out.println(a);
	}

}

interface Vehicle {
	public String getBrand();
	public String speedUp();
	public String slowDown();
	
	default String turnAlarnOn() {
		return "Alarm is turned on";
		}
	default String turnAlarnOff() {
		return "Alarm is turned off";
		}
	public static int getHorsePower(int h, int p) {
		return h*p;
	}
	static int num=123;
}

class Car implements Vehicle{

	@Override
	public String getBrand() {
		
		return "BMW";
	}

	@Override
	public String speedUp() {
	
		return "car is speeding up";
	}

	@Override
	public String slowDown() {
		
		return "car is slowing down";
	}
	
}

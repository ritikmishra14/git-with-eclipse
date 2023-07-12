package Learn_LE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product{
	String name;
	int id;
	float price;
	
	public Product(String name, int id, float price) {
		this.name=name;
		this.id=id;
		this.price=price;
	}

	@Override
//	public String toString() {
//		return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
//	}
	
	public String toString() {
		return "name= "+ name + ", id= "+ id+ ", price= "+ price;
		
	}
}

public class Lambdas3 {

	public static void main(String[] args) {
		List<Product> info=new ArrayList<Product>();
		info.add(new Product("Hp" , 1, 25000f));
		info.add(new Product("Lenovo" , 2, 35000f));
		info.add(new Product("Dell" , 3, 15000f));
		info.add(new Product("Asus" , 3, 55000f));
		info.add(new Product("MI" , 3, 37000f));
		info.add(new Product("Mac" , 3, 80000f));
		
		System.out.println("printing without sorting\n ");
//		System.out.println(info);
		
		info.forEach((n)-> System.out.println(n));
		System.out.println("printing after sorting..\n");
		
		Collections.sort((info),(p1,p2)->{
			 return p1.name.compareTo(p2.name); });
		info.forEach((m)-> System.out.println(m));;
		
System.out.println("filtered printing whose price is more than 35000 ");

Stream filterprice=info.stream().filter(p-> p.price>35000f);

filterprice.forEach((b)->System.out.println(b));
		
}	

	}




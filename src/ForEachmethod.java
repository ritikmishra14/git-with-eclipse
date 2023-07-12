import java.util.ArrayList;
import java.util.Iterator;

public class ForEachmethod {

	public static void main(String[] args) {
	ArrayList<String> gamesList=new ArrayList<>();
	gamesList.add("cricket");
	gamesList.add("football");
	gamesList.add("basketball");
	gamesList.add("hockey");
	
	gamesList.stream().forEachOrdered((games)->System.out.println(games));;
//	gamesList.forEach(System.out::println);
	
	}

}

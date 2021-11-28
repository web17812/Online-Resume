import java.util.*;

class MapExample {

	public static void main(String args[])
	{

		// Creating object for Map.
		Map<Integer, String> map
			= new HashMap<Integer, String>();

		// Adding Elements using Map.
		map.put(103, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");

		// Elements can traverse in any order
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " "
							+ m.getValue());
		}
	}
}

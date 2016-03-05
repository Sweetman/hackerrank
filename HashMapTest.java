import java.util.*;

public class HashMapTest{
	public static void main(String[] args){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', 1);
		System.out.println(map.containsKey('a'));
	}
}
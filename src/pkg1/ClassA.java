package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassA {

	public static void main(String[] args) {
		
		List<Character> list = new ArrayList<>(Arrays.asList('a', 'b','c','d'));
		
//		list.add('a');
//		list.add('b');
//		list.add('b');
//		list.add('d');
//		list.add(null);
//		list.add(null);
		
		System.out.println(list);
		
		
		Set<Character> set = new HashSet<>();
		set.add('a');
		set.add('c');
		set.add('c');
		set.add('d');
		set.add(null);
		
		System.out.println(set);
		
		
	
	}

}

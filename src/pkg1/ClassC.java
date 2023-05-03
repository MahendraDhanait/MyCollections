package pkg1;

import java.util.HashMap;
import java.util.Map;

public class ClassC {

	public static void main(String[] args) {
		
		String s = "abbcccddddeeeeeffffffgggggggg";
		
		Map<Character, Integer> maps = new HashMap<>();
		
		for (int i=0; i<s.length(); i++) {
			int count =1;
			if (!maps.containsKey(s.charAt(i))) 
			{
				maps.put(s.charAt(i), 1);
			}
			else {
				count = maps.get(s.charAt(i));
				maps.put(s.charAt(i), count+1);
				
			}
			
		}
		System.out.println(maps);
		//Character Count
		

	}

}

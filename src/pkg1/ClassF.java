package pkg1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String s = sc.nextLine();
		
        //String s ="Shridhar Giri Shridhar Ganesh Giri";
		
        String [] arr = s.split(" ");
        
        
		Map<String, Integer> maps = new HashMap<>();
		
		for (int i=0; i<arr.length; i++) {
			int count =1;
			if (!maps.containsKey(arr[i]))
			{
				maps.put(arr[i], 1);
			}
			else {
				count = maps.get(arr[i]);
				maps.put(arr[i], count+1);
				
			}
			
		}
		System.out.println(maps);
		
		
		

	}

}

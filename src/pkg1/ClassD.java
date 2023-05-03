package pkg1;

public class ClassD {

	public static void main(String[] args) {
		
		String s = "Abcd1234@#%";
		
		String p = s.replaceAll("[0-9]", "");
		
		String q= s.replaceAll("[^0-9]", "");
		
		String d = s.replaceAll("[0-9A-z]", "");
		
		System.out.println(p+" "+q+" "+ d);

	}

}

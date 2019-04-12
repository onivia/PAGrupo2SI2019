package principal;

public class Programa {
	public static void main(String[] args) {
		String s1 = "100";
		String s2 = String.valueOf(100);
		String s3 = new String("100");
		String s4 = "100";
		String s5 = new String("100");
		
		if(s3.equals(s5))
			System.out.println("son iguales");
		else
			System.out.println("NO son iguales!");
	}
}

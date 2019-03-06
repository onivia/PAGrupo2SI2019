package principal;

public class Programa {
	public static void main(String[] args) {
		int i = 100;
		int j = 200;
		int r = 100 - 20 / 2 + i++ * 2 - ++j;
		//100 - 20 / 2 + (100) * 2 - (201)  ... i=101,j=201
		//100 - 10 + 100 * 2 - 201
		//100 - 10 + 200 - 201
		//90 + 200 - 201
		//290 - 201
		//89
		System.out.println(r);
		System.out.println(i);
		System.out.println(j);
	}
}

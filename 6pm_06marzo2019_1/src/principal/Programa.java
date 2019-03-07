package principal;

public class Programa {
	public static void main(String[] args) {
		
		//[2][3][2]
		int[][][] n1 = {
				{
					{10,20},
					{30,40},
					{50,60}
				},
				{
					{70,80},
					{90,100},
					{110,120}
				}			
		};
		System.out.println(n1[0][0].length);
//		for (int[][] dim1_2 : n1) {
//			for (int[] dim2_3 : dim1_2) {
//				for (int dim3_2 : dim2_3) {
//					System.out.println(dim3_2);					
//				}				
//			}			
//		}		
	}
}

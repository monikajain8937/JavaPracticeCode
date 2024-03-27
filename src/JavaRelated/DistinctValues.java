package JavaRelated;

public class DistinctValues {

	public static void main(String[] args) {
		int n[]= {10,12,14,10,12,14,15,1,1};
		int d = n.length;
		printDistinct(n,d);
	}
 
	private static void printDistinct(int[] n, int d) {
		for(int i=0; i<d; i++) {
			for(int j=0; j<i; j++) {
				if (n[i]==n[j]) {
					System.out.println(n[i]+ " ");
				}
			}}
	}

}

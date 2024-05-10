
public class Sample_5 {
	
	static int c = 10;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int e = ++Sample_5.c;
		System.out.println(e+" "+Sample_5.c);
		int[] a = new int[9];
		int[] b = new int[9];
		for (int i = 0; i < 9; i++) {
			a[i] = i + 1;
			b[i] = i + 1;
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int c = a[i] * b[j];
				System.out.print(c + " ");
				if (c < 10) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}

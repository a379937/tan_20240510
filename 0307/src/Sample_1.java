import ScIf.ScIf;
public class Sample_1 {

	public static void main(String[] args) {

		
		ScIf s = new ScIf();
		s.print("enter a num");
		int i = s.ifHasNext();
		System.out.println(i);
		
		
		
		/*int a = 100000;

		for (int i = 2; i <= a; i++) {
			boolean f = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					f = !f;
					break;
				}
			}
			if (f)
				System.out.println(i);
*/
		}

	}


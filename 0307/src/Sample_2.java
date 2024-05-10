
import java.util.Scanner;

public class Sample_2 {

	public static void main(String[] args) {
		while(true) {
			
		Scif a = new Scif();
		a.print("enter ");
		int i = a.ifHasNext();

		System.out.println("You enter"+i);
		}

	}

}
class Scif {
	Scanner sc = new Scanner(System.in);

	void print(String s) {
		System.out.println(s);
	}
	
	int ifHasNext() {

		while (true) {
			boolean f1 = sc.hasNextInt();
			if (!f1) {
				System.out.println("入力エラーです。整数のみを入力してください");
				sc.next();

			} else {
				
				break;
			}
		}
		int i = sc.nextInt();
		return i;
		//入力が整数でない場合、再入力させる
	}
}
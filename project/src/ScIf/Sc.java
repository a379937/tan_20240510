package ScIf;

import java.util.Scanner;

public class Sc {
	static Scanner sc = new Scanner(System.in);
	//static {System.out.println("start");}
	
	
	public Sc() {	}//デフォルトコントラスト
	
	public Sc(int i) {
		System.out.print(i);
	}//コントラスト,　宣言時にnew クラス名＋引数　可
	

	int inid = 0;
	public void inin(int i) {
		inid = i;
	} 
	public int inout() {
		return inid;
	}

	public static int id;
	public static void in(int i) {
		id = i;
	} 


	public static int out() {
		return id;
	}//static,  直接クラス名.メソッドで呼び出し可


	public static int nextInt() {

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
	public static double nextDouble() {

		while (true) {
			boolean f1 = sc.hasNextDouble();
			if (!f1) {
				System.out.println("入力エラーです。数字のみを入力してください");
				sc.next();

			} else {

				break;
			}
		}
		double i = sc.nextDouble();
		return i;
		
	}
	public static String nextString() {

		while (true) {
			boolean f1 = sc.hasNext();
			if (!f1) {
				System.out.println("入力エラーです。+ - * / のみを入力してください");
				sc.next();

			} else {

				break;
			}
		}
		String i = sc.next();
		return i;
		
	}
}

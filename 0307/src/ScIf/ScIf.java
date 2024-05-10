package ScIf;

import java.util.Scanner;

public class ScIf {
	Scanner sc = new Scanner(System.in);
	public ScIf() {	}
	
	public ScIf(int i) {
		System.out.println(i);
	}//コントラスト,　宣言時にnew クラス名＋引数　可
	
	
	
	public static int id;
	public static void in(int i) {
		id = i;
	} 
	public static int out() {
		return id;
	}//static,  直接クラス名.メソッドで呼び出し可

	public void print(String s) {
		System.out.println(s);
	}

	public int ifHasNext() {

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

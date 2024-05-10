import java.util.Scanner;

public class Sample_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int end = 0;//最後にプログラムを閉じるかのフラグ

		do {
			System.out.println("商品価格を入力してください");
			int i1 = 0;
			for (i1 = 0; i1 <= 5;) {
				boolean f1 = sc.hasNextInt();
				if (!f1) {
					System.out.println("入力エラーです。整数のみを入力してください");
					sc.next();
					i1++;
				} else {
					break;
				}
			}
			if (i1 >= 6) {
				System.out.println("強制終了します");
				break;
			} //入力が整数でない場合、再入力させる

			int price = sc.nextInt();

			System.out.println("投入金額を入力してください");

			for (int i2 = 0; i2 == 0;) {
				boolean f2 = sc.hasNextInt();
				if (!f2) {
					System.out.println("入力エラーです。整数のみを入力してください");
					sc.next();
				} else {
					i2++;
				}
			} //入力が整数でない場合、再入力させる

			int money = sc.nextInt();

			if (money < price) {

				boolean enough = false;
				int need = 0;

				while (!enough) {
					need = price - money;
					System.out.println("投入金額が" + need + "円足りません");
					System.out.println("続けて投入する場合は１を、\n投入を終了する場合は他の整数を入力してください");

					for (int ie = 0; ie == 0;) {
						boolean fe = sc.hasNextInt();
						if (!fe) {
							System.out.println("入力エラーです。整数のみを入力してください");
							sc.next();
						} else {
							ie++;
						}
					} //入力が整数でない場合、再入力させる

					int addOrNot = sc.nextInt();
					if (addOrNot == 1) {
						System.out.println("足りない金額は" + need + "円です"
								+ "\n投入金額を入力してください");

						for (int ie2 = 0; ie2 == 0;) {
							boolean fe2 = sc.hasNextInt();
							if (!fe2) {
								System.out.println("入力エラーです。整数のみを入力してください");
								sc.next();
							} else {
								ie2++;
							}
						} //入力が整数でない場合、再入力させる

						int add = sc.nextInt();
						money += add;
						if (money >= price) {
							enough = true;
						}

					} else
						break;

				}
			}

			if (money == price) {
				System.out.println("購入成功。お釣りはありません");
			} else if (money > price) {
				int charge = money - price;
				System.out.println("購入成功。お釣りは" + charge + "円です");

				int[] nums = new int[] { 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
				//10000円札から1円玉の額面

				String[] unit = { "札", "玉", "", "\n" };
				//数量詞が札か玉か、空白文字と改行符号

				boolean[] n$ = new boolean[nums.length];
				//改行するべきかを判断するフラグ

				for (int count = 0; count < nums.length; count++) {
					if (charge >= nums[count]) {
						System.out.print(nums[count] + "円" + unit[count <= 2 ? 0 : 1]
								+ charge / nums[count] + "枚 ");
						charge = charge % nums[count];
						n$[count] = true;//その額面のお釣りがあるなら、trueにする
					}
					//10000円から、各額面のお釣りの数を計算

					if (n$[0] || n$[1] || n$[2])
						System.out.print(unit[count == 2 ? 3 : 2]);
					//10000、5000、1000のいずれかがあるなら、改行

					if ((n$[3] || n$[4] || n$[5]) && (n$[6] || n$[7] || n$[8]))
						System.out.print(unit[count == 5 ? 3 : 2]);
					/*500、100、50のいずれかがある
					且つ10、5、1もいずれかがあるなら、改行*/
				}

			}

			System.out.println("\n\n" + "再度購入する場合は1を、\n終了する場合は他の整数を入力してください");
			for (int i3 = 0; i3 == 0;) {
				boolean f3 = sc.hasNextInt();
				if (!f3) {
					System.out.println("入力エラーです。整数のみを入力してください");
					sc.next();
				} else {
					i3++;
				}
			} //入力が整数でない場合、再入力させる

			end = sc.nextInt();//1が入力されたら、ループする
		} while (end == 1);
		sc.close();
	}

}

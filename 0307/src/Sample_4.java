import ScIf.ScIf;

public class Sample_4 {

	public static void main(String[] args) {

		ScIf sc = new ScIf();

		int[] ans = { 1, 2, 3, 7 };

		System.out.println("0から9までの違う整数を４つ入力してください");
		while (true) {
			int correctCount = 0;
			int correctId = 0;
			int[] enter = { -1, -1, -1, -1 };
			loop1: for (int i = 0; i <= 3; i++) {
				enter[i] = sc.ifHasNext();

				if (enter[i] < 0 || enter[i] > 9) {
					System.out.println("\nルール違反の数字です。0から9までの違う整数を入力してください");
					i--;
					continue;
				}
				for (int j = 0; j <= 3; j++) {
					if (enter[i] == enter[j] && i != j) {
						System.out.println("\n重複の数字です。0から9までの違う整数を入力してください");
						i--;
						continue loop1;
					}

				}
				System.out.print(i + 1 + "つ目の数字は" + enter[i] + "です。");

				if (i != 3) {
					System.out.println("次の数字を入力してください");
				}

			}
			System.out.println("\n入力完了。入力した数字は");
			for (int i = 0; i <= 3; i++) {
				System.out.print(enter[i] + " ");
			}
			System.out.println("です");

			for (int i = 0; i <= 3; i++) {
				for (int j = 0; j <= 3; j++) {
					if (ans[i] == enter[j]) {
						correctCount++;
						if (i == j) {
							correctId++;
						}
					}
				}
			}
			System.out.println("\n同じ数字が" + correctCount + "つあります");
			System.out.println("位置も同じな数字が" + correctId + "つあります");
			if (correctId == 4) {
				System.out.println("正解です。おめでとうございます");
				break;
			} else {
				System.out.println("\n最初から、0から9までの違う整数を４つ入力してください");
			}
		}

	}
}
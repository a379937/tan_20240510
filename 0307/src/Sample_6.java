import ScIf.ScIf;

class PrintDesk {
	public PrintDesk(int full, int[][] black, int[][] white) {

		for (int i = 0; i <= full; i++) {

			System.out.print(i);
			if (i < 10)
				System.out.print(" ");
		}
		System.out.println("");
		for (int i = 0; i < full; i++) {

			System.out.print(i + 1);
			if (i < 9)
				System.out.print(" ");

			for (int j = 0; j < full; j++) {
				if (black[i][j] != 0) {
					System.out.print("●");
				} else if (white[i][j] != 0) {
					System.out.print("○");
				} else {
					System.out.print("※");
				}

			}
			System.out.print("\n");
		}
	}

}

class Judge {
	public static String JudgeWin(int f, int[][] b, int[][] w, String who) {
		String rt = "続行";
		if (who.equals("black")) {
			loop1: for (int i = 0; i <= f - 5; i++) {
				for (int j = 0; j <= f - 5; j++) {
					int rs1 = 0;
					int rs2 = 0;
					int rs3 = 0;
					int rs4 = 0;
					for (int k = 0; k < 5; k++) {
						rs1 += b[i + k][j];
						rs2 += b[i][j + k];
						rs3 += b[i + k][j + k];
						if (j >= 5) {
							rs4 += b[i + k][j - k];
						}
					}
					if (rs1 >= 50 || rs2 >= 50 || rs3 >= 50 || rs4 >= 50) {
						rt = "黒勝";
						break loop1;
					}
				}

			}
		} else if (who.equals("white")) {
			loop2: for (int i = 0; i <= f - 5; i++) {
				for (int j = 0; j <= f - 5; j++) {
					int rs1 = 0;
					int rs2 = 0;
					int rs3 = 0;
					int rs4 = 0;
					for (int k = 0; k < 5; k++) {
						rs1 += w[i + k][j];
						rs2 += w[i][j + k];
						rs3 += w[i + k][j + k];
						if (j >= 5) {
							rs4 += w[i + k][j - k];
						}
					}
					if (rs1 == 5 || rs2 == 5 || rs3 == 5 || rs4 == 5) {
						rt = "白勝";
						break loop2;
					}
				}

			}
		}
		return rt;

	}
}

public class Sample_6 {
	public static void main(String[] args) {

		
		
		ScIf sc = new ScIf();
		final int f = 14;
		int[][] b = new int[f][f];
		int[][] w = new int[f][f];
		int b1, b2, w1, w2;

		loop1: while (true) {
			Judge rs = new Judge();

			new PrintDesk(f, b, w);
			while (true) {
				while (true) {
					System.out.println("\n黒入力行:");
					b1 = sc.ifHasNext() - 1;
					if (0 > b1 || b1 > f) {
						System.out.println("正しい数字を入力してください");
					} else
						break;
				}
				while (true) {
					System.out.println("列");
					b2 = sc.ifHasNext() - 1;
					if (0 > b2 || b2 > f) {
						System.out.println("正しい数字を入力してください");
					} else
						break;
				}
				if (b[b1][b2] == 0 && w[b1][b2] == 0) {
					b[b1][b2] = 10;
					break;
				} else {
					System.out.println("違う所に打ってください");
				}
			}
			new PrintDesk(f, b, w);

			//String rsb = rs.JudgeWin(f, b, w, "black");
			String rsb = Judge.JudgeWin(f, b, w, "black");
			switch (rsb) {
			case "黒勝":
				System.out.println(rsb);
				break loop1;
			case "続行":
				break;

			}
			while (true) {
				while (true) {
					System.out.println("\n白入力行:");
					w1 = sc.ifHasNext() - 1;
					if (0 > w1 || w1 > f) {
						System.out.println("正しい数字を入力してください");
					} else
						break;
				}

				while (true) {
					System.out.println("列");
					w2 = sc.ifHasNext() - 1;
					if (0 > w2 || w2 > f) {
						System.out.println("正しい数字を入力してください");
					} else
						break;
				}

				if (b[w1][w2] == 0 && w[w1][w2] == 0) {
					w[w1][w2] = 1;
					break;
				} else {
					System.out.println("違う所に打ってください");
				}
			}

			new PrintDesk(f, b, w);

			//String rsw = rs.JudgeWin(f, b, w, "white");
			String rsw = Judge.JudgeWin(f, b, w, "white");
			switch (rsw) {
			case "白勝":
				System.out.println(rsw);
				break loop1;
			case "続行":
				break;
			}
		}
	}
}

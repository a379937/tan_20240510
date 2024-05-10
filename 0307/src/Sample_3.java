import java.util.Scanner;

public class Sample_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int Ans = 50;
		System.out.println("enter two numbers between 0 and 100");
		
		while (true) {
			
			int ans1 = sc.nextInt();
			System.out.println("the first num is " + ans1);
			if(ans1<0||ans1>100) {
				System.out.println("enter two numbers BETWEEN 0 and 100");
				continue;
			}
			
			int ans2 = sc.nextInt();
			System.out.println("the second num is " + ans2);
			if(ans2<0||ans2>100) {
				System.out.println("enter two numbers BETWEEN 0 and 100 again");
				continue;
			}
			
			if (ans1 == ans2) {
				System.out.println("You make you answer... ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}

				System.out.println("and it's...");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				if (ans1 == Ans) {
					System.out.println("correct");
					break;
				} else
					System.out.println("uncorrect");
			}

			if (ans1 < ans2) {
			
				int i = ans1;
				ans1 = ans2;
				ans2 = i;
			}

			if (ans2 < Ans && Ans < ans1) {
				System.out.println("the answer is between them but equal to neither");
			} else if (ans2 >= Ans) {
				System.out.println("the answer is less than or equal to the both ");
			} else if (Ans >= ans1) {
				System.out.println("the answer is more than or equal to the both");
			}
			System.out.println("now enter again");

		}
sc.close();
	}

}

public class Sample_6 {

	public static void main(String[] args) {
	
		int[] ar = { 100, 3, 55, 45, 55, 55, 24, 55, 12 };

		int max = ar[0];//the biggest num
		int id = 0;//the id of max
		int e = 0;//if there are same biggest nums,e=1. better using boolean
		int same = 0;//how many biggest nums(if they exist)
		int[] equal_id = new int[ar.length];//to save the indexes of those nums
		int[] nothing = new int[ar.length];//to clean up the indexes

		for (int i = 1; i < ar.length - 1; i++) {

			if (max > ar[i]) {
				continue;
			}
			if (max < ar[i]) {
				max = ar[i];
				id = i;
				if (e == 1) {
					e = 0; //it means there is only one num that is the biggest
					equal_id = nothing;
					same = 0;  //clean up
				}

			} else if (max == ar[i]) {
				equal_id[same] = i; //save the id of the same nums
				same++; //ready for the next same num
				e = 1;

			}
		}

		System.out.println("the max num is " + max);
		if (e == 0) {
			System.out.println("the index is " + id);
		} else {
			System.out.print("the indexes are\n" + id + " ");
			for (int k = 0; k < ar.length - 1; k++) {
				if (equal_id[k] != 0) {
					System.out.print(equal_id[k] + " ");
				} else {
					break;
				}

			}
		}

	}
}
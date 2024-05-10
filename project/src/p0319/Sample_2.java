package p0319;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sample_2 {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		//2
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//3
		String localDateString = localDate.format(dateFormat);
		//4
		LocalDate monthAgoDate = localDate.minusMonths(1);
		//5
		String monthAgoDateString = monthAgoDate.format(dateFormat);
		System.out.println(monthAgoDateString);
		
	}

}

package Buffered;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayDate {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date date = new Date();
		System.out.println(sdf.format(date));
		
		
	}
}

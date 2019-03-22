package Examples;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class LegacyTime {

	public static void main(String[] args) {
		Date today=new Date();
		System.out.print(today);
		@SuppressWarnings("deprecation")
		Date yesterDay=new Date(2019,02,13);
		System.out.println(yesterDay);
        Calendar todayc=Calendar.getInstance();
        System.out.println(todayc.after(today));
        Instant i=Instant.now();
        System.out.println(i);
        LocalDateTime date=LocalDateTime.now();
        System.out.println(date);
	}

}

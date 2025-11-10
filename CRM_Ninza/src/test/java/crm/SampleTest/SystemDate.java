package crm.SampleTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SystemDate {

	public static void main(String[] args) {
		Date dateobj=new Date();
		 SimpleDateFormat simple=new SimpleDateFormat("dd-MM-yyyy");
		 String date=simple.format(dateobj);
		 System.out.println(date);
		 Calendar cal=simple.getCalendar();
		 cal.add(Calendar.DAY_OF_MONTH,15);
		 String reqdate=simple.format(cal.getTime());
		 System.out.println(reqdate);
	}

}

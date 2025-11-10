
package crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

//This class has all the java Inbuilt classes to perform few tasks
public class Java_Utiltiy {
	
	// This method generates the randmNumber
	public int getRandomNumber( int num)
	{
		Random randnum= new Random();
		int randomnum=randnum.nextInt(num);
		return randomnum;
	}
	//This method captures the current system date
	 public String getSystemDateddMMyyyy()
	 {
		 Date dateobj=new Date();
		 SimpleDateFormat simple=new SimpleDateFormat("dd-MM-yyyy");
		 String date=simple.format(dateobj);
		return date;
		 
	 }
	 //To get the required Date
	 public String getRequireddate(int days)
	 {
		 Date dateobj=new Date();
		 SimpleDateFormat simple=new SimpleDateFormat("dd-MM-yyyy");
		 simple.format(dateobj);
		 Calendar cal=simple.getCalendar();
		 cal.add(Calendar.DAY_OF_MONTH,days);
		 String reqdate=simple.format(cal.getTime());
		 return reqdate;
		 
	 }
	 //this method is to capture the current system date and time screenshot 
	 public String getSystemDateAndTimeForScreenshot() {
		 String dateAndTime = new Date().toString();
		 //Tue Jun 10 11:31:36 IST 2025
		 String dateForSS = dateAndTime.replace(" ", "_").replace(":","_");
		 return dateForSS;
		 } 
	 
}

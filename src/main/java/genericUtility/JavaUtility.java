package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.xml.crypto.Data;

public class JavaUtility {
	public String getCalenderDetails(String pattern) {
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value=sdf.format(d);
		return value;
	}
	
	/**
	 * this is the generic method used to generate random number
	 * @param bound
	 * @return
	 */
public int getrandomNumber(int bound) {
	Random r=new Random();
	int num=r.nextInt(bound);
	return num;
}
}

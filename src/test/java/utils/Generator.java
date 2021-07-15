package utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
	
	public static String dateAndHourForFile() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyyMMddhhmmss").format(timestamp);
	}

}

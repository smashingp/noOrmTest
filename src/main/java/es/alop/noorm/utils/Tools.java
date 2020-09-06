package es.alop.noorm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Tools {

	public static String dateToMysqlString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
	
}

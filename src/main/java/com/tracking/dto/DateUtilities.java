package com.tracking.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilities {
	
	
	public static String convertDateToString(Date date) {
        // Define the desired date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Format the date and return the formatted string
        return dateFormat.format(date);
    }

}

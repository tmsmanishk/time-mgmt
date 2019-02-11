package com.tms.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.tms.exception.InvalidDateFormatException;



public class DateUtil {
	
	private static String DDMMYYYY_FORMAT = "dd/MM/yyyy";
	private static String MMDDYYYY_FORMAT = "MM/dd/yyyy";
	private static String DD_MM_YYYY_HH_MM_SS_FORMAT = "dd-MM-yyyy hh:mm:ss";
	private static String DD_MMMM_YYYY_FORMAT = "dd MMMM yyyy";
	private static String DD_MMMM_YYYY_ZZZZ_FORMAT = "dd MMMM yyyy zzzz";
	private static String E_DD_MMM_YYYY_HH_MM_SS_Z_FORMAT = "E, dd MMM yyyy HH:mm:ss z";
	
	public static Date getDDMMYYYYFormatByString(String date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(DDMMYYYY_FORMAT);  
	    Date convertedDate;
		try {
			convertedDate = formatter.parse(date);
		} catch (ParseException e) {
			throw new InvalidDateFormatException("Invalid Date Format, Expecting date format is [{}]"+ DDMMYYYY_FORMAT);
		}  
	    return convertedDate;		
	}

	public static String getDDMMYYYYFormatByDate(Date date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(DDMMYYYY_FORMAT);  
	    String convertedDate= formatter.format(date);  
	    return convertedDate;		
	}
	
	public static Date getMMDDYYYYFormatByString(String date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(MMDDYYYY_FORMAT);  
	    Date convertedDate;
		try {
			convertedDate = formatter.parse(date);
		} catch (ParseException e) {
			throw new InvalidDateFormatException("Invalid Date Format, Expecting date format is [{}]"+ MMDDYYYY_FORMAT);
		}  
	    return convertedDate;		
	}

	public static String getMMDDYYYYFormatByDate(Date date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(MMDDYYYY_FORMAT);  
	    String convertedDate= formatter.format(date);  
	    return convertedDate;		
	}
	
	public static Date getDD_MM_YYYY_HH_MM_SSFormatByString(String date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(DD_MM_YYYY_HH_MM_SS_FORMAT);  
	    Date convertedDate;
		try {
			convertedDate = formatter.parse(date);
		} catch (ParseException e) {
			throw new InvalidDateFormatException("Invalid Date Format, Expecting date format is [{}]"+ DD_MM_YYYY_HH_MM_SS_FORMAT);
		}  
	    return convertedDate;		
	}

	public static String getDD_MM_YYYY_HH_MM_SSFormatByDate(Date date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(DD_MM_YYYY_HH_MM_SS_FORMAT);  
	    String convertedDate= formatter.format(date);  
	    return convertedDate;		
	}
	
	public static Date getDD_MMMM_YYYYFormatByString(String date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(DD_MMMM_YYYY_FORMAT);  
	    Date convertedDate;
		try {
			convertedDate = formatter.parse(date);
		} catch (ParseException e) {
			throw new InvalidDateFormatException("Invalid Date Format, Expecting date format is [{}]"+ DD_MMMM_YYYY_FORMAT);
		}  
	    return convertedDate;		
	}

	public static String getDD_MMMM_YYYYFormatByDate(Date date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(DD_MMMM_YYYY_FORMAT);  
	    String convertedDate= formatter.format(date);  
	    return convertedDate;		
	}
	
	public static Date getDD_MMMM_YYYY_ZZZZFormatByString(String date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(DD_MMMM_YYYY_ZZZZ_FORMAT);  
	    Date convertedDate;
		try {
			convertedDate = formatter.parse(date);
		} catch (ParseException e) {
			throw new InvalidDateFormatException("Invalid Date Format, Expecting date format is [{}]"+ DD_MMMM_YYYY_ZZZZ_FORMAT);
		}  
	    return convertedDate;		
	}

	public static String getDD_MMMM_YYYY_ZZZZFormatByDate(Date date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(DD_MMMM_YYYY_ZZZZ_FORMAT);  
	    String convertedDate= formatter.format(date);  
	    return convertedDate;		
	}
	
	public static Date getE_DD_MMM_YYYY_HH_MM_SS_ZFormatByString(String date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(E_DD_MMM_YYYY_HH_MM_SS_Z_FORMAT);  
	    Date convertedDate;
		try {
			convertedDate = formatter.parse(date);
		} catch (ParseException e) {
			throw new InvalidDateFormatException("Invalid Date Format, Expecting date format is [{}]"+ E_DD_MMM_YYYY_HH_MM_SS_Z_FORMAT);
		}  
	    return convertedDate;		
	}

	public static String getE_DD_MMM_YYYY_HH_MM_SS_ZFormatByDate(Date date) {
	    SimpleDateFormat formatter = new SimpleDateFormat(E_DD_MMM_YYYY_HH_MM_SS_Z_FORMAT);  
	    String convertedDate= formatter.format(date);  
	    return convertedDate;		
	}
}

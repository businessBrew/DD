package com.dd.DigitalDiary.constant;

import javax.servlet.http.HttpServletResponse;

public class DDCommonConstant {
	
	public static String SUCCESS_CODE="200";
	public static String SUCCESS_MESSAGE="SUCCESS";
	public static String DEFAULT_USER_PASSWORD="India@123";
	public static String USER_ACTIVATION_FLAG="Y";
	public static String USER_DEFAULT_ROLE_THROUGH_APP="USER";
	
	public static int SQL_CODE = HttpServletResponse.SC_NOT_FOUND;
	public static String SQL_EXCEPTION = "Exception while data fetching from data base";
	
	public static int DATA_ACCESSS_CODE=HttpServletResponse.SC_NOT_FOUND;
	public static String DATA_ACCESSS_EXCEPTION="Could not able to access the data source due to technical problem";
	public static int NULL_POINTER_ERROR_CODE = 103;
	public static String NULL_POINTER_EXCEPTION="Some value is passed as Null";
	public static String NO_DATA_FOUND="No Data Found for the request";
}

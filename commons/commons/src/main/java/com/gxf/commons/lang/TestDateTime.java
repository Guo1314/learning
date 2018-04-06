package com.gxf.commons.lang;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.junit.Test;

/**
 * https://www.cnblogs.com/sharpest/p/6122304.html
 */
public class TestDateTime {

	static String pattern = "yyyy-MM-dd HH:mm:ss";

	@Test
	public void nowDate() {
		String dateTime = FastDateFormat.getInstance(pattern).format(new Date());
		System.err.println(dateTime);

		String nowDate = DateFormatUtils.format(new Date(), pattern);
		System.err.println(nowDate);

		boolean isSame = DateUtils.isSameDay(new Date(), new Date()); // true
		System.err.println(isSame);
	}
}

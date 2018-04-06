package com.gxf.commons.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.BeanUtils;

public class BeanUtilsTest {

	public static void compare(Object source, Object target)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Map<String, String> userMap = BeanUtils.describe(source);
		System.err.println(userMap);

		for (Entry<String, String> entry : userMap.entrySet()) {
			System.err.println(BeanUtils.getProperty(source, entry.getKey()));
		}
	}
}

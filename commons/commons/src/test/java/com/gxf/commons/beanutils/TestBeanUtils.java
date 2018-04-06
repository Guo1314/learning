package com.gxf.commons.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;
import com.gxf.model.IDCard;
import com.gxf.model.User;
import com.gxf.model.UserZhangSan;

public class TestBeanUtils {

	@Test
	public void testCompare() {
		UserZhangSan user1 = new UserZhangSan();
		user1.setAge(1);
		user1.setName("a");

		List<String> colors = Lists.newArrayList();
		colors.add("read");
		colors.add("green");
		colors.add("blue");
		user1.setList(colors);

		User user2 = new User();
		user2.setAge(1);
		user2.setName("a");

		try {
			BeanUtilsTest.compare(user1, user2);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testCompare2() {
		IDCard idCard = new IDCard();

		UserZhangSan user1 = new UserZhangSan();
		user1.setAge(1);
		user1.setName("a");

		List<String> colors = Lists.newArrayList();
		colors.add("read");
		colors.add("green");
		colors.add("blue");
		user1.setList(colors);

		idCard.setBirthday("2018-08-15");
		idCard.setUser(user1);

		User user2 = new User();
		user2.setAge(1);
		user2.setName("a");

		try {
			BeanUtilsTest.compare(idCard, user2);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}

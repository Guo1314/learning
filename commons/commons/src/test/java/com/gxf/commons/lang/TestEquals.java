package com.gxf.commons.lang;

import org.junit.Test;

import com.gxf.model.User;

public class TestEquals {

	@Test
	public void testEquls() {
		User user1 = new User();
		user1.setAge(1);
		user1.setName("a");

		User user2 = new User();
		user2.setAge(1);
		user2.setName("a");

		System.err.println(user1);

		System.err.println(user1.equals(user2));
	}
}

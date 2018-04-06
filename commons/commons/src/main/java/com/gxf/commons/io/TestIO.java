package com.gxf.commons.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class TestIO {

	String encoding = "UTF-8";

	@Test
	public void test() throws IOException {
		File file = new File("D:" + File.separator + "test.txt");
		FileUtils.writeStringToFile(file, "test", encoding);

		String content = FileUtils.readFileToString(file, encoding);
		System.err.println(content);
	}
}

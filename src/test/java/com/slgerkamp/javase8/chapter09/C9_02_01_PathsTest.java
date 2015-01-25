package com.slgerkamp.javase8.chapter09;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class C9_02_01_PathsTest {

	private static final String bashPath = "Resources";
	private static final String absolutePath = "/user/tmp";
	private static final String relativePath = "JavaSE8-for-the-Really-Impatient/Resources";
	
	
	@Test
	public void パスを取得する(){
		String path = Paths.get(bashPath).toAbsolutePath().toString();
		assertThat(path, containsString(relativePath));
	}

	@Test
	public void 取得したパスで絶対パスを解決する(){
		Path base = Paths.get(bashPath);
		Path absolute = base.resolve(absolutePath);
		assertThat(absolute.toAbsolutePath().toString(), is(absolutePath));
		
	}

	@Test
	public void 取得したパスで相対パスを解決する(){
		Path base = Paths.get(bashPath);
		Path relative = base.resolve("tmp");
		assertThat(relative.toAbsolutePath().toString(), containsString(relativePath + "/tmp"));
	}

}

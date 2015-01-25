package com.slgerkamp.javase8.chapter09;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.nio.file.Paths;

import org.junit.Test;

import com.slgerkamp.javase8.chapter9.C9_01_01_Try_With_Resources;

public class C9_01_01_Try_With_ResourcesTest {
	
	/**
	 * AutoCloseableインタフェースを持つリソースでは、
	 * close()を明示的に実行する必要がないことを確認
	 */
	@Test
	public void ファイルがコピーされている(){
		String src ="Resources/chapter09/event.json"; 
		String dst = "Resources/chapter09/copy.json";
		C9_01_01_Try_With_Resources resource = new C9_01_01_Try_With_Resources();
		resource.copy(src, dst);
		// ファイルが作成されていることを確認する
		assertThat(Paths.get(dst).toFile().exists(), is(true));
		// 本来は内容の確認も行う
		// どうやってリソースがクローズしたか確認するの？
	}
}

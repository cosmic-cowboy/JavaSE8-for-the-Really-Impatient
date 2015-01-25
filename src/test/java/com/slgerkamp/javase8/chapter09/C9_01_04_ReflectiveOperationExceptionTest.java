package com.slgerkamp.javase8.chapter09;

import org.junit.Test;

import com.slgerkamp.javase8.chapter9.C9_01_04_ReflectiveOperationException;


/**
 * リフレクションで発生する例外処理を一元管理する
 *
 */
public class C9_01_04_ReflectiveOperationExceptionTest {


	@Test(expected=ReflectiveOperationException.class)
	public void リフレクション_クラスが存在しない() throws ReflectiveOperationException{
		C9_01_04_ReflectiveOperationException reflectiveOperationException = 
				new C9_01_04_ReflectiveOperationException();
		reflectiveOperationException.reflectionError("C", "main");
	}
	@Test(expected=ReflectiveOperationException.class)
	public void リフレクション_メソッドが存在しない() throws ReflectiveOperationException{
		C9_01_04_ReflectiveOperationException reflectiveOperationException = 
				new C9_01_04_ReflectiveOperationException();
		reflectiveOperationException.reflectionError("com.slgerkamp.javase8.chapter9.C9_01_01_Try_With_Resources", "main");
		
	}
}

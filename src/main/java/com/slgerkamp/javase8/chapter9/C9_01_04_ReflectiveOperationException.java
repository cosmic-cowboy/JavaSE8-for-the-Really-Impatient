package com.slgerkamp.javase8.chapter9;

/**
 * リフレクションで発生する例外処理を一元管理する
 *
 */
public class C9_01_04_ReflectiveOperationException {

	public void reflectionError(String className, String methodName) throws ReflectiveOperationException{
		try {
			Class.forName(className).getMethod(methodName).invoke(null, new Object[]{});
		} catch (ReflectiveOperationException e) {
			e.printStackTrace();
			throw e;
		}
	}
}

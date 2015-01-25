package com.slgerkamp.javase8.chapter9;


/**
 * 抑制された例外
 *
 */
public class C9_01_02_Suppressed {
	
	@SuppressWarnings("finally")
	public void error() throws RuntimeException{
		
		RuntimeException cachedException = null;
		try {
			throw new RuntimeException("first");			
		} catch (RuntimeException e) {
			cachedException = e;
		} finally {
			RuntimeException second = new RuntimeException("second");
			second.addSuppressed(cachedException);
            throw second;
        }
	}
}

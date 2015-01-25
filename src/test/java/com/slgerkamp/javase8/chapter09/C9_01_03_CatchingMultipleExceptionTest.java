package com.slgerkamp.javase8.chapter09;

import java.io.FileNotFoundException;
import java.net.UnknownHostException;

import org.junit.Test;

import com.slgerkamp.javase8.chapter9.C9_01_03_CatchingMultipleException;

/**
 * 複数の例外をキャッチする
 *
 */
public class C9_01_03_CatchingMultipleExceptionTest {

	@Test(expected = FileNotFoundException.class)
	public void 複数の例外をキャッチする_FileNotFoundException() throws FileNotFoundException, UnknownHostException{
		C9_01_03_CatchingMultipleException catchingMultipleException = 
				new C9_01_03_CatchingMultipleException();
		catchingMultipleException.throwMultipleException(1);
	}

	@Test(expected = UnknownHostException.class)
	public void 複数の例外をキャッチする_UnknownHostException() throws FileNotFoundException, UnknownHostException{
		C9_01_03_CatchingMultipleException catchingMultipleException = 
				new C9_01_03_CatchingMultipleException();
		catchingMultipleException.throwMultipleException(0);
	}
}

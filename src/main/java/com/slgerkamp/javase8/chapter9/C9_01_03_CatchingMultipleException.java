package com.slgerkamp.javase8.chapter9;

import java.io.FileNotFoundException;
import java.net.UnknownHostException;

/**
 * 複数の例外をキャッチする
 *
 */
public class C9_01_03_CatchingMultipleException {

	public void throwMultipleException(int exceptionNum) throws FileNotFoundException, UnknownHostException{
		try {
			if(exceptionNum == 1){
				throw new FileNotFoundException();
			} else {
				throw new UnknownHostException();
			}
		} catch (FileNotFoundException | UnknownHostException e) {
			e.printStackTrace();
			throw e;
		}
	}
}

package com.slgerkamp.javase8.chapter09;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.slgerkamp.javase8.chapter9.C9_01_02_Suppressed;

/**
 * 抑制された例外
 *
 */
public class C9_01_02_SuppressedTest {
	
	@Test
	public void エラーの取得(){
		C9_01_02_Suppressed resource = new C9_01_02_Suppressed();
		
		try{
			resource.error();			
		} catch(RuntimeException ex){
			assertThat(ex.getSuppressed()[0].getMessage(), is("first"));
			assertThat(ex.getMessage(), is("second"));
		}
	}
}

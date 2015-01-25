package com.slgerkamp.javase8.chapter9;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * AutoCloseableインタフェースを持つリソースでは、
 * close()を明示的に実行する必要がない
 *
 */
public class C9_01_01_Try_With_Resources {

	public void copy(String src, String dst){
		
		try (
			// tryブロックでcloseするリソースを宣言
			Scanner in = new Scanner(Paths.get(src));
			PrintWriter out = new PrintWriter(dst);
		){
			while(in.hasNext()){
				out.println(in.next());
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.slgerkamp.javase8.chapter9;

import java.io.IOException;
import java.io.InputStream;

import static java.nio.charset.StandardCharsets.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * ファイルの読み書き
 * テストがしづらいので、動作確認のみ
 *
 */
public class C9_02_02_Files {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("Resources/chapter09/event.json");
		Path bytesPath = Paths.get("Resources/chapter09/bytes.json");
		Path listPath = Paths.get("Resources/chapter09/list.json");
		Path streamPath = Paths.get("Resources/chapter09/stream.json");
		
		// byteで読み込み、書き込み
		byte[] bytes = Files.readAllBytes(path);
		String content = new String(bytes, UTF_8);
		System.out.println("content: " + content);
		Files.write(bytesPath, content.getBytes(UTF_8));
		
		// １行ごとに読み込み、リスト化
		List<String> lines = Files.readAllLines(path, UTF_8);
		System.out.println("lines: " + lines);
		Files.write(listPath, lines, UTF_8);
		
		// InputStreamとして読み込み
		InputStream io = Files.newInputStream(path);
		Files.copy(io, streamPath);
		// 出力先をOutputStreamにすれば、出力ストリームへのコピーも可能
	}
}

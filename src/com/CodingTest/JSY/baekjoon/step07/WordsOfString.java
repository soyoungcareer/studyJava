package com.CodingTest.JSY.baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordsOfString {

	public static void main(String[] args) throws IOException {
		// 20210628 - 백준 1152번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		//String str = st.nextToken();
		//System.out.println(st.countTokens() + 1);
		//이렇게 하면 런타임에러 발생.
		
		System.out.println(st.countTokens());
	}
}

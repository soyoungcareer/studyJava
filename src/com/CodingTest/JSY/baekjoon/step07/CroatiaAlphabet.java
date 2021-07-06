package com.CodingTest.JSY.baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlphabet {

	public static void main(String[] args) throws IOException {
		// 20210706 - 백준 2641번
		//c= c- dz= d- lj nj s= z=
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (int i = 0; i < arr.length; i++) {
			if (str.contains(arr[i])) {
				str = str.replaceAll(arr[i], "a"); //크로아티아 알파벳에 해당하는 문자를 전부 a로 치환
			}
		}
		System.out.println(str.length());
	}
}

package com.CodingTest.JSY.baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet {

	public static void main(String[] args) throws IOException {
		// 20210625 - 10809번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();

		char word[] = new char[str.length()];
		
		for (int i = 0; i < word.length; i++) {
			word[i] = str.charAt(i);
		}
		
		int alpha = 97;
		int arr[] = new int[26];
		int result[] = new int[26];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = alpha++;
			result[i] = -1;
		}
		
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (result[j] == -1) {
					if (word[i] == (char)arr[j]) {
						result[j] = i;
					}
				}
			}
		}
	
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	/*
	 * 간단한 풀이
	 *          
	 * 	Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        for (char c = 'a' ; c <= 'z' ; c++)
            System.out.print(word.indexOf(c) + " ");
	 * 
	 */

}

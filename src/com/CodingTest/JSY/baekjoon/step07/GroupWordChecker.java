package com.CodingTest.JSY.baekjoon.step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GroupWordChecker {

	public static void main(String[] args) throws IOException {
		// 20210712 - 백준 1316번
		// 제대로 이해 못함. 다시 풀어야 함.
		
		
//		입력받은 문자에서 같은 값이 연달아서 나오는 경우 문자 하나만 남기고 
//		나머지는 없애서 배열을 하나 만들고,
//		처음에 입력받은 숫자만큼 배열을 하나 더 만들어서 기본값을 0으로 넣고, 
//		남은 문자들 중에서 같은 단어 있는경우 값을 1씩 올린다음
//		배열에 0이 들어가있는 수 리턴
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int i = 0; i < num; i++) {
			String word = br.readLine();
			
			if (check(word)) {
				count++;
			}
		}
		
		
		/*
		String word[] = new String[num];
		
		for (int i = 0; i < word.length; i++) {
			word[i] = br.readLine();
			char arr[] = new char[word[i].length()];
			
			for (int j = 0; j < word[i].length(); j++) {
				arr[j] = word[i].charAt(j);
			}
			
			boolean ckArr[] = new boolean[arr.length];
			for (int j = 1; j < arr.length; j++) {
				for (int k = 0; k < j; k++) {
					if (arr[j] == arr[k]) {
						
					}
				}
			}
		}
		*/
		bw.write(count + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	public static boolean check(String word) {
		
		boolean[] check = new boolean[26];
		boolean result = true;
		int prev = 0;
		
		for (int i = 0; i < word.length(); i++) {
			int now = word.charAt(i);
			
			if (prev != now) {
				if (!check[now - 'a']) {
					check[now - 'a'] = true;
					prev = now;
				} else {
					result = false;
				}
			}
		}
		
		return result;
	}
	
	/*
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int count = num;

        for (int i = 0; i < num; i++) {
            String group = bf.readLine();
            int len = group.length();
            for (int j = 0; j < len; j++) {
                if (j < len - 1) {
                    if (group.charAt(j) != group.charAt(j + 1)) {
                        for (int k = j + 2; k < len; k++) {
                            if (group.charAt(j) == group.charAt(k)) {
                                count--;
                                k = len;
                                j = len;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
	*/
}


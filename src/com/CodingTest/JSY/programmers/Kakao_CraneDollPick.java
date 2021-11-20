package com.CodingTest.JSY.programmers;

import java.util.Stack;

public class Kakao_CraneDollPick {

	// 2019 카카오 개발자 겨울 인턴십 - 크레인 인형뽑기 게임
	public int solution(int[][] board, int[] moves) {
        /*
        인형모양 : 0~100
        board : 인형상자(정사각형)
        moves : 크레인 이동경로
        */

        // 0으로 초기화
        int answer = 0;

        // 바구니 : 후입선출구조, 정해진 방향으로만 쌓음 -> Stack 특성 활용
        Stack<Integer> bucket = new Stack<>();
        bucket.push(0); // 값 비교시 있어야하므로 0으로 빈칸 삽입

        // 크레인 움직임 순서 배열
        for (int m : moves) {
            // 정사각형 상자 위치
            for (int i = 0; i < board.length; i++) {
                // 위에서부터 찾아나가는데 비어있는 칸이 아니면,(행)
                // 크레인 움직임(열)
                if (board[i][m-1] != 0) {
                    // 바구니에 같은 인형일 경우 터뜨림
                    if (board[i][m-1] == bucket.peek()) {
                        bucket.pop();
                        answer += 2;
                    } else {
                        // 다른 인형일 경우 쌓기
                        bucket.push(board[i][m-1]);
                    }
                    // 바구니로 옮겼으므로 인형상자 빈 칸 처리
                    board[i][m-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}

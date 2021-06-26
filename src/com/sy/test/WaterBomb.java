package com.sy.test;

import java.awt.Image;

import javax.swing.ImageIcon;

import view.mainView.Main;

public class WaterBomb extends Thread {

	private int delay = 20;
	private int count;
	private int score;
	private long pretime;
	
	private Image player = new ImageIcon("../images/player.png").getImage();
	
	private int playerX, playerY;
	private int playerWidth = player.getWidth(null);
	private int playerHeight = player.getHeight(null);
	private int playerSpeed = 10;
	private int playerHp = 30;
	
	private boolean left, right;
	private boolean isOver;
	
	
	//Thread 클래스를 상속받아 run을 오버라이드 받을 수 있음.
	//run에 thread 처리하는 코드 작성하면 됨.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		reset();
		
		while (!isOver) {
			pretime = System.currentTimeMillis();
			if (System.currentTimeMillis() - pretime < delay) {
				try {
					Thread.sleep(delay - System.currentTimeMillis() + pretime);
					keyProcess();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}


	//게임 첫 시작
	//점수 등 리셋
	private void reset() {
		isOver = false;
		count = 0;
		score = 0;
		playerX = (Main.SCREEN_WIDTH - playerWidth) / 2; //가로 가운데 지점에 위치
		playerY = 700; //세로 아래에 위치
		
	}
	
	
	
	private void keyProcess() {
		//가로 가운데 지점에서 움직인 플레이어 속도만큼 빼주기 / x좌표 0초과일 때까지만 위치값에 마이너스.
		if (left && (playerX - playerSpeed) > 0) {
			playerX -= playerSpeed;
		}
		
		//가로 가운데 지점에서 플레이어 넓이와 플레이어 속도만큼 더해준 값이 스크린 가로 길이 미만일 때까지
		//위치값에 플러스.
		if (right && (playerX + playerWidth + playerSpeed) < Main.SCREEN_WIDTH) {
			playerX += playerSpeed;
		}
	}
	
}

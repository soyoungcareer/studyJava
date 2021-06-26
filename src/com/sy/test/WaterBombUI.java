package com.sy.test;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import view.mainView.Main;

public class WaterBombUI extends JFrame {

	private Image bufferImage;
	private Graphics screenGraphic;
	
	private Image mainScreen = new ImageIcon("../images/mainBackground.jpg").getImage();
	private Image gameScreen = new ImageIcon("../images/mainBackground.jpg").getImage();
	
	private boolean isMain, isGame;
	
	private WaterBomb game = new WaterBomb();
	
	public WaterBombUI() {
		
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setLocationRelativeTo(null); //화면 가운데 뜨게
		setResizable(false); //창 크기 고정
		setUndecorated(true); //타이틀바 제거
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	private void init() {
		isMain = true;
		isGame = false;
	}
	
	
	private void gameStart() {
		isMain = false;
		isGame = true;
		
		game.start();
	}
	
	
	public void paint(Graphics g) {
		bufferImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = bufferImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(bufferImage, 0, 0, null);
	}


	private void screenDraw(Graphics g) {
		if (isMain) {
			g.drawImage(mainScreen, 0, 0, null);
		}
		
		if (isGame) {
			g.drawImage(gameScreen, 0, 0, null);
		}
		
		this.repaint();
	}
	
	
}

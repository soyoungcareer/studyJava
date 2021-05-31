package com.sy.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.text.DecimalFormat;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.NumberFormatter;

public class Calculate extends JFrame {

	public Calculate() {
		//frame
		JFrame frame = new JFrame();
		frame.setTitle("Score Calculator");
		
		//panel
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 550, 550/12*9);
		panel.setLayout(null);
		panel.setBackground(new Color(232, 217, 255)); //Lavender color background
		
		//label
		JLabel label = new JLabel("Enter your score");
		label.setFont(new Font("Arial", Font.BOLD, 50));
		label.setBounds(70, 10, 500, 50);
		
		JLabel labJava = new JLabel("Java : ");
		labJava.setBounds(40, 90, 40, 30);
		
		JLabel labEng = new JLabel("English : ");
		labEng.setBounds(280, 90, 60, 30);
		
		JLabel labSum = new JLabel("Total : ");
		labSum.setBounds(40, 280, 40, 30);
		
		JLabel labAvg = new JLabel("Average : ");
		labAvg.setBounds(280, 280, 60, 30);
		
		//textField
		JFormattedTextField javaScore = new JFormattedTextField(new NumberFormatter()); //only can input numbers
		javaScore.setBounds(80, 90, 140, 30);
		javaScore.setHorizontalAlignment(SwingConstants.RIGHT); //align right side
		//JTextField javaScore = new JTextField();
		//javaScore.setBounds(80, 90, 140, 30);
		
		JFormattedTextField engScore = new JFormattedTextField(new NumberFormatter());
		engScore.setBounds(340, 90, 140, 30);
		engScore.setHorizontalAlignment(SwingConstants.RIGHT);
		//JTextField engScore = new JTextField();
		//engScore.setBounds(340, 90, 140, 30);
		
		JTextField total = new JTextField();
		total.setBounds(80, 280, 140, 30);
		total.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JTextField average = new JTextField();
		average.setBounds(340, 280, 140, 30);
		average.setHorizontalAlignment(SwingConstants.RIGHT);
		
		//button
		JButton calcBtn = new JButton("Calculate");
		calcBtn.setBounds(220, 180, 100, 40);
		
		//panel add - label, textField, button...
		panel.add(label);
		panel.add(labJava);
		panel.add(labEng);
		panel.add(labSum);
		panel.add(labAvg);
		panel.add(javaScore);
		panel.add(engScore);
		panel.add(total);
		panel.add(average);
		panel.add(calcBtn);
		
		//frame add panel
		frame.add(panel);
		
		//frame setting
		frame.setSize(550, 550/12*9);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//event
		calcBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Calculation function
				//double type result
				double numJava = Double.parseDouble(javaScore.getText());
				double numEng = Double.parseDouble(engScore.getText());
				
				double sum = numJava + numEng;
				double avg = sum / 2.0;
				
			/*	
				//int type result
				int numJava = Integer.parseInt(javaScore.getText());
				int numEng = Integer.parseInt(engScore.getText());
				
				int sum = numJava + numEng;
				int avg = sum / 2;
			*/	
				total.setText(String.valueOf(sum));
				average.setText(String.valueOf(avg));
			}
		});
	}

}

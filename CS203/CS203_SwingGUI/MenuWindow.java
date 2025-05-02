package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JFrame;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class MenuWindow {
	
	
	public JFrame menuFrame;
	public JButton carEntryButton;
	public JButton carDisplayButton;
	public JButton exitButton;
	

	public MenuWindow() {
		initialize();
	}

	private void initialize() {
		menuFrame = new JFrame();
		menuFrame.setTitle("Car Emporium");
		menuFrame.setBounds(100, 100, 450, 300);
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		menuFrame.getContentPane().setLayout(springLayout);
		
		carEntryButton = new JButton("Car Entry");
		menuFrame.getContentPane().add(carEntryButton);
		carDisplayButton = new JButton("Car Display");
		springLayout.putConstraint(SpringLayout.NORTH, carEntryButton, 0, SpringLayout.NORTH, carDisplayButton);
		springLayout.putConstraint(SpringLayout.EAST, carEntryButton, -6, SpringLayout.WEST, carDisplayButton);
		springLayout.putConstraint(SpringLayout.NORTH, carDisplayButton, 5, SpringLayout.NORTH, menuFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, carDisplayButton, 220, SpringLayout.WEST, menuFrame.getContentPane());
		menuFrame.getContentPane().add(carDisplayButton);
		
		exitButton = new JButton("Exit");
		springLayout.putConstraint(SpringLayout.NORTH, exitButton, 76, SpringLayout.SOUTH, carEntryButton);
		springLayout.putConstraint(SpringLayout.WEST, exitButton, 182, SpringLayout.WEST, menuFrame.getContentPane());
		menuFrame.getContentPane().add(exitButton);
	}
}

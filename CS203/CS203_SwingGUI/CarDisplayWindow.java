package classes;

import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;


public class CarDisplayWindow {

	public JFrame carDisplayFrame;
	JButton returnButton = new JButton("Return");
	public JTextArea carsOutput;

	public CarDisplayWindow() {
		initialize();
	
		
	}
		
		 
	private void initialize() {
		carDisplayFrame = new JFrame();
		carDisplayFrame.setTitle("Car Emporium - Car Display");
		carDisplayFrame.setBounds(100, 100, 450, 300);
		carDisplayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.WEST, returnButton, 22, SpringLayout.WEST, carDisplayFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, returnButton, -37, SpringLayout.SOUTH, carDisplayFrame.getContentPane());
		carDisplayFrame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Cars:");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, carDisplayFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, carDisplayFrame.getContentPane());
		carDisplayFrame.getContentPane().add(lblNewLabel);
		carDisplayFrame.getContentPane().add(returnButton);
		
//		carsOutput = new JTextArea();
//		springLayout.putConstraint(SpringLayout.NORTH, carsOutput, -99, SpringLayout.SOUTH, carDisplayFrame.getContentPane());
//		springLayout.putConstraint(SpringLayout.WEST, carsOutput, 672, SpringLayout.WEST, carDisplayFrame.getContentPane());
//		springLayout.putConstraint(SpringLayout.SOUTH, carsOutput, -83, SpringLayout.SOUTH, carDisplayFrame.getContentPane());
//		springLayout.putConstraint(SpringLayout.EAST, carsOutput, -174, SpringLayout.EAST, carDisplayFrame.getContentPane());
//		carDisplayFrame.getContentPane().add(carsOutput);
		
		carsOutput = new JTextArea();
		carsOutput.setEditable(false);
		springLayout.putConstraint(SpringLayout.NORTH, carsOutput, 18, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, carsOutput, 39, SpringLayout.WEST, carDisplayFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, carsOutput, -16, SpringLayout.NORTH, returnButton);
		springLayout.putConstraint(SpringLayout.EAST, carsOutput, -60, SpringLayout.EAST, carDisplayFrame.getContentPane());
		carDisplayFrame.getContentPane().add(carsOutput);
		
		
	}
}

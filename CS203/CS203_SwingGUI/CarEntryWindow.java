package classes;



import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;



public class CarEntryWindow {

	public JFrame carEntryFrame;
	
	//private JTextField textField;
	public JTextField make_Field;
	public JTextField model_Field;
	public JTextField year_Field;
	public JTextField weight_Field;
	public JTextField tankSize_Field;
	public JTextField fuelType_Field;
	public JTextField batterySize_Field;
	public JTextField batteryType_Field;
	
	public JPanel panel;
	public JComboBox<String> cb;
	
	public JButton returnButton;
	public JButton submitButton;
	
	public ButtonGroup myButtonGroup;
	public JRadioButton gas_radioButton;
	public JRadioButton electric_radioButton;
	
	String[] colors = {"Red", "Blue", "Yellow", "Silver", "Black", "Yellow", "Other"};
	
	

	
	

	public CarEntryWindow() {
		initialize();
	}

	private void initialize() {
		carEntryFrame = new JFrame();
		carEntryFrame.setTitle("Car Emporium - Car Entry");
		carEntryFrame.setBounds(100, 100, 450, 300);
		carEntryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		carEntryFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//__________________________________________________________
		//__________________________________________________________
		
		//MAKE
		JLabel lblNewLabel = new JLabel("Make:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		carEntryFrame.getContentPane().add(lblNewLabel);
		
		make_Field = new JTextField();
		carEntryFrame.getContentPane().add(make_Field);
		make_Field.setColumns(7);
		
		//__________________________________________________________
		//__________________________________________________________
		
		//MODEL
		JLabel lblNewLabel_1 = new JLabel("Model:");
		carEntryFrame.getContentPane().add(lblNewLabel_1);
		
		model_Field = new JTextField();
		carEntryFrame.getContentPane().add(model_Field);
		model_Field.setColumns(10);
		
		//__________________________________________________________
		//__________________________________________________________
		
		//YEAR
		JLabel lblNewLabel_2 = new JLabel("Year:");
		carEntryFrame.getContentPane().add(lblNewLabel_2);
		
		year_Field = new JTextField();
		carEntryFrame.getContentPane().add(year_Field);
		year_Field.setColumns(4);
		
		//__________________________________________________________
		//__________________________________________________________
		
		//WEIGHT
		JLabel lblNewLabel_3 = new JLabel("Weight:");
		carEntryFrame.getContentPane().add(lblNewLabel_3);
		
		weight_Field = new JTextField();
		carEntryFrame.getContentPane().add(weight_Field);
		weight_Field.setColumns(5);
		
		//__________________________________________________________
		//__________________________________________________________
		
		//COLORS
		panel = new JPanel();
		carEntryFrame.getContentPane().add(panel);
		
		cb = new JComboBox<String>(colors);
	
	    cb.setVisible(true);
	    panel.add(cb);
	    
	  //__________________________________________________________
	  //__________________________________________________________ 
	    
	    //ELECTRIC OR GAS
	    myButtonGroup = new ButtonGroup();
		
		gas_radioButton = new JRadioButton("Gas?");
		carEntryFrame.getContentPane().add(gas_radioButton);
		
	
		
		electric_radioButton = new JRadioButton("Electric?", true);
		carEntryFrame.getContentPane().add(electric_radioButton);
		
		
		myButtonGroup.add(electric_radioButton);
		myButtonGroup.add(gas_radioButton);
		
		//__________________________________________________________
		//__________________________________________________________
			
		//GAS CAR OPTIONS
		JLabel lblNewLabel_4 = new JLabel("Tank Size:");
		carEntryFrame.getContentPane().add(lblNewLabel_4);
		
		tankSize_Field = new JTextField();
		carEntryFrame.getContentPane().add(tankSize_Field);
		tankSize_Field.setColumns(10);
		
		
	
		
		JLabel lblNewLabel_5 = new JLabel("Fuel Type:");
		carEntryFrame.getContentPane().add(lblNewLabel_5);
		
		fuelType_Field = new JTextField();
		carEntryFrame.getContentPane().add(fuelType_Field);
		fuelType_Field.setColumns(10);
		
		
		fuelType_Field.setEditable(false);
		tankSize_Field.setEditable(false);
		tankSize_Field.setBackground(Color.GRAY);
		fuelType_Field.setBackground(Color.GRAY);
		
		//__________________________________________________________
		//__________________________________________________________
		
		//ELECTRIC CAR OPTIONS
		JLabel lblNewLabel_6 = new JLabel("Battery Size:");
		carEntryFrame.getContentPane().add(lblNewLabel_6);
		
		batterySize_Field = new JTextField();
		carEntryFrame.getContentPane().add(batterySize_Field);
		batterySize_Field.setColumns(10);
		
		
		JLabel lblNewLabel_7 = new JLabel("Battery Type");
		carEntryFrame.getContentPane().add(lblNewLabel_7);
		
		batteryType_Field = new JTextField();
		carEntryFrame.getContentPane().add(batteryType_Field);
		batteryType_Field.setColumns(10);
		
		
		//__________________________________________________________
		//__________________________________________________________
		
		
		
		submitButton = new JButton("Submit");
		carEntryFrame.getContentPane().add(submitButton);
		
		returnButton = new JButton("Return");
		carEntryFrame.getContentPane().add(returnButton);
		
		//__________________________________________________________
	}

}

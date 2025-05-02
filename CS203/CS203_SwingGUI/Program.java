package classes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;







@SuppressWarnings("serial")
public class Program implements Serializable{
	
	private static CarDisplayWindow carDisplayWindow;
	private static CarEntryWindow carEntryWindow;
	private static MenuWindow menuWindow;
	
	private static List<Car> cars = new ArrayList<Car>();
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		File file = new File("/Users/charlesiv/Desktop/cars.txt");
		if(file.canRead() && file.isFile()) {
			
			try {
			
			FileInputStream fs = new FileInputStream(file);
			ObjectInputStream os = new ObjectInputStream(fs);
			
			
			System.out.println("Object" + os.readObject());
			
			//cars = (List<Car>) os.readObject();
			
			
				
			
			
			
			fs.close();
			os.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
			
		}	else {System.out.println("Not Reading");}
			
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					
				try {
			
					carDisplayWindow = new CarDisplayWindow();
					carEntryWindow = new CarEntryWindow();
					menuWindow = new MenuWindow();
					menuWindow.menuFrame.setVisible(true);
					carEntryWindow.carEntryFrame.setVisible(false);
					carDisplayWindow.carDisplayFrame.setVisible(false);
							
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				//////////////////////Menu Window --- 2 Buttons//////////////////////////
	
				
				//CAR DISPLAY BUTTON --> open view cars window,, close menu
				menuWindow.carDisplayButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						carDisplayWindow.carDisplayFrame.setVisible(true);
						menuWindow.menuFrame.setVisible(false);
						
						
						String res = "";
						for(Car c : cars) {
							res += c + "\n";
							System.out.println(c);
						
						
						
					}carDisplayWindow.carsOutput.setText(res);
					
					
				}});
				
				//CAR ENTRY BUTTON --> open car entry window,, close menu
				menuWindow.carEntryButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						carEntryWindow.carEntryFrame.setVisible(true);
						carDisplayWindow.carDisplayFrame.setVisible(false);
						
						
						
					}
				});
				
				
				
				
				
				/////////////////////////////////////////////////////////////////////////////////
				
				//EXIT BUTTON --> Save Car ArrayList to File,, close program
				menuWindow.exitButton.addActionListener(new ActionListener() {

					
					public void actionPerformed(ActionEvent e) {
						
						
					
					try {
						FileOutputStream fo = new FileOutputStream("/Users/charlesiv/Desktop/cars.text");
						ObjectOutputStream oos = new ObjectOutputStream(fo);
						
						//for(Car c : cars)
						oos.writeObject(cars);
						
						
						oos.close();
						fo.close();
					} catch (Exception ee) {
						ee.printStackTrace();
					}
					System.exit(0);
						
				}

				});
				
				//////////////////////////////////////////////////////////////////////////////////
				
				
				
				///////////////////Car Display Window --- Return Button///////////////////////////////
				
				
				//RETURN BUTTON --> return to menu window, close display window
				carDisplayWindow.returnButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						carDisplayWindow.carDisplayFrame.setVisible(false);
						menuWindow.menuFrame.setVisible(true);
				
					}
				});
				
			
				
				
				///////////////////////////////////////////////////////////////////////////////
				
				
				
			///////////////////Car Entry Window --- 2 Buttons, 2 Radios, 8 textFields, 1 Panel/ComboBox/////////////
				
				//RETURN BUTTON --> open menu window, close entry window
				carEntryWindow.returnButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						carEntryWindow.carEntryFrame.setVisible(false);
						menuWindow.menuFrame.setVisible(true);
							
						
					}
				});
					
						
	
				
				carEntryWindow.electric_radioButton.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent e) {
						
						if(carEntryWindow.electric_radioButton.isSelected()) {
							
						
							carEntryWindow.fuelType_Field.setEditable(false);
							carEntryWindow.tankSize_Field.setEditable(false);
							carEntryWindow.tankSize_Field.setBackground(Color.GRAY);
							carEntryWindow.fuelType_Field.setBackground(Color.GRAY);
							
							carEntryWindow.batterySize_Field.setEditable(true);
							carEntryWindow.batteryType_Field.setEditable(true);
							carEntryWindow.batteryType_Field.setBackground(Color.WHITE);
							carEntryWindow.batterySize_Field.setBackground(Color.WHITE);
							
							
						}}});
							
						
				carEntryWindow.gas_radioButton.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent e) {
						
						if(carEntryWindow.gas_radioButton.isSelected()) {
						
						carEntryWindow.batterySize_Field.setEditable(false);
						carEntryWindow.batteryType_Field.setEditable(false);
						carEntryWindow.batteryType_Field.setBackground(Color.GRAY);
						carEntryWindow.batterySize_Field.setBackground(Color.GRAY);
						
						
						carEntryWindow.fuelType_Field.setEditable(true);
						carEntryWindow.tankSize_Field.setEditable(true);
						carEntryWindow.tankSize_Field.setBackground(Color.WHITE);
						carEntryWindow.fuelType_Field.setBackground(Color.WHITE);
						
						
						
						}}});
							
							
						
						

		
				
				//SUBMIT BUTTON --> Validate fields, create electric or gas Car Object, add to arrayList.
				
				carEntryWindow.submitButton.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						if(carEntryWindow.make_Field.getText().isEmpty() || carEntryWindow.make_Field.getText().isBlank()) {
							JOptionPane.showMessageDialog(carEntryWindow.submitButton, "Make cannot be blank");
							return;
						}
						
						if(carEntryWindow.model_Field.getText().isEmpty() || carEntryWindow.model_Field.getText().isBlank()) {
							JOptionPane.showMessageDialog(carEntryWindow.model_Field, "Model cannot be blank");
							return;
						}
						
						if(carEntryWindow.year_Field.getText().isEmpty() || carEntryWindow.year_Field.getText().isBlank()) {
							JOptionPane.showMessageDialog(carEntryWindow.year_Field, "Year cannot be blank");
							return;
						}
						
						if(carEntryWindow.weight_Field.getText().isEmpty() || carEntryWindow.weight_Field.getText().isBlank()) {
							JOptionPane.showMessageDialog(carEntryWindow.weight_Field, "Weight cannot be blank");
							return;
						}
						
						
						
						int year = 0;
						
						try {
							year = Integer.parseInt(carEntryWindow.year_Field.getText());
						}catch(Exception e2) {
							JOptionPane.showMessageDialog(carEntryWindow.year_Field, "Year needs to be a numeric value");
							return;
						}
						
						
						
						
			 
						if(carEntryWindow.electric_radioButton.isSelected()) {
							
							
						
							
						Electric_Car c = new Electric_Car(carEntryWindow.make_Field.getText(), carEntryWindow.model_Field.getText(), year, Integer.valueOf(carEntryWindow.weight_Field.getText()), carEntryWindow.cb.getSelectedItem().toString(), Integer.valueOf(carEntryWindow.batterySize_Field.getText()), carEntryWindow.batteryType_Field.getText());														
						cars.add(c);
						carEntryWindow.make_Field.setText("");
						carEntryWindow.model_Field.setText("");
						carEntryWindow.year_Field.setText("");
						carEntryWindow.weight_Field.setText("");
						carEntryWindow.batterySize_Field.setText("");
						carEntryWindow.batteryType_Field.setText("");
						carEntryWindow.tankSize_Field.setText("");
						carEntryWindow.fuelType_Field.setText("");
						
						
						JOptionPane.showMessageDialog(carEntryWindow.submitButton, "Added!");
						
					
						
						
						
					
						
						} else {
							
						
							
							Gas_Car g = new Gas_Car(carEntryWindow.make_Field.getText(), carEntryWindow.model_Field.getText(), year, Integer.valueOf(carEntryWindow.weight_Field.getText()), carEntryWindow.cb.getSelectedItem().toString(), carEntryWindow.fuelType_Field.getText(), Integer.valueOf(carEntryWindow.tankSize_Field.getText()));
							cars.add(g);
							carEntryWindow.make_Field.setText("");
							carEntryWindow.model_Field.setText("");
							carEntryWindow.year_Field.setText("");
							carEntryWindow.weight_Field.setText("");
							carEntryWindow.batterySize_Field.setText("");
							carEntryWindow.batteryType_Field.setText("");
							carEntryWindow.tankSize_Field.setText("");
							carEntryWindow.fuelType_Field.setText("");
							
							
							
							
							JOptionPane.showMessageDialog(carEntryWindow.submitButton, "Added!" );
						}
						
						
						
	
						
					}
				});
				
				
				
				
				
			}
		});
	}
	
	
	
	
		
	}

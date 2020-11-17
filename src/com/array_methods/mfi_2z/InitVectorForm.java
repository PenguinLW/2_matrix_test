package com.array_methods.mfi_2z;
import javax.swing.*;
import java.awt.*;
public class InitVectorForm extends JFrame{
	private JTextField[] elmass;
	private JButton jbtnWrite;
	private JPanel jpnl;
	public InitVectorForm(int[] arr){
		int rows = arr.length;
		int columns = arr.length;
		initComponents(rows, columns);
	}
	private void initComponents(int rows, int columns){
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("Задайте значения элементов массива");
		this.setLayout(new GridBagLayout());
		GridBagConstraints pen = new GridBagConstraints();
		pen.fill = GridBagConstraints.BOTH;
		pen.insets = new Insets(2,2,2,2);
		
		elmass = new JTextField[rows];
		jbtnWrite = new JButton("Write element in array");
		jpnl = new JPanel();
		jpnl.setLayout(new GridLayout(rows,columns));
		for(int i = 0; i <= elmass.length-1; i++){
				elmass[i] = new JTextField(3);
				jpnl.add(elmass[i]);
		}
		pen.gridx = 0;
		pen.gridy = 0;
		this.add(jpnl, pen);
		pen.gridx = 0;
		pen.gridy = 1;
		this.add(jbtnWrite, pen);
		this.pack();
		this.setLocationRelativeTo(null);
	}
}
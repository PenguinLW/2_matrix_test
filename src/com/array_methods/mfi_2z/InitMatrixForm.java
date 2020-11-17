package com.array_methods.mfi_2z;
import javax.swing.*;

import static com.array_methods.mfi_2z.MatrixMethods.*;

import java.awt.*;
import java.awt.event.*;
public class InitMatrixForm extends JFrame{
	private JTextField[][] elmass;
	private JButton jbtnWrite, jbtnExit;
	private JPanel[] jpnl = new JPanel[2];
	private TextArea txtar;
	public InitMatrixForm(int[][] arr){
		int rows = arr.length;
		int columns = arr[0].length;
		initComponents(arr, rows, columns);
	}
	private void initComponents(int[][] arr, int rows, int columns){
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("Задайте значения элементов массива");
		
		jpnl[1] = new JPanel();
		
		jpnl[0] = new JPanel();
		jpnl[0].setLayout(null);
		jbtnExit = new JButton("Выход");
		jbtnWrite = new JButton("Записать");
		jbtnWrite.setToolTipText("Write element in array");
		txtar = new TextArea();
		
		elmass = new JTextField[rows][columns];
		for(int i = 0; i <= elmass.length-1; i++)
			for(int j = 0; j <= elmass[i].length-1; j++)
				elmass[i][j] = new JTextField(3);
		int x=0,y=0;
		for(int i = 0; i <= elmass.length-1; i++){
			for(int j = 0; j <= elmass[i].length-1; j++){
					elmass[i][j].setLocation(x,y);
					elmass[i][j].setSize(25,25);
					jpnl[0].add(elmass[i][j]);
					x += 26;
				}
			x = 0;
			y += 26;
		}
		//координаты вертикального положения последнего текстового поля, соответствующего 
		//последнему "элементу массива" (положение последней ячейки столбца последней строки)
		int coordX = elmass[rows-1][columns-1].getX();
		//координаты вертикального положения последнего текстового поля, соответствующего 
		//последнему "элементу массива" (положение последней ячейки столбца последней строки)
		int coordY = elmass[rows-1][columns-1].getY();
		
		//высота всей группы "элементов массива" (количество строк (rows) массива)
		int arrayCeilH = elmass[rows-1][columns-1].getY()+elmass[rows-1][columns-1].getHeight();
		//ширина всей группы "элементов массива" (количество столбцов (columns) массива)
		int arrayCeilW = elmass[rows-1][columns-1].getX()+elmass[rows-1][columns-1].getWidth();

		//позиция кнопки: по горизонтали - позиция первого "элемента массива" (ячейки/текстового поля), 
		//по вертикали - координаты (положения последней строки) последнего "элемента массива" (текстового 
		//поля/ячейки) в сумме с его высотой (чтобы не перекрыть кнопку текстовыми полями)
//		jbtnWrite.setLocation(elmass[0][0].getX(), coordY+elmass[0][0].getHeight());
		jbtnWrite.setSize(arrayCeilW, elmass[0][0].getHeight());//(,25)
		jpnl[1].add(jbtnWrite);
		jbtnExit.setLocation(elmass[0][0].getX()+jbtnWrite.getWidth(), coordY+elmass[0][0].getHeight());
		jbtnExit.setSize(jbtnWrite.getSize());//(,25)
		jpnl[1].add(jbtnExit);
		jpnl[1].setLocation(elmass[0][0].getX(), coordY+elmass[0][0].getHeight());
		jpnl[1].setSize(jbtnWrite.getWidth()+jbtnExit.getWidth(), jbtnWrite.getHeight()+jbtnExit.getHeight());
		jpnl[0].add(jpnl[1]);
		
		txtar.setLocation(elmass[0][columns-1].getX()+elmass[0][0].getWidth(), elmass[0][0].getY());
		txtar.setSize(arrayCeilW, arrayCeilH);
		txtar.setEditable(false);
		
		this.add(jpnl[1]);
		this.add(txtar);
		this.add(jpnl[0]);
		this.setSize((arrayCeilW+txtar.getWidth())+15, (arrayCeilH+jpnl[1].getHeight()+25));
//		jbtnWrite.setSize(arrayCeilW+txtar.getWidth(),jbtnWrite.getHeight());
		this.setLocationRelativeTo(null);
		
		jbtnWrite.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
//				int reply = JOptionPane.showConfirmDialog(null, "Задаём целочисленный массив?", "Тип данных", JOptionPane.YES_NO_OPTION);
//				if (reply == JOptionPane.YES_OPTION) {
//					arrI = new int[rows][columns];
					for(int i = 0; i <= elmass.length-1; i++)
						for(int j = 0; j <= elmass[i].length-1; j++)
							arr[i][j] = Integer.parseInt(elmass[i][j].getText());				
					txtar.append(arrPrint(arr)+"\n");
//					}
//				else {
//					arrS = new String[rows][columns];
//					for(int i = 0; i <= elmass.length-1; i++)
//						for(int j = 0; j <= elmass[i].length-1; j++)
//							arrS[i][j] = elmass[i][j].getText();
//					txtar.append(arrPrint(arrS)+"\n");
//					}
				}catch(NumberFormatException exc){
					JOptionPane.showMessageDialog(null, "Данные не соответствуют выбранному типу:\n"+exc);
				}
			}
		});
		jbtnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				InitMatrixForm.this.dispose();
			}
		});
	}
}
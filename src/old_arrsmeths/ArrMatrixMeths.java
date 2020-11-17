/**
 * Двумерные массивы:
 * 1. Вывод содержимого элементов массива ().
 * 2. Создание копии массива.
 * 3. Генерация содержимого массива случайным образом.
 * 4. Подсчёт отрицательных элементов находящихся в столбцах массива.
 * 5. Задать значения элементам массива используя диалоговые окна.
 * 6. Заполнить массив используя форму.
 * 7. Пузырьковая сортировка (по убыванию).
 * 8. Пузырьковая сортировка (по возрастанию).
 * 9. .
 */
package old_arrsmeths;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrMatrixMeths{
/**
 * 1. Вывод содержимого элементов массива ().
 * */
	public static String arrPrint(int[][] arr){
		String arrstr = "";
		for(int i = 0; i <= arr.length-1; i++){
			int count = 0;
			for(int j = 0; j <= arr[i].length-1; j++){
				arrstr += arr[i][j] + ", ";
				count++;
				if(count == arr[i].length){
					arrstr += "\n ";
					count = 0;
				}
			}
		}			
		arrstr = "["+arrstr.substring(0, arrstr.length()-4) + 
				arrstr.substring(arrstr.length()-4).replace(",", "]");
		return arrstr;
	}
	public static String arrPrint(String[][] arr){
		String arrstr = "";
		for(int i = 0; i <= arr.length-1; i++){
			int count = 0;
			for(int j = 0; j <= arr[i].length-1; j++){
				arrstr += arr[i][j] + ", ";
				count++;
				if(count == arr[i].length){
					arrstr += "\n ";
					count = 0;
				}
			}
			}
		arrstr = "["+arrstr.substring(0, arrstr.length()-4) + 
				arrstr.substring(arrstr.length()-4).replace(",", "]");
		return arrstr;
	}
/**
 * 2. Создание копии массива.
 * */
	public static int[][] arrCopy(int[][] arr){
		int[][] arrC = new int[arr.length][arr[0].length];
		for(int i = 0; i <= arr.length-1; i++){
			for(int j = 0; j <= arr[i].length-1; j++){
				arrC[i][j] = arr[i][j];
				}
			}
		return arrC;
	}
	public static String[][] arrCopy(String[][] arr){
		String[][] arrC = new String[arr.length][arr[0].length];
		for(int i = 0; i <= arr.length-1; i++)
			for(int j = 0; j <= arr[i].length-1; j++)
			arrC[i][j] = arr[i][j];
		return arrC;
	}
/**
 * 3. Генерация содержимого массива случайным образом.
 * */
	public static int[][] randomValue(int[][] mass){
		for(int i = 0; i <= mass.length-1; i++){
			for(int j = 0; j <= mass[i].length-1; j++){
				if(j%3 == 0)
					mass[i][j] = (int) Math.pow(-21*Math.random(), i);
				else
					mass[i][j] = (int) Math.pow(-21*Math.random(), j);
			}
		}
		return mass;
	}
/**
 * 4. Подсчёт отрицательных элементов находящихся в столбцах массива.
 */
	public static int[] amountNegSignValue(int[][] A){
		int row = A.length;
		int col = A[0].length;
		int[] B = new int[col];
				for(int j = 0; j < col; j++){
					int k = 0;
					for(int i = 0; i < row; i++){
						if(A[i][j] < 0){
							k++;
						}
						B[j] = k;
					}
				}
		return B;
	}
/**
 * 5. Задать значения элементам массива используя диалоговые окна.
 * */
	public static int[][] initValue(int[][] mass){
		for(int i = 0; i <= mass.length-1; i++){
			for(int j = 0; j <= mass[i].length-1; j++){
//				System.out.print("Введите A["+i+"]["+j+"] элемент: "); 
//				A[i][j] = in.nextInt();
//				System.out.println();
				mass[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Введите A["+i+"]["+j+"] элемент:"));
			}
		}
		return mass;
	}
/**
 * 6. Заполнить массив используя форму.
 * */
	public static int[][] initValForm(int[][] arr){
		try{
			new InitMatrixForm(arr).setVisible(true);
		}catch(NumberFormatException exc){
			JOptionPane.showMessageDialog(null, "\n"+exc);
		}
		return arr;
	}
/**
 * 7. Пузырьковая сортировка (по убыванию).
 * */
	public static void sortMatrOfMaxToMin(int[][] arr, int[] vect){
//		int[] vect = new int[arr.length];
		//сортировка по убыванию
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(vect[i] < vect[i+1]){
					int x = vect[i];
					vect[i] = vect[i+1];
					vect[i+1] = x;
					for(int j = 0; j <= arr.length-1; j++){
						x = arr[i][j];
						arr[i][j] = arr[i+1][j];
						arr[i+1][j] = x;
					}
				}
			}
		}
//		return "Отсортирована по убыванию:\n"+arrPrint(arr)+"\nВектор сумм: "+ Arrays.toString(vect);
	}
/**
 * 8. Пузырьковая сортировка (по возрастанию).
 * */
	public static void sortMatrOfMinToMax(int[][] arr, int[] vect){
//		int[] vect = new int[arr.length];
		//сортировка по убыванию
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(vect[i] > vect[i+1]){
					int x = vect[i];
					vect[i] = vect[i+1];
					vect[i+1] = x;
					for(int j = 0; j <= arr.length-1; j++){
						x = arr[i][j];
						arr[i][j] = arr[i+1][j];
						arr[i+1][j] = x;
					}
				}
			}
		}
//		return "Отсортирована по возрастанию:\n"+arrPrint(arr)+"\nВектор сумм: "+ Arrays.toString(vect);
	}
/**
 * 9. .
 * */
	public static String summOfRows(int[][] arr, int[] vect){
		//вычисление вектора сумм
//		int[] vect = new int[arr.length];
			for(int i = 0; i <= arr.length-1; i++){
				int summ = 0;
				for(int j = 0; j <= arr.length-1; j++){
					summ += arr[i][j];
				}
				vect[i] = summ;
			}
			return Arrays.toString(vect);
	}
}
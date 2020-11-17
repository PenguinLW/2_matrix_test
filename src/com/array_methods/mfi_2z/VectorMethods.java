/**
 * Одномерные массивы:
 * 1. Вывод содержимого элементов массива ().
 * 2. Создание копии массива.
 * 3. Поиск минимального элемента массива.
 * 4. Генерация содержимого массива случайным образом.
 * 5. Вычисление среднего арифметического элементов массива.
 * 6. Поиск среднего арифметического среди элементов массива (от k до m).
 * 7. Составить вектор из чётных элементов массива.
 * 8. Определение количества чётных элементов массива.
 * 9. Поменять местами минимальный и максимальный элементы массива.
 * 10. Определение позиции минимального элемента массива.
 * 11. Определение позиции максимального элемента массива.
 * 12. Пузырьковая сортировка (по возрастанию).
 * 13. Пузырьковая сортировка (по убыванию).
 */
package com.array_methods.mfi_2z;

import javax.swing.JOptionPane;

public class VectorMethods{
/**
 * 1. Вывод содержимого элементов массива ().
 * */
	public static String arrPrint(int[] arr){
		String arrstr = "";
		for(int i = 0; i <= arr.length-1; i++){
			arrstr += arr[i] + ",";
//			if(i != arr.length-1)
//				arrstr += ",";
			}
		arrstr = "["+arrstr.substring(0, arrstr.length()-1) + 
				arrstr.substring(arrstr.length()-1).replace(",", "]");
		return arrstr;
	}
	public static String arrPrint(String[] arr){
		String arrstr = "";
		for(int i = 0; i <= arr.length-1; i++){
			arrstr += arr[i] + ",";
			}
		arrstr = "["+arrstr.substring(0, arrstr.length()-1) + 
				arrstr.substring(arrstr.length()-1).replace(",", "]");
		return arrstr;
	}
/**
 * 2. Создание копии массива.
 * */
	public static int[] arrCopy(int[] arr){
		int[] arrC = new int[arr.length];
		for(int i = 0; i <= arr.length-1; i++)
			arrC[i] = arr[i];
		return arrC;
	}
	public static String[] arrCopy(String[] arr){
		String[] arrC = new String[arr.length];
		for(int i = 0; i <= arr.length-1; i++)
			arrC[i] = arr[i];
		return arrC;
	}

/**
 * 3. Поиск минимального элемента массива.
 * */
	public static String minNumb(int[] mass){
		int number = 0;
		int min = mass[0];
		for(int i = 0; i <= mass.length-1;i++){
			if(mass[i] < min){
				min = mass[i];
				number = i+1;
				}
			}
		return "Минимальный элемент ряда: номер - " + 
			number + "; значение - " + min;
	}
/**
 * 4. Генерация содержимого массива случайным образом.
 * */
	public static int[] randomValue(int[] mass){
		for(int i = 0; i <= mass.length-1; i++){
			mass[i] =(int) (77 *Math.random());
		}
		return mass;
	}
/**
 * 5. Вычисление среднего арифметического элементов массива.
 * */
	public static int arithMean(int[] mass){
		int srznach = 0;
			for(int i = 0; i <= mass.length-1; i++){
				srznach += mass[i];
			}
			return srznach/mass.length;
		}
/**
 * 6. Поиск среднего арифметического среди элементов массива (от k до m).
 * */
	public static int arithMeanSubArr(int[] mass, int start, int end){
		int srznach = 0;
		int[] startendmass = new int[(end-start)+1];
		for(int i = start-1, j = 0; i <= end-1; i++, j++)
			startendmass[j] = mass[i];
//		JOptionPane.showMessageDialog(null, arrPrint(startendmass));
//	//		if(k >= 1 && l >= k && l <= mass.length){
			for(int i = 0; i <= startendmass.length-1; i++)
					srznach += startendmass[i];
			return srznach/startendmass.length;
		}
/**
 * 7. Составить вектор из чётных элементов массива.
 * */
	public static int[] subarrOfEvenValArr(int[] A){
			int j = 0;
			int[] B = new int[amountEvenValOfArr(A)];
			for(int i = 0; i <= A.length-1; i++){
				if(A[i]%2==0){
					B[j] = A[i]; j++;
					}
			}
			return B;
		}
/**
 * 8. Определение количества чётных элементов массива.
 * */
	public static int amountEvenValOfArr(int[] mass){
			int even = 0;
			for(int i = 0; i <= mass.length-1; i++){
				if(mass[i]%2==0)
					even++;
			}
			return even;
	}
/**
 * 9. Поменять местами минимальный и максимальный элементы массива.
 * */
	public static void changeMinWithMax(int[] mass){
		int pmin = positionMinEl(mass);
		int pmax = positionMaxEl(mass);
		int min = mass[pmin], max = mass[pmax];
		mass[pmin] = max; mass[pmax] = min;
//		return mass;
		}
/**
 * 10. Определение позиции минимального элемента массива.
 * */
	public static int positionMinEl(int[] mass){
			int min = mass[0];
			int posit = 0;
			for(int i = 0; i <= mass.length-1; i++){
				if(mass[i] < min){
					min = mass[i];
					posit = i;
					}
			}
			return posit;
	}
/**
 * 11. Определение позиции максимального элемента массива.
 * */
	public static int positionMaxEl(int[] mass){
		int max = mass[0];
		int posit = 0;
		for(int i = 0; i <= mass.length-1; i++){
			if(mass[i] > max){
				max = mass[i];
				posit = i;
				}
		}
		return posit;
	}
/**
 * 12. Пузырьковая сортировка (по возрастанию).
 * */
	public static void sortOfMinToMax(int[] arr){
		//сортировка по возрастанию
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(arr[i] > arr[i+1]){
					int a = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = a;
				}
			}
		}
	}
/**
 * 13. Пузырьковая сортировка (по убыванию).
 * */
	public static void sortOfMaxToMin(int[] arr){
		//сортировка по убыванию
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(arr[i] < arr[i+1]){
					int a = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = a;
				}
			}
		}
	}

/**
 * 14. Задать значения элементам массива используя диалоговые окна.
 * */
	public static void initValue(int[] mass){
		for(int i = 0; i <= mass.length-1; i++){
				mass[i] = Integer.parseInt(JOptionPane.showInputDialog("Введите A["+i+"] элемент:"));
			}
//		return mass;
	}
/**
 * 15. Заполнить массив используя форму.
 * */
	public static int[] initValForm(int[] arr){
		try{
			new InitVectorForm(arr).setVisible(true);
		}catch(NumberFormatException exc){
			JOptionPane.showMessageDialog(null, "\n"+exc);
		}
		return arr;
	}
}
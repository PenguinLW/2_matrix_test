package test;
import static old_arrsmeths.ArrMatrixMeths.*;

import  java.util.*;
public class MatrixSort {
private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Введите количество элементов: ");
		int m = in.nextInt();
		int[][] arr = new int[m][m];
		int[] vect = new int[arr.length];

		//инициализация
		arr = randomValue(arr);
//		arr = initValue(arr);
		System.out.println("Заданная матрица:\n"+arrPrint(arr));
		
		//вычисление вектора
		System.out.println("Вектор сумм заданной матрицы: "+summOfRows(arr,vect));
		
		sortMatrOfMaxToMin(arr,vect);
		System.out.println("Отсортирована по убыванию:\n"+arrPrint(arr));
		System.out.println(Arrays.toString(vect));
		sortMatrOfMinToMax(arr,vect);
		System.out.println("Отсортирована по возрастанию:\n"+arrPrint(arr));
		System.out.println(Arrays.toString(vect));
	}
}

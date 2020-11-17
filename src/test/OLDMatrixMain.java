package test;
import java.util.Arrays;
import java.util.Scanner;
import static com.array_methods.mfi_2z.MatrixMethods.*;
public class OLDMatrixMain {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n, m;
		System.out.println("¬ведите размерность массива:");
		System.out.print("rows: ");
		m = in.nextInt();
		System.out.print("columns: ");
		n = in.nextInt();
		
		int[][] A = new int[m][n];
		System.out.println("A.length: "+A.length + "; A[0].length: " + A[0].length);
		int[] B = new int[n];
		
		//инициализаци€
		A = randomValue(A);
		System.out.println(arrPrint(A));
		
		//подсчЄт отрицательных элементов столбцов массива 
		//и печать элементов массива B
		System.out.println(Arrays.toString(amountNegSignValue(A)));
		
		//вывод массива B
	}
}
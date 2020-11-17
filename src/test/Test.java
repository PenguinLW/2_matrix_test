package test;
import static com.array_methods.mfi_2z.MatrixMethods.*;

import java.util.Arrays;
public class Test {
	public static void main(String[] args) {
		int[][] mass = new int[3][4];
		
		 String[][] arr = { 
		  {"RKDCVB"},
		  {"RXCVK"},
		  {"RK"}
		  };
		 
		mass = randomValue(mass);
		System.out.println(arrPrint(mass));
		System.out.println(arrPrint(arr));
		int[][] mass2 = arrCopy(mass);
		System.out.println(arrPrint(mass2));
		String[][] arr2 = arrCopy(arr);
		System.out.println(arrPrint(arr2));
	}

}
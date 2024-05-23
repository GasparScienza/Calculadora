package operaciones;

import java.util.Scanner;

public class Suma {
	private static int cantNum;
	private static Scanner sc = new Scanner(System.in);
	
	public static void sumar() {
		System.out.print("Ingresar la cantidad de numeros a sumar: ");
		cantNum = sc.nextInt();
		float suma = 0;
		
		for(int i=0; i<cantNum; i++) {
			System.out.print("Numero " + (i+1)+": ");
			suma += sc.nextFloat();
		}
		System.out.println("Resultado: " + suma);
	}
}

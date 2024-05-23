package logica;

import java.util.Scanner;
/*Esta clase fue pensada para modularizar el ingreso de dos valores*/
public class LeerValor {
	
	public static IngresoValor ingresarDosValores() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer valor: ");
        float valor1 = scanner.nextFloat();
        
        System.out.print("Ingrese el segundo valor: ");
        float valor2 = scanner.nextFloat();
        /*En esta linea devuelve un objeto de tipo IngresoValores*/
        return new IngresoValor(valor1, valor2);
    }
}

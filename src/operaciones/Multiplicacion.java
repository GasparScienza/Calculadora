package operaciones;

import logica.IngresoValor;
import logica.LeerValor;

public class Multiplicacion {
	
	public static void multiplicar() {
		IngresoValor valores = LeerValor.ingresarDosValores();
		System.out.println("Resultado: " + (valores.getNum1()*valores.getNum2()));
	}
}

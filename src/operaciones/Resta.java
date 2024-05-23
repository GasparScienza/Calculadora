package operaciones;

import logica.IngresoValor;
import logica.LeerValor;

public class Resta {

	public static void restar() {
		IngresoValor valores = LeerValor.ingresarDosValores();
		System.out.println("Resultado: " + (valores.getNum1() - valores.getNum2()));
	}
}

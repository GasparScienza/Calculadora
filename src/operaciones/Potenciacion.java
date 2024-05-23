package operaciones;

import logica.IngresoValor;
import logica.LeerValor;

public class Potenciacion {
	public static void potencia() {
		System.out.println("Valor1 = Base, Valor2 = exponente");
		IngresoValor valores = LeerValor.ingresarDosValores();
		System.out.println("Resultado: " + (Math.pow(valores.getNum1(), valores.getNum2())));
	}
}

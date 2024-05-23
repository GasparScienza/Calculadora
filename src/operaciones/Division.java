package operaciones;

import logica.IngresoValor;
import logica.LeerValor;

public class Division {
	public static void dividir() {
		boolean resultado;
		do {
			IngresoValor valores = LeerValor.ingresarDosValores();
			if(valores.getNum2()!= 0) {
				System.out.println("Resultado: " + (valores.getNum1()/valores.getNum2()));
				resultado = false;
			}else {
				System.out.println("Error: División por cero.");
				resultado = true;
			}
		}while(resultado);	
	}
}

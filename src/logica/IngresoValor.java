package logica;
/*Clase creada para almacenar valores para los calculos en la calculadora*/
public class IngresoValor {
	private float num1;
	private float num2;
	
	public IngresoValor(float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public float getNum1() {
		return num1;
	}
	public float getNum2() {
		return num2;
	}	
}

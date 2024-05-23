package logica;

import java.util.Scanner;

import operaciones.Division;
import operaciones.Multiplicacion;
import operaciones.Potenciacion;
import operaciones.Resta;
import operaciones.Suma;

public class Calculadora {
	private Scanner sc = new Scanner(System.in);
	private int condicion;
	
	public void Operacion() {
		do {
			System.out.println("-----------------------");
			System.out.println("Seleccione una operación:");
			System.out.println("0.Salir");
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Potencia");
			System.out.println("-----------------------");
			
			condicion = sc.nextInt();
			
			switch (condicion) {
				case 0: {
					System.out.println("Apagando calculadora...");
					System.out.println("╔══╦╦╦═╦═╦╦╦═╗");
					System.out.println("╚╗╔╣╩║╬║║║═╣═╣");
					System.out.println(" ║║║╦║║║║║║╠═║");
					System.out.println(" ╚╝╚╩╩╩╩╩╩╩╩═╝");
					break;
				}
				case 1: {
					Suma.sumar();
					break;
				}
				case 2:	{
					Resta.restar();
					break;
				}
				case 3: {
					Multiplicacion.multiplicar();
					break;
				}
				case 4: {
					Division.dividir();
					break;
				}
				case 5: {
					Potenciacion.potencia();
					break;
				}
				default: {
					System.out.println("Operación no disponible");
					break;
				}
			}
		} while (condicion != 0);
	}
}

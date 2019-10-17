package ejerciciosUT1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int n;
		System.out.println("Por favor, introduzca un número de 4 cifras:");
		java.util.Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
		
		if (n<1000 || n>9999) {
			System.out.println("El número introducido no tiene 4 cifras, por favor introduzca otro:");
		}else {
			System.out.println("La primera cifra es: " + (n/1000)%10);
					
			System.out.println("La segunda cifra es: " + (n/100)%10);
					
			System.out.println("La tercera cifra es: " + (n/10)%10);
					
			System.out.println("La cuarta cifra es: " + n%10);
							
		}
	}
}

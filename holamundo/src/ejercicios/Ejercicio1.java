package ejerciciosUT1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int programacion, lenguajes, bases, entornos, sistemas, fol;
		System.out.println("Por favor, introduzca la nota de Programación: ");
		java.util.Scanner entrada = new Scanner(System.in);
		programacion = entrada.nextInt();
		
		System.out.println("Por favor, introduzca la nota de Lenguajes de Marcas: ");
		java.util.Scanner entrada2 = new Scanner(System.in);
		lenguajes = entrada2.nextInt();
		
		System.out.println("Por favor, introduzca la nota de Bases de Datos: ");
		java.util.Scanner entrada3 = new Scanner(System.in);
		bases = entrada3.nextInt();
		
		System.out.println("Por favor, introduzca la nota de Entornos de Desarrollo: ");
		java.util.Scanner entrada4 = new Scanner(System.in);
		entornos = entrada4.nextInt();
		
		System.out.println("Por favor, introduzca la nota de Sistemas Informáticos: ");
		java.util.Scanner entrada5 = new Scanner(System.in);
		sistemas = entrada5.nextInt();
		
		System.out.println("Por favor, introduzca la nota de Formación y Orientación Laboral: ");
		java.util.Scanner entrada6 = new Scanner(System.in);
		fol = entrada6.nextInt();
		
		programacion=(programacion+lenguajes+bases+entornos+sistemas+fol)/6;
		
		System.out.print("Su nota media del curso es de: " + programacion);
				}
}

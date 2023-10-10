package com;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// Java necesita usar la clase Scanner para leer por consola
		Scanner scanner = new Scanner(System.in);
		/**
		 * Definimos las variables
		 */
		//Entradas
		Double distancia, velocidad;
		//Salida
		Double tiempo;
		
		System.out.println("Dime la distancia:");
		distancia = scanner.nextDouble();
		
		System.out.println("Dime la velocidad:");
		velocidad = scanner.nextDouble();
		
		tiempo = (distancia/velocidad);
		
		
		System.out.println("El tiempo es "+ tiempo);

	}

}

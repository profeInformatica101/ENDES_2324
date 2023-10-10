package com;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Java necesita usar la clase Scanner para leer por consola
		Scanner scanner = new Scanner(System.in);

		// Entradas
		Integer numero1, numero2, numero3;
		
		
		//Leemos las variables
		System.out.println("Dime número 1: ");
		numero1 = scanner.nextInt();
		System.out.println("Dime número 2: ");
		numero2 = scanner.nextInt();
		System.out.println("Dime número 3: ");
		numero3 = scanner.nextInt();

		if(numero1 > numero2) {
			//true
			if(numero1 > numero3) {
				System.out.println("El número 1 es el mayor: "+ numero1);
			}else {
				System.out.println("El número 3 es el mayor: "+ numero3);
			}
			
		}else {
			//false
			if(numero2 > numero3) {
				System.out.println("El número 2 es el mayor: "+ numero2);
			}else {
				System.out.println("El número 3 es el mayor: "+ numero3);
			}
		}
		
	}

}

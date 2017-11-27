/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_04;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_04 {

    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		// prompt ther user to enter an scores
		System.out.print("Ingrese los puntajes: (el número negativo significa el final): ");
		
		int[] puntuaciones = new int[100];  	// Initialize score array
		int num; 						   	// Hold user input
		int númerodepuntajes; 			   	// Number of scores
		int promedio; 					   	// Average score
		númerodepuntajes = promedio = 0;		// Initialize accumulator to 0;
		for (int i = 0; i < 100; i++) {
			num = input.nextInt();			
			if (num < 0)						// A negative number signifies end
				break;
			
			puntuaciones[i] = num;					// fill scores array
			promedio += num;					// Add scores to average
			númerodepuntajes++;					// Increment number of scores
		}

		promedio /= númerodepuntajes;	

		int aboveOrEqual;						// Scores above or equal to average
		int below;								// Scores below average
		aboveOrEqual = below = 0;
		for (int i = 0; i < númerodepuntajes; i++) {
			if (puntuaciones[i] >= promedio)
				aboveOrEqual++;				// Increment aboveOrEqual
			else
				below++;							// Increment below
		}

		// Display results
		System.out.println("\nPromedio de puntajes: " + promedio);
		System.out.println(
			"Número de puntuaciones superiores o iguales a la media: " + aboveOrEqual);
		System.out.println(
			"Número de puntajes por debajo del promedio: " + below);
	}
}
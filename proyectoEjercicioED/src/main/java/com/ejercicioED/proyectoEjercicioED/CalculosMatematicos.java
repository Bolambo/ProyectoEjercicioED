package com.ejercicioED.proyectoEjercicioED;

import java.util.ArrayList;

public class CalculosMatematicos {

	public static double potencia(int base, int exponente) {
		double result = 1;
		if (exponente < 0) {
			result = 1 / potencia(base, -exponente);
		} else {
			for (int i = 0; i < exponente; i++) {
				result *= base;
			}
		}
		return result;
	}

	public static long factorial(int numero) {
		long result = 1;
		if (numero < 0) {
			result = -1;
		} else {
			for (int i = 2; i <= numero && result > 0; i++) {
				result *= i;
				if (result < 0) {
					result = -1;
				}
			}
		}

		return result;
	}
	
	//https://www.noulakaz.net/2007/03/18/a-regular-expression-to-check-for-prime-numbers/
	public static boolean esPrimo(int numero) {
	    return !new String(new char[numero]).matches(".?|(..+?)\\1+");
	}
	
	public static ArrayList<Integer> listaDePrimosHasta(int numero){
		ArrayList<Integer> listaDePrimos = new ArrayList<Integer>();
			listaDePrimos.add(1);
			listaDePrimos.add(2);
			listaDePrimos.add(3);
			for(int i=5; i<=numero; i+=2) {
				if(esPrimo(i))
					listaDePrimos.add(i);
				}		
				return listaDePrimos;		
			}

}
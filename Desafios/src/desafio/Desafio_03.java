package desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio_03 {

	public static void main(String[] args) {
		//Crie uma list de números e descubra quais númerossão pares. Crie uma nova lista somente comm númmeros pares.
		List<Integer> numeros = Arrays.asList(2,3,4,10,9,23,45,64);
		List<Integer> numerosPares = new ArrayList<>();
		for (int numero : numeros) {
			if(numero%2==0) {
				numerosPares.add(numero);
			}
		}
		System.out.println("Lista de números: " + numeros);
		System.out.println("Lista de números pares: " + numerosPares);

	}
}

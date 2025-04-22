package desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio_02 {
	//Crie uma lista de números inteiros. Calcule a soma e a média de todos os números na lista.
	
	public static void main(String[] args) {
		List<Integer> inteiros = Arrays.asList(10,20,30,40);
		
		int soma = 0;
		for(int numero : inteiros) {
			soma += numero;
		}
		
		
		double media = (double) soma / inteiros.size();
		
		System.out.println("Lista de números: " + inteiros );
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		

	}

}

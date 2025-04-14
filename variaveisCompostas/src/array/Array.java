package array;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {

		//Array não trabalha com Tipos primitivos: int, char, double...
		//Objetos: String, Integer, Double...
		
		List <String> listaNomes = new ArrayList<>();
		
		listaNomes.add("Pedro");
		listaNomes.add("Gustavo");
		listaNomes.add("joão");
		listaNomes.add("Vitor");
		listaNomes.add("Thamirys");
		
		//Remover lista pelo valor 
		listaNomes.remove("Pedro");
		
		//Remover um item da lista pela posição
		listaNomes.remove(3);
		
		//Adicionando em uma posição desejada
		listaNomes.add(2, "William");
		
		//Verifica o tamanho da lista 
		System.out.println(listaNomes.size());
		
		//Percorrer a Array e o Vetores 
		for(String nome : listaNomes) {
			System.out.println(nome);
		}
	}

}

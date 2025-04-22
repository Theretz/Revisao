package desafio;

import java.util.ArrayList;
import java.util.List;

public class Desafio_01 {
	//Crie uma lista de nomes e filtre os que começam com uma letra específica. Depois, exiba quantos nomes foram encontrados.

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Amélia");
        nomes.add("Amanda");

        char letra = 'A';

        List<String> nomesFiltrados = filtrarNomes(nomes, letra);
        System.out.println("Nomes encontrados que começam com '" + letra + "':[");
        for (int i = 0; i < nomesFiltrados.size(); i++) {
            System.out.print(nomesFiltrados.get(i));
            if (i < nomesFiltrados.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("] \nTotal de nomes: " + nomesFiltrados.size());
    }

    // Método fora do main e com a assinatura correta
    public static List<String> filtrarNomes(List<String> nomes, char letra) {
        List<String> nomesFiltrados = new ArrayList<>();
        for (String nome : nomes) {
            if (nome.charAt(0) == letra) {
                nomesFiltrados.add(nome);
            }
        }
        return nomesFiltrados;
    }
}

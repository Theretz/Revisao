package desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio_04 {

    public static void main(String[] args) {
    	//Crie uma lista de palavras e remova todas que contêm uma letra específica fornecida pelo usuário.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as palavras separadas por espaço:");
        String linha = scanner.nextLine();
        List<String> palavrasAle = Arrays.asList(linha.split("\\s+")); // Separa as palavras pela(s) espaço(s)


        System.out.print("Digite a letra a ser removida: ");
        char letraRemover = scanner.nextLine().toLowerCase().charAt(0); // Lê a letra e converte para minúscula

        List<String> palavrasFiltradas = new ArrayList<>();

        for (String palavra : palavrasAle) {
            if (!palavra.toLowerCase().contains(String.valueOf(letraRemover))) {
                palavrasFiltradas.add(palavra);
            }
        }

        System.out.println("Palavras originais: " + palavrasAle);
        System.out.println("Palavras após remoção da letra '" + letraRemover + "': " + palavrasFiltradas);

        scanner.close();
    }
}

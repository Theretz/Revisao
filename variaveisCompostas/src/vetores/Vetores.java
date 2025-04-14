package vetores;

public class Vetores {

	public static void main(String[] args) {
		
		//Criando Vetores
		double[] notasAlunos = new double [3];
		
		//Atribuindo valores para o vetor 
		notasAlunos[0] = 10;
		notasAlunos[1] = 8;
		notasAlunos[2] = 6;
		
		//Ler valores do vetor
		System.out.println(notasAlunos[0]);
		System.out.println(notasAlunos[1]);
		System.out.println(notasAlunos[2]);
		
		System.out.println("Exibindo os valores do vetor com for: ");
		//Ler os valores do vetor - for 
		for (double nota : notasAlunos) {
			System.out.println(nota);
		}
		
	}

}

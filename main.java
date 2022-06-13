import java.util.Scanner;

import java.util.Arrays;

public class Helloworld {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);//Declarar Scanner
		
		int S = 0, salas, q[] = new int[6];
		float M = 0;//declarar variaveis e vetor de 6 modulos
		for (int i = 0; i < q.length; i++) {//estrutura de repeticao
		
			System.out.printf("Digite a quantidade de alunos da Sala %d\n", (i + 1)); // texto que aparecera ao usuario e adicionar um na contagem
			
			q[i] = ler.nextInt();// receber valor e adicionar na contagem
			S = S + q[i];//valor do vetor na variavel
			M = S / q.length;//calculo da media
		}
		
		Arrays.sort(q);//ordenar maior e menor valor do vetor
		int maior = q[5];
		int menor = q[0];//declarar variaveis do vetor
		
	
		System.out.printf("A media de alunos das salas e: %f\n", M);
		System.out.printf("A sala com mais alunos tem %d alunos\n", maior);
		System.out.printf("A sala com menos alunos tem %d alunos\n", menor); //exibir ao usuario as medias de aluno de cada sala
	}
}

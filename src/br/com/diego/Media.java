package br.com.diego;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);
		
		System.out.println("Digite suas notas:");
		
		int somaNotas = 0;
		
		 for (int i = 0; i < 4; i++) {
	            int notaAluno = nota.nextInt();
	            somaNotas = somaNotas + notaAluno;
	        }
 		
		 int mediaNotas = somaNotas / 4;
	        String mediaNotasPt = getMedia(mediaNotas);
	        System.out.println(mediaNotas);
	        System.out.println(mediaNotasPt);
		
	}
	
	public static String getMedia(int mediaNotas) {
		if (mediaNotas < 5) { 
			return  "Você reprovou";
		} else if (mediaNotas < 7) {
			return "Você está de recuperação";
		} else {
			return "Você está aprovado";
		}
		
	}
}

package br.com.diego;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class PessoasGenero {
    public  static  void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes e sexos (ex: Ana-F, Diego-M, Marcela-F):");

        String resposta = s.nextLine();
        String[] pessoas = resposta.split(",");
        Arrays.sort(pessoas);

        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        for (String pessoa : pessoas) {
            String[] dados = pessoa.split("-");

            if (dados.length == 2) {
                String nome = dados[0];
                String sexo = dados[1];

                if (sexo.equals("M")) {
                    masculinos.add(nome);
                } else if (sexo.equals("F")) {
                    femininos.add(nome);
                }
            }
        }

        System.out.println("***** Femininos *****");
        for (String nome : femininos) {
            System.out.println(nome);
        }

        System.out.println("***** Masculinos *****");
        for (String nome : masculinos) {
            System.out.println(nome);
        }
    }
}

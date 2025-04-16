package br.com.diego;

import java.util.Arrays;
import java.util.Scanner;

public class Pessoa {

    public  static  void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por ,  ");

        String resposta = s.nextLine();
        String[] nomes = resposta.split(",");

        Arrays.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

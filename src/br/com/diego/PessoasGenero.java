package br.com.diego;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class PessoasGenero {
    public  static  void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes e sexos (ex: Ana-F, Diego-M, Marcela-F):");

        String resposta = s.nextLine();

        List<String> pessoas = Arrays.stream(resposta.trim().split(","))
                .map(String::trim)
                .sorted()
                .collect(Collectors.toList());

        pessoas.forEach(p -> System.out.println("Todas as pessoas: " + p));

        List<String> femininos = pessoas.stream()
                .map(pessoa -> pessoa.split("-"))
                .filter(dados -> dados[1].equalsIgnoreCase("F"))
                .map(dados -> dados[0].trim())
                .collect(Collectors.toList());

        System.out.println("***** Femininos *****");
        femininos.forEach(System.out::println);


    }
}

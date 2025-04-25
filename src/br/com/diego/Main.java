package br.com.diego;

public class Main {
    public static void main(String[] args) {
        Class<Cliente> classe = Cliente.class;

        if (classe.isAnnotationPresent(Tabela.class)) {
            Tabela anotacao = classe.getAnnotation(Tabela.class);

            System.out.println("Nome da tabela: " + anotacao.valor());
        }
    }
}

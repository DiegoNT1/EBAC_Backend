package br.com.diego;

import java.lang.annotation.Annotation;

public class Reflections {

    @Tabela(valor = "Tabela")
    public static class ProdutoReflection {

    }

    public static void main(String[] args) {
        executeLeituraAnotacao();
    }

    private static void executeLeituraAnotacao() {
        System.out.println("**** Annotations ****");

        ProdutoReflection prod = new ProdutoReflection();
        Annotation[] annotations = prod.getClass().getAnnotations();

        for (Annotation an : annotations) {
            System.out.println("Annotation type: " + an.annotationType());

            if (an instanceof Tabela) {
                Tabela tabela = (Tabela) an;
                System.out.println(tabela.valor());
            }
        }
    }
}
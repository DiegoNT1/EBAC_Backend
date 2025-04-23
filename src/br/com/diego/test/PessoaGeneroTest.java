package br.com.diego.test;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.PessoasGenero;

import java.util.Arrays;
import java.util.List;

public class PessoaGeneroTest {

    @Test
    public void test() {

        List<String> entrada = Arrays.asList("Ana-F", "Diego-M", "Marcela-F", "Pedro-M");

        List<String> resultado = PessoasGenero.filtrarFemininos(entrada);

        for (String nome : resultado) {
            Assert.assertFalse(nome.endsWith("-M"));
        }
    }
}

package br.com.diego;

import java.util.ArrayList;
import java.util.List;

public class Estoque<T extends Carro> {
    private List<T> carros = new ArrayList<>();

    public void adicionar(T carro) {
        carros.add(carro);
    }

    public void listarTodos() {
        for (T carro : carros) {
            carro.exibirInfo();
        }
    }
}
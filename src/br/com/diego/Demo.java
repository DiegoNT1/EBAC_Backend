package br.com.diego;

public class Demo {
    public static void main(String[] args) {
        Fabrica fabricaHonda = new FabricaHonda();

        Estoque<Carro> estoque = new Estoque<>();

        estoque.adicionar(fabricaHonda.criarSedan());
        estoque.adicionar(fabricaHonda.criarSUV());


        estoque.listarTodos();
    }
}

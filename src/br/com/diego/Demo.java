package br.com.diego;

public class Demo {
    public static void main(String[] args) {
        Fabrica fabricaHonda = new FabricaHonda();

        Carro sedan = fabricaHonda.criarSedan();
        Carro suv = fabricaHonda.criarSUV();

        sedan.exibirInfo();
        suv.exibirInfo();
    }
}
package br.com.diego;

public class FabricaHonda extends Fabrica {

    @Override
    public Carro criarSedan() {
        return new CarroSedanHonda();
    }

    @Override
    public Carro criarSUV() {
        return new CarroSUVHonda();
    }
}
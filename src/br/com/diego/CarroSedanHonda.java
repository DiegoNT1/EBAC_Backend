package br.com.diego;

public class CarroSedanHonda extends Carro {
    public CarroSedanHonda() {
        super(120, "Preto");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Honda Civic - Sedan - Potência: " + getPotencia() + " - Cor: " + getCor());
    }
}
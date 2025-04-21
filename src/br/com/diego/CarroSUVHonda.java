package br.com.diego;

public class CarroSUVHonda extends Carro {
    public CarroSUVHonda() {
        super(140, "Branco");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Honda HR-V - SUV - Potência: " + getPotencia() + " - Cor: " + getCor());
    }
}
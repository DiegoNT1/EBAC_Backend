package br.com.diego;

public abstract class Carro {
    private int potencia;
    private String cor;

    public Carro(int potencia, String cor) {
        this.potencia = potencia;
        this.cor = cor;
    }

    public abstract void exibirInfo();

    public int getPotencia() {
        return potencia;
    }

    public String getCor() {
        return cor;
    }
}


/**
 * 
 */
package br.com.diego;

/**
 * Classe Ventilador 
 */
public class Ventilador {

	// Atributos do ventilador
    private String marca;
    private String modelo;
    private boolean ligado;

    public void setMarca(String marca) {
    	this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }


    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }
    
    // Método para ligar o ventilador
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O ventilador foi ligado.");
        } else {
            System.out.println("O ventilador já está ligado.");
        }
    }
    
 // Método para exibir as informações
    public void exibirInformacoes() {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println("Ligado? " + (ligado ? "Sim" : "Não"));
    }
}
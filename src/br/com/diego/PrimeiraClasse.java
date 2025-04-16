/**
 */
package br.com.diego;

/**
 * Classe principal
 * @author diego
 */
public class PrimeiraClasse {

	/**
	 * Método
	 * @param args
	 */
	public static void main(String[] args) {
		  Ventilador ventilador = new Ventilador();
		  ventilador.setMarca("Arno");
	      ventilador.setModelo("X-treme 9");
	      ventilador.ligar();
	      ventilador.exibirInformacoes();

	}

}

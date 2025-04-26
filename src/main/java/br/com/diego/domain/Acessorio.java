package br.com.diego.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_acessorio")
public class Acessorio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorio_seq")
    @SequenceGenerator(name = "acessorio_seq", sequenceName = "sq_acessorio", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "carro_id", nullable = false)
    private Carro carro;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}


}

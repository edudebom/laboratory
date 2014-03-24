package br.gov.serpro.catalogo.entity;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class OrigemDemanda {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "origem_demanda_seq")
	@SequenceGenerator(name = "origem_demanda_seq", sequenceName = "origem_demanda_id_seq")
	private Long id;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String descricao;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
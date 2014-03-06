package br.gov.serpro.catalogo.entity;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.SEQUENCE;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="fase", discriminatorType=DiscriminatorType.STRING)
@NamedQueries({ @NamedQuery(name = Fase.OBTER_POR_FASE_ANTERIOR, query = "select f from Fase f where (f.faseAnterior.id = :id)") })
public class Fase {
	
	public static final String OBTER_POR_FASE_ANTERIOR = "OBTER_FASE_ANTERIOR";
	
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private FaseEnum fase;
	
	
	@NotEmpty
	private String codigoReferencia;
	
	@NotEmpty
	private String origemReferencia;

	@NotEmpty
	private String objetivo;

	private Date dataRealizacao;
	
	@NotEmpty
	private String gestor;
	
	@NotEmpty
	private String area;

	@NotNull
	@Enumerated(STRING)
	private Situacao situacao;
	
	private String situacaoJustificativa;

	private Date dataFinalizacao;
	
	@Enumerated(EnumType.STRING)
	private FaseEnum proximaFase;
			
	private String proximaFaseJustificativa;
	
	private String proximaFaseGestor;
	
	private String proximaFaseArea;
	
	private String proximaFaseGestorEmail;
	
	private Integer proximaFaseCiclo;
	
	@OneToOne
	private Fase faseAnterior;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FaseEnum getFase() {
		return fase;
	}

	public void setFase(FaseEnum fase) {
		this.fase = fase;
	}

	public String getCodigoReferencia() {
		return codigoReferencia;
	}

	public void setCodigoReferencia(String codigoReferencia) {
		this.codigoReferencia = codigoReferencia;
	}

	public String getOrigemReferencia() {
		return origemReferencia;
	}

	public void setOrigemReferencia(String origemReferencia) {
		this.origemReferencia = origemReferencia;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public Date getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(Date dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public String getGestor() {
		return gestor;
	}

	public void setGestor(String gestor) {
		this.gestor = gestor;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public String getSituacaoJustificativa() {
		return situacaoJustificativa;
	}

	public void setSituacaoJustificativa(String situacaoJustificativa) {
		this.situacaoJustificativa = situacaoJustificativa;
	}

	public Date getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public FaseEnum getProximaFase() {
		return proximaFase;
	}

	public void setProximaFase(FaseEnum proximaFase) {
		this.proximaFase = proximaFase;
	}

	public String getProximaFaseJustificativa() {
		return proximaFaseJustificativa;
	}

	public void setProximaFaseJustificativa(String proximaFaseJustificativa) {
		this.proximaFaseJustificativa = proximaFaseJustificativa;
	}

	public String getProximaFaseGestor() {
		return proximaFaseGestor;
	}

	public void setProximaFaseGestor(String proximaFaseGestor) {
		this.proximaFaseGestor = proximaFaseGestor;
	}

	public String getProximaFaseArea() {
		return proximaFaseArea;
	}

	public void setProximaFaseArea(String proximaFaseArea) {
		this.proximaFaseArea = proximaFaseArea;
	}

	public String getProximaFaseGestorEmail() {
		return proximaFaseGestorEmail;
	}

	public void setProximaFaseGestorEmail(String proximaFaseGestorEmail) {
		this.proximaFaseGestorEmail = proximaFaseGestorEmail;
	}

	public Integer getProximaFaseCiclo() {
		return proximaFaseCiclo;
	}

	public void setProximaFaseCiclo(Integer proximaFaseCiclo) {
		this.proximaFaseCiclo = proximaFaseCiclo;
	}

	public Fase getFaseAnterior() {
		return faseAnterior;
	}

	public void setFaseAnterior(Fase faseAnterior) {
		this.faseAnterior = faseAnterior;
	}
	
}

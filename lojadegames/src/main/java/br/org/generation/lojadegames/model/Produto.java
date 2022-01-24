package br.org.generation.lojadegames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max=1000, message="O campo nome é obrigatório com máximo de 1000 caracteres.")
	private String nome;
	
	@NotBlank
	@Size(max=1000, message="O campo Tipo Console é obrigatório com mínimo de 5 e máximo de 1000 caracteres.")
	private String tipoconsole;
	
	@NotBlank(message="Este campo é obrigatório.")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private BigDecimal preco;
	
	@Column(name = "data_lancamento")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataLancamento;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria_id(Categoria categoria) {
		this.categoria = categoria;
	}

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

	public String getTipoconsole() {
		return tipoconsole;
	}

	public void setTipoconsole(String tipoconsole) {
		this.tipoconsole = tipoconsole;
	}


	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}

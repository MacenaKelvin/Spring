package br.org.generation.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull(message = "O atributo nome precisa ser preenchido!")
	@Size(min = 5, max = 25, message = "O atributo descrição deve ter entre 4 e 25 caracteres!")
	private String nome;

	@NotNull(message = "O atributo descrição precisa ser preenchido!")
	@Size(min = 5, max = 200, message = "O atributo descrição deve ter entre 4 e 200 caracteres!")
	private String descricao;

	@NotNull(message = "O atributo preço precisa ser preenchido!")
	@Positive(message = "O atributo preço precisa ser maior do que zero!")
	private BigDecimal preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private CategoriaModel categoria;
	
	

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	

}

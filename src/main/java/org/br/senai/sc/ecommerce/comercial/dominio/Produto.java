package org.br.senai.sc.ecommerce.comercial.dominio;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Produto {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		private Long id;
		
		@NotBlank(message = "O nome não pode ser vazio.")
		@Column(nullable = false)
		private String nome;
		
		private String cor;
		
		@NotNull
		@Column(nullable = false)
		private Double preco;
		
		
		private String descricao;
		
		@ManyToOne(optional = false)
		private Departamento departamento;
		
		@Deprecated
		protected Produto() {}
		
		public Produto(String nome) {
			this.nome = nome;
		}
		
		
		@Override
		public String toString() {
			return "Produto [nome=" + nome + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Produto other = (Produto) obj;
			return Objects.equals(id, other.id);
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
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public Double getPreco() {
			return preco;
		}
		public void setPreco(Double preco) {
			this.preco = preco;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Departamento getDepartamento() {
			return departamento;
		}

		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}
		
		
		
		
		
}

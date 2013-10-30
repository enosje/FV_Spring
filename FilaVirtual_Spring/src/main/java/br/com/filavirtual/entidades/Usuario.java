package br.com.filavirtual.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Usuarios")
public class Usuario {

	@Id
	@Column(name="ID")
	@GeneratedValue
	private long id;
	
	@Column(name="NOME")
	@NotNull
	@Size(min = 4, max = 12, message = "Deve conter entre 4 e 12 caracteres")
	private String nomeUsuario;
	
	@Column(name="SENHA")
	@NotNull
	@Size(min = 6, max = 12, message = "Deve conter entre 6 e 12 caracteres")
	private String senha;

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}

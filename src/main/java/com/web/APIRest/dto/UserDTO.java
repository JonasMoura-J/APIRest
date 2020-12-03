package com.web.APIRest.dto;

import java.io.Serializable;

import com.web.APIRest.domain.Usuario;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String nome;
	
	private String email;
	
	public UserDTO() {
		
	}
	
	public UserDTO(Usuario obj) {
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

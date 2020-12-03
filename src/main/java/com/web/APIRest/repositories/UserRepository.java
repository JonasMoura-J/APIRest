package com.web.APIRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.APIRest.domain.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Integer>{
	
}

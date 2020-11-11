package br.com.xlink.xlink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.xlink.xlink.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
 
	User findByUsername(String username);
	
}
package com.tcg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcg.model.Authorities;

public interface AuthorityRepository extends JpaRepository<Authorities, String> {
	public Authorities findByUsername( String username );
}

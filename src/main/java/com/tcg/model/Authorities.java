package com.tcg.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="authorities")
@Data
public class Authorities {

	@Id
	private String username;
	private String authority;
	
	@JoinColumn(name="username")
	@OneToOne
	private User user;
}

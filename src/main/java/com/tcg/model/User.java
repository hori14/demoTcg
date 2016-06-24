package com.tcg.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="users")
@Data
public class User {

	@Id
	private String username;
	private String password;
	private int enabled;

}

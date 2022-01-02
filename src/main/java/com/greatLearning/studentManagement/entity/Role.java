package com.greatLearning.studentManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//entity class for roles with role_id and name as columns
//use lombak data annotation to create getters,setters and toString method
@Entity
@Table(name = "roles")
@Data
public class Role {
	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	public String getName() {
		return this.name;
	}
}

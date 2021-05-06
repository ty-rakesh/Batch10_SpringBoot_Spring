package com.te.ecom.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;



@Data
@Entity
@Table(name = "admin")
@XmlRootElement(name = "admin")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("admin")
public class Admin implements Serializable{

	@Id
	@Column(name = "a_id")
	private int id;
	
	@Column
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
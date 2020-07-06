package com.guo.test.bean;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -1205226416664488559L;
	
	private Long id;

	private String city = "";
	
	private String name = "";
	
	private int uid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

}

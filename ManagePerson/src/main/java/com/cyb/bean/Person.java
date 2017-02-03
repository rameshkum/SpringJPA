package com.cyb.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the persondetails database table.
 * 
 */
@Entity
@Table(name="persondetails")
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="p_id")
	private int pId;

	@Column(name="p_country")
	private String pCountry;

	@Column(name="p_name")
	private String pName;

	public Person() {
	}

	public int getPId() {
		return this.pId;
	}

	public void setPId(int pId) {
		this.pId = pId;
	}

	public String getPCountry() {
		return this.pCountry;
	}

	public void setPCountry(String pCountry) {
		this.pCountry = pCountry;
	}

	public String getPName() {
		return this.pName;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pCountry=" + pCountry + ", pName=" + pName + "]";
	}

}
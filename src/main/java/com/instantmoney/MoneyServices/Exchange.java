package com.instantmoney.MoneyServices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Exchange {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int idexchange; 
	
	private String e_name;
	
	public Exchange() {}
	
	public int getIdexchange() {
		return idexchange;
	}
	public void setIdexchange(int idexchange) {
		this.idexchange = idexchange;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	
	@Override
	public String toString() {
		return "Exchange [idexchange=" + idexchange + ", e_name=" + e_name + "]";
	} 
	
	

}

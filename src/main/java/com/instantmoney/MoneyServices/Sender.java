package com.instantmoney.MoneyServices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Sender {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idsender;
	
	private String s_first_name; 
	private String s_last_name; 
	private String slocation;
	
	@OneToOne 
	@JoinColumn (name = "idsender")
	private Balance balance;
	
	public int getIdsender() {
		return idsender;
	}
	public void setIdsender(int idsender) {
		this.idsender = idsender;
	}
	public String getS_first_name() {
		return s_first_name;
	}
	public void setS_first_name(String s_first_name) {
		this.s_first_name = s_first_name;
	}
	public String getS_last_name() {
		return s_last_name;
	}
	public void setS_last_name(String s_last_name) {
		this.s_last_name = s_last_name;
	}
	public String getSlocation() {
		return slocation;
	}
	public void setSlocation(String slocation) {
		this.slocation = slocation;
	}
	
	@Override
	public String toString() {
		return "Sender [idsender=" + idsender + ", s_first_name=" + s_first_name + ", s_last_name=" + s_last_name
				+ ", slocation=" + slocation + "]";
	} 
}

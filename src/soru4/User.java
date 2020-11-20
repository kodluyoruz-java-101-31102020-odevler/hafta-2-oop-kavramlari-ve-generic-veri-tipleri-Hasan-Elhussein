package soru4;

import java.util.ArrayList;
import java.util.Date;

public class User {
	
	private String name;
	private String surName;
	private String email;
	private String pass;
	private String meslek;
	private int age;
	private ArrayList<String> adresListesi = new ArrayList<String>();
	private Date sistemeSonGirisTarihi;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}

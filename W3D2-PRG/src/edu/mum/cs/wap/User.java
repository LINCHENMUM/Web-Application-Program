package edu.mum.cs.wap;

public class User {

	
	private double id = Math.random() * 50 + 1;
	
	private String username;

	private String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public double getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

package com.onlyjavatech.priyanka;


public class User {
   
	private String name;
    private String email;
    private String avatarUrl;
    
    
    public User(String name, String email,String avatarUrl) {
		super();
		this.name = name;
		this.email = email;
		this.avatarUrl=avatarUrl;
	}
    
    public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
	
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}


    // Constructors, getters, and setters
}


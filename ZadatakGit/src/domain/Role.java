package domain;

public enum Role {
 ADMIN(1) , EDITOR(2);
	
	private final int role;
	
	
	private Role(int role) {
		this.role = role;
	}


	public int getRole() {
		return role;
	}
	
	
	
	
	
	
}

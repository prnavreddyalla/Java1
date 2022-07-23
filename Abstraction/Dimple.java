package org.tcs.test.login;

public class Dimple extends Sample{ 
	
		
	

	@Override
	public void deposit() {
		System.out.println(23);
		
	}

	@Override
	public void fixed() {
	System.out.println("6%");
		
	}

	@Override
	public void check() {
		System.out.println("5600");
		
		
	}public static void main(String[] args) {
		Dimple d = new Dimple();
		d.deposit();
		d.fixed();
		d.check();
	}

}

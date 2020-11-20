package soru4;

import java.util.ArrayList;

public abstract class Account {
	
	public final void showUserInfo() {
		//shows the user's info
	}
	
	AuthenticationStatus authenticationStatus;
	User user = new User();
	ArrayList kullanicininYaptigiSigortaListesi = new ArrayList();
	
	
	//need to work on the InvalidAuthenticationException error on its class.
	public void login(String email, String pass) throws InvalidAuthenticationException {
		if(user.getEmail().equals(email) && user.getPass().equals(pass)) {
			authenticationStatus = AuthenticationStatus.SUCCESS;
			System.out.println("Loged in Successfully!");
		}
		else {
			authenticationStatus = AuthenticationStatus.FAIL;
			System.out.println("The email or the password is wrong.");
		}
	}
	
	public void loginStatus() {
		System.out.println(authenticationStatus);
	}
	
	
	public abstract void insurancePolicy();
	
	
}

package org.antwalk.classes;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("current")
public class Current implements Account{

	public void showAccount() {
		// TODO Auto-generated method stub
		System.out.println("CURRENT ACCOUNT");
	}

}

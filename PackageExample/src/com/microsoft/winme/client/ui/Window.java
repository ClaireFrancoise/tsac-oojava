package com.microsoft.winme.client.ui;

import com.microsoft.winme.model.ui.User;
//import com.microsoft.winme.server.ui.Window; va in conflitto con la classe corrente

public class Window {
	public static void main(String[] args){
		com.microsoft.winme.server.ui.Window w1 = new com.microsoft.winme.server.ui.Window();
		com.microsoft.winme.model.ui.User user1 = new com.microsoft.winme.model.ui.User();
		user1.setName("Claire");
		user1.setSurname("Formentin");
		
		//secondo esempio
		User user2 = new User();
		user2.setName("A");
		user2.setSurname("B");
	}
	
}

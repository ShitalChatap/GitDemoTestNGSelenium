package com.maveric.git.DatProvider;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
			
		@DataProvider
		public Object[][] getInvalidUsernameorGetInvalidPassword(){
		return new Object[][] {
			{"BalajiPatil8087","Gt@250398"},
			{"GauravTelgu","WrongPassword"}};
		}
		
		@DataProvider
		public Object[][] getValidUsernamePassword(){
			return new Object[][] {{"GauravTelgu","Gt@250398"}};
				
		}
	 
	}



package com.qa.hs.tests;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeyWordEngine;
/**
 * 
 * @author NaveenKhunteta
 *
 */
public class LoginTest {
	
	public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}
	
	@Test
	public void signUpTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("signup");
	}
	
	
	

}
